package com.backend.aulas.dto;

import java.util.List;
import java.util.UUID;

public class ClienteDTO {
    private UUID id;
    private String nome;
    private String email;
    private List<ProdutoDTO> produtos;

    public ClienteDTO() {}

    public ClienteDTO(UUID id, String nome, String email, List<ProdutoDTO> produtos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.produtos = produtos;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<ProdutoDTO> getProdutos() { return produtos; }
    public void setProdutos(List<ProdutoDTO> produtos) { this.produtos = produtos; }
}
