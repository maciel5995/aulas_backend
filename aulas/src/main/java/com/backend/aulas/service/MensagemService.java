package com.backend.aulas.service;

import com.backend.aulas.models.Mensagem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MensagemService {
    private List<Mensagem> mensagens = new ArrayList<>();

    public List<Mensagem> listar() {
        return mensagens;
    }

    public Mensagem adicionar(Mensagem mensagem) {
        mensagens.add(mensagem);
        return mensagem;
    }

    public Mensagem atualizar(int index, Mensagem mensagem) {
        if (index >= 0 && index < mensagens.size()) {
            mensagens.set(index, mensagem);
            return mensagem;
        }
        return null; // Retorna null se não encontrar
    }

    public Mensagem remover(int index) {
        if (index >= 0 && index < mensagens.size()) {
            return mensagens.remove(index);
        }
        return null; // Retorna null se não encontrar
    }

    public Mensagem buscarPorId(int index) {
        if (index >= 0 && index < mensagens.size()) {
            return mensagens.get(index);
        }
        return null; // Retorna null se não encontrar
    }
}
