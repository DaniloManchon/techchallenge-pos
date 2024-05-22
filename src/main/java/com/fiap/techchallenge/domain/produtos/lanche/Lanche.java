package com.fiap.techchallenge.domain.produtos.lanche;

import com.fiap.techchallenge.domain.produtos.Produto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Lanche extends Produto {
    public Lanche(String nome, String nomeBanco, String descricao, float preco) {
        super(nome, nomeBanco, descricao, preco);
    }
}
