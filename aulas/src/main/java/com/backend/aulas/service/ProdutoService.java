package com.backend.aulas.service;

import com.backend.aulas.dto.ClienteResumoDTO;
import com.backend.aulas.dto.ProdutoDTO;
import com.backend.aulas.models.Cliente;
import com.backend.aulas.models.Produto;
import com.backend.aulas.repository.ClienteRepository;
import com.backend.aulas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    // 🔄 Entidade → DTO
    private ProdutoDTO toDTO(Produto produto) {
        List<ClienteResumoDTO> clientesResumo = produto.getClientes()
                .stream()
                .map(c -> new ClienteResumoDTO(c.getId(), c.getNome()))
                .collect(Collectors.toList());

        return new ProdutoDTO(produto.getId(), produto.getNome(), produto.getPreco(), clientesResumo);
    }

    // 🔄 DTO → Entidade
    private Produto toEntity(ProdutoDTO dto) {
        Produto produto = new Produto();
        produto.setNome(dto.getNome());
        produto.setPreco(dto.getPreco());

        if (dto.getClientes() != null) {
            List<Cliente> clientes = dto.getClientes()
                    .stream()
                    .map(c -> clienteRepository.findById(c.getId()).orElse(null))
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            produto.setClientes(clientes);
        }

        return produto;
    }

    // CRUD básico
    public List<ProdutoDTO> listarTodos() {
        return produtoRepository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public ProdutoDTO buscarPorId(UUID id) {
        Produto produto = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        return toDTO(produto);
    }

    public ProdutoDTO salvar(ProdutoDTO dto) {
        Produto produto = toEntity(dto);
        Produto salvo = produtoRepository.save(produto);
        return toDTO(salvo);
    }

    public ProdutoDTO atualizar(UUID id, ProdutoDTO dto) {
        Produto existente = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        existente.setNome(dto.getNome());
        existente.setPreco(dto.getPreco());

        if (dto.getClientes() != null) {
            List<Cliente> clientes = dto.getClientes()
                    .stream()
                    .map(c -> clienteRepository.findById(c.getId()).orElse(null))
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            existente.setClientes(clientes);
        }

        return toDTO(produtoRepository.save(existente));
    }

    public void deletar(UUID id) {
        produtoRepository.deleteById(id);
    }
}
