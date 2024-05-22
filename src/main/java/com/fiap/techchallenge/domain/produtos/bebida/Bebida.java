package com.fiap.techchallenge.domain.produtos.bebida;

import com.fiap.techchallenge.domain.produtos.Produto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Bebida extends Produto {
    private String tamanho;
    public Bebida(String nome, String nomeBanco, String descricao, float preco, String tamanho) {
        super(nome, nomeBanco, descricao, preco);
        this.tamanho = tamanho;
    }
}
