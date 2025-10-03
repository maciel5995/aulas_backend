package com.backend.aulas.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

//    @ManyToMany
//    @JoinTable(
//            name = "cliente_produto",
//            joinColumns = @JoinColumn(name = "cliente_id"),
//            inverseJoinColumns = @JoinColumn(name = "produto_id")
//    )
//    private List<Produto> produtos;

    public Cliente() {}

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Long getId() { return id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

//    public List<Produto> getProdutos() { return produtos; }
//
//    public void setProdutos(List<Produto> produtos) { this.produtos = produtos; }
}