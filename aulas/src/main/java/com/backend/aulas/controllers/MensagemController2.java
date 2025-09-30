package com.backend.aulas.controllers;

import com.backend.aulas.models.Mensagem;
import com.backend.aulas.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mensagens")
public class MensagemController2 {
    @Autowired
    private MensagemService mensagemService;

    @GetMapping
    public ResponseEntity<List<Mensagem>> listar() {
        List<Mensagem> mensagens = mensagemService.listar();
        if (mensagens.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(mensagens);
    }

    @PostMapping
    public ResponseEntity<Mensagem> adicionar(@RequestBody Mensagem mensagem) {
        Mensagem novaMensagem = mensagemService.adicionar(mensagem);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaMensagem);
    }

    @PutMapping("/{index}")
    public ResponseEntity<Mensagem> atualizar(@PathVariable int index, @RequestBody Mensagem mensagem) {
        Mensagem atualizada = mensagemService.atualizar(index, mensagem);
        if (atualizada != null) {
            return ResponseEntity.ok(mensagemService.atualizar(index, mensagem));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{index}")
    public ResponseEntity<Mensagem> remover(@PathVariable int index) {
        Mensagem removida = mensagemService.remover(index);
        if (removida != null) {
            return ResponseEntity.ok(removida);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{index}")
    public ResponseEntity<Mensagem> buscarPorId(@PathVariable int index) {
        Mensagem encontrada = mensagemService.buscarPorId(index);
        if (encontrada != null) {
            return ResponseEntity.ok(encontrada);
        }
        return ResponseEntity.notFound().build();
    }
}
