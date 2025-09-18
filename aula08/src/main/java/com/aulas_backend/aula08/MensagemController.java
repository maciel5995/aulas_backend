package com.aulas_backend.aula08;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {

    private List<String> mensagens = new ArrayList<>();

    @GetMapping
    public List<String> listar(){
        return mensagens;
    }

    @PostMapping
    public String adicionar(@RequestBody String mensagem){
        mensagens.add(mensagem);
        return mensagem + " adicionada!";
    }

    @PutMapping("/{index}")
    public String atualizar(@PathVariable int index, @RequestBody String mensagem) {
        if (index >= 0 && index < mensagens.size()) {
            mensagens.set(index, mensagem);
            return "mensagem atualizada com sucesso!";
        }
        return "Índice inválido ou array vazio";
    }

    @DeleteMapping("/{index}")
    public String deletar(@PathVariable int index){
        if(index >= 0 && index < mensagens.size()){
            mensagens.remove(index);
            return "mensagem removida com sucesso!";
        }
        return "Índice inválido ou array vazio";
    }
}
