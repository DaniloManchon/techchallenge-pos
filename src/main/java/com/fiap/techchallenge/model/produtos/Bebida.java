package com.fiap.techchallenge.model.produtos;

import com.fiap.techchallenge.model.Produto;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "bebida")
public class Bebida extends Produto {

    public Bebida(Long id, String nome, String descricao, float preco) {
        super(id, nome, descricao, preco);
    }
}
