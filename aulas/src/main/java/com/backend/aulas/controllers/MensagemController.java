package com.backend.aulas.controllers;

import com.backend.aulas.models.Mensagem;
import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class MensagemController {

    private List<Mensagem> mensagens = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Mensagem>> listar(){
        if(mensagens.isEmpty()){
            return ResponseEntity.noContent().build(); // 204 se não houver mensagens
        }
        return ResponseEntity.ok(mensagens); // 200 + lista de mensagens em JSON
    }

    @PostMapping
    public ResponseEntity<Mensagem> adicionar(@RequestBody Mensagem mensagem){
        mensagens.add(mensagem);
        return ResponseEntity.status(HttpStatus.CREATED).body(mensagem); // 201 + mensagem em JSON
    }

    @PutMapping("/{index}")
    public ResponseEntity<Mensagem> atualizar(@PathVariable int index, @RequestBody Mensagem mensagem){
        if(index >= 0 && index < mensagens.size()){
            mensagens.set(index, mensagem);
            return ResponseEntity.ok(mensagem); // 200 OK + mensagem atualizada
        }
        return ResponseEntity.notFound().build(); // 404 sem o body
    }

    @DeleteMapping("/{index}")
    public ResponseEntity<Mensagem> remover(@PathVariable int index) {
        if (index >= 0 && index < mensagens.size()) {
            Mensagem removida = mensagens.remove(index);
            return ResponseEntity.ok(removida); // 200 OK + mensagem removida
        }
        return ResponseEntity.notFound().build(); // 404 sem o body
    }

    @GetMapping("/{index}")
    public ResponseEntity<Mensagem> buscarPorId(@PathVariable int index){
        if(index >= 0 && index < mensagens.size()) {
            return ResponseEntity.ok(mensagens.get(index));
        }
        return ResponseEntity.notFound().build();
    }

}
