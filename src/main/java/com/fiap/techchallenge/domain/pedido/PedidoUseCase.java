package com.fiap.techchallenge.domain.pedido;

import com.fiap.techchallenge.domain.statemachine.EstadoPedido;
import com.fiap.techchallenge.domain.statemachine.EventoPedido;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PedidoUseCase {
    ResponseEntity<String> criarPedido(Pedido pedido);
    ResponseEntity<Pedido> buscarPedido(long sequencia);
    ResponseEntity<String> pagarPedido(long sequencia);
    ResponseEntity<String> atualizarEstadoPedido(long sequencia, EventoPedido eventoPedido);
    ResponseEntity<List<Pedido>> listarPedidoEstado(EstadoPedido estadoPedido);
}
