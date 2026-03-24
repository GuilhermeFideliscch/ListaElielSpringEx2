package com.example.Produto.services;

import com.example.Produto.models.ProdutoModel;
import com.example.Produto.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoModel criarProduto(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public List<ProdutoModel> findAll(){
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel> findById(Long id){
        return produtoRepository.findById(id);
    }

    public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
    }

}
