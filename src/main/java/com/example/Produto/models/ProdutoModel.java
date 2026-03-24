package com.example.Produto.models;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_produto")

public class ProdutoModel {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    @Column(name = "valorItem")
    private BigDecimal preco;
    @Column(name = "numeroEstoque")
    private Integer estoque;

    public ProdutoModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
}
