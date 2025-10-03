package com.backend.aulas.dto;

import java.util.List;
import java.util.UUID;

public class ProdutoDTO {
    private UUID id;
    private String nome;
    private float preco;
    private List<UUID> clientesIds;

    public ProdutoDTO() {}

    public ProdutoDTO(UUID id, String nome, float preco, List<UUID> clientesIds) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.clientesIds = clientesIds;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public float getPreco() { return preco; }
    public void setPreco(float preco) { this.preco = preco; }

    public List<UUID> getClientesIds() { return clientesIds; }
    public void setClientesIds(List<UUID> clientesIds) { this.clientesIds = clientesIds; }
}