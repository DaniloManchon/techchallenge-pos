package com.fiap.techchallenge.domain.produtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Produto {

    @Id
    private String id;
    private String nome;

    @JsonProperty("nome_banco")
    //nome do produto em snake case para facilitar buscas no banco de dados
    private String nomeBanco;

    private String descricao;
    private float preco;

    public Produto(String nome, String nomeBanco, String descricao, float preco) {
        this.nome = nome;
        this.nomeBanco = nomeBanco;
        this.descricao = descricao;
        this.preco = preco;
    }
}