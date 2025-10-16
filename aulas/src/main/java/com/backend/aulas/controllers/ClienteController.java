package com.backend.aulas.controllers;


import com.backend.aulas.dto.ClienteDTO;
import com.backend.aulas.models.Cliente;
import com.backend.aulas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "http://localhost:3000") // apenas esse front-end
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // métodos...

    // Listar todos os clientes
    @GetMapping
    public ResponseEntity<List<ClienteDTO>> listarTodos() {
        return ResponseEntity.ok(clienteService.listarTodos());
    }

    @GetMapping("/paginado")
    public Page<Cliente> listarPaginado(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "nome") String sortBy,
            @RequestParam(defaultValue = "asc") String direction,
            @RequestParam(required = false) String nomeFiltro
    ) {
        Sort sort = direction.equalsIgnoreCase("desc")
                ? Sort.by(sortBy).descending()
                : Sort.by(sortBy).ascending();
        Pageable pageable = PageRequest.of(page, size, sort);
        return clienteService.listarPaginado(nomeFiltro, pageable);
    }

    // Buscar cliente por ID
    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> buscarPorId(@PathVariable UUID id) {
        ClienteDTO cliente = clienteService.buscarPorId(id);
        return ResponseEntity.ok(cliente);
    }

    // Cadastrar novo cliente
    @PostMapping
    public ResponseEntity<ClienteDTO> salvar(@RequestBody ClienteDTO clienteDTO) {
        ClienteDTO salvo = clienteService.salvar(clienteDTO);
        return ResponseEntity.ok(salvo);
    }

    // Atualizar cliente existente
    @PutMapping("/{id}")
    public ResponseEntity<ClienteDTO> atualizar(@PathVariable UUID id, @RequestBody ClienteDTO clienteDTO) {
        ClienteDTO atualizado = clienteService.atualizar(id, clienteDTO);
        return ResponseEntity.ok(atualizado);
    }

    // Deletar cliente
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        clienteService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}