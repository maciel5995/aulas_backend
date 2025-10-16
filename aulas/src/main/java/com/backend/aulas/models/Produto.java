package com.backend.aulas.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;
    private float preco;

    @ManyToMany(mappedBy = "produtos")
    @JsonIgnoreProperties("produtos")
    private List<Cliente> clientes = new ArrayList<>();
    // Construtores e métodos get e set

    public Produto(){}

    public Produto(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }
    // métodos geters e seter abaixo:
    public UUID getId() { return id; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public List<Cliente> getClientes() { return clientes; }

    public void setClientes(List<Cliente> clientes) { this.clientes = clientes; }
}
