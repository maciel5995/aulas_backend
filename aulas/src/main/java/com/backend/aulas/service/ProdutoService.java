package com.backend.aulas.service;

import com.backend.aulas.models.Produto;
import com.backend.aulas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Produto listarUmProduto(UUID id){
        return produtoRepository.findById(id).get();
    }

    public Produto cadastrarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto atualizarProduto(UUID id, Produto produto){
        Produto existente = produtoRepository.findById(id).get();
        existente.setNome(produto.getNome());
        existente.setPreco(produto.getPreco());
        return produtoRepository.save(existente);
    }

    public Produto deletarProduto(UUID id){
        Produto existente = produtoRepository.findById(id).get();
        produtoRepository.delete(existente);
        return existente;
    }

    public List<Produto> listarPeloNome(String nome){
        return produtoRepository.findByNome(nome);
    }

    public List<Produto> listarPrecoDesconhecido(){
        return produtoRepository.findByUnknownPrice();
    }
}
