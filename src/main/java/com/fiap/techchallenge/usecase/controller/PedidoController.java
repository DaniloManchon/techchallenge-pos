package com.fiap.techchallenge.usecase.controller;

import com.fiap.techchallenge.domain.model.Pedido;
import com.fiap.techchallenge.domain.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @PostMapping("/new")
    public ResponseEntity<String> criarPedido(@RequestBody Pedido pedido) {
        try {
            return pedidoService.criarPedido(pedido);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
