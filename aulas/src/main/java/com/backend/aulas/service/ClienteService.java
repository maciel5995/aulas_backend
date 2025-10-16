package com.backend.aulas.service;

import com.backend.aulas.dto.ClienteDTO;
import com.backend.aulas.dto.ClienteResumoDTO;
import com.backend.aulas.dto.ProdutoDTO;
import com.backend.aulas.models.Cliente;
import com.backend.aulas.models.Produto;
import com.backend.aulas.repository.ClienteRepository;
import com.backend.aulas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.*;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    // 🔄 Converte Entidade → DTO
    private ClienteDTO toDTO(Cliente cliente) {
        List<ProdutoDTO> produtosDTO = cliente.getProdutos()
                .stream()
                .map(this::produtoToDTO)
                .collect(Collectors.toList());

        return new ClienteDTO(
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail(),
                produtosDTO
        );
    }

    // 🔄 Converte DTO → Entidade
    private Cliente toEntity(ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());

        if (dto.getProdutos() != null) {
            List<Produto> produtos = dto.getProdutos()
                    .stream()
                    .map(p -> produtoRepository.findById(p.getId()).orElse(null))
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            cliente.setProdutos(produtos);
        }

        return cliente;
    }

    // 🔁 Conversão auxiliar para Produto
    private ProdutoDTO produtoToDTO(Produto produto) {
        List<ClienteResumoDTO> clientesResumo = produto.getClientes()
                .stream()
                .map(c -> new ClienteResumoDTO(c.getId(), c.getNome()))
                .collect(Collectors.toList());

        return new ProdutoDTO(produto.getId(), produto.getNome(), produto.getPreco(), clientesResumo);
    }

    //  CRUD básico
    public List<ClienteDTO> listarTodos() {
        return clienteRepository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public Page<Cliente> listarPaginado(String nomeFiltro, Pageable pageable) {
        if (nomeFiltro == null || nomeFiltro.isBlank()) {
            return clienteRepository.findAll(pageable);
        }
        return clienteRepository.findByNomeContainingIgnoreCase(nomeFiltro, pageable);
    }

    public ClienteDTO buscarPorId(UUID id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        return toDTO(cliente);
    }

    public ClienteDTO salvar(ClienteDTO dto) {
        Cliente cliente = toEntity(dto);
        Cliente salvo = clienteRepository.save(cliente);
        return toDTO(salvo);
    }

    public ClienteDTO atualizar(UUID id, ClienteDTO dto) {
        Cliente existente = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        existente.setNome(dto.getNome());
        existente.setEmail(dto.getEmail());
        if (dto.getProdutos() != null) {
            List<Produto> produtos = dto.getProdutos()
                    .stream()
                    .map(p -> produtoRepository.findById(p.getId()).orElse(null))
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            existente.setProdutos(produtos);
        }

        return toDTO(clienteRepository.save(existente));
    }

    public void deletar(UUID id) {
        clienteRepository.deleteById(id);
    }
}