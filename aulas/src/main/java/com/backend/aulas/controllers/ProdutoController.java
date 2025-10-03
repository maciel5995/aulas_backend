package com.backend.aulas.controllers;

import com.backend.aulas.models.Produto;
import com.backend.aulas.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<Produto>> listar() {
        List<Produto> produtos = produtoService.listarProdutos();
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> listarUm(@PathVariable UUID id) {
        return ResponseEntity.ok(produtoService.listarUmProduto(id));
    }

    @PostMapping
    public ResponseEntity<Produto> cadastrar(@Valid @RequestBody Produto produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.cadastrarProduto(produto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable UUID id, @Valid @RequestBody Produto produto) {
        return ResponseEntity.ok(produtoService.atualizarProduto(id, produto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Produto> deletar(@PathVariable UUID id) {
        return ResponseEntity.ok(produtoService.deletarProduto(id));
    }

    @GetMapping("/nome")
    public ResponseEntity<List<Produto>> buscarPeloNome(@RequestParam String nome){
        return ResponseEntity.ok(produtoService.listarPeloNome(nome));
    }

    @GetMapping("/produto-desconhecido")
    public ResponseEntity<List<Produto>> buscarPrecoDesconhecido(){
        return ResponseEntity.ok(produtoService.listarPrecoDesconhecido());
    }
}
