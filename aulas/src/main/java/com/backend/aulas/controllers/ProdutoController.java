package com.backend.aulas.controllers;

import com.backend.aulas.dto.ProdutoDTO;
import com.backend.aulas.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    // Listar todos os produtos
    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> listarTodos() {
        return ResponseEntity.ok(produtoService.listarTodos());
    }

    // Buscar produto por ID
    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> buscarPorId(@PathVariable UUID id) {
        ProdutoDTO produto = produtoService.buscarPorId(id);
        return ResponseEntity.ok(produto);
    }

    // Cadastrar novo produto
    @PostMapping
    public ResponseEntity<ProdutoDTO> salvar(@RequestBody ProdutoDTO produtoDTO) {
        ProdutoDTO salvo = produtoService.salvar(produtoDTO);
        return ResponseEntity.ok(salvo);
    }

    // Atualizar produto
    @PutMapping("/{id}")
    public ResponseEntity<ProdutoDTO> atualizar(@PathVariable UUID id, @RequestBody ProdutoDTO produtoDTO) {
        ProdutoDTO atualizado = produtoService.atualizar(id, produtoDTO);
        return ResponseEntity.ok(atualizado);
    }

    // Deletar produto
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        produtoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}