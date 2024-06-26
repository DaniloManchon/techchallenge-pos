package com.fiap.techchallenge.adapters.controller.produtos;

import com.fiap.techchallenge.domain.model.produtos.Bebida;
import com.fiap.techchallenge.ports.in.produtos.bebida.BebidaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/bebida")
public class BebidaController {

    @Autowired
    BebidaUseCase bebidaUseCase;

    @PostMapping
    public ResponseEntity<String> criarBebida(@RequestBody Bebida bebida) {
        try {
            return bebidaUseCase.criarBebida(bebida);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Bebida>> listarBebidas() {
        try {
            return bebidaUseCase.listarBebidas();
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{nomeBanco}")
    public ResponseEntity<Bebida> buscarBebidaNome(@PathVariable("nomeBanco") String nomeBanco) {
        try {
            return bebidaUseCase.buscarBebida(nomeBanco);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{nomeBanco}/{tamanho}")
    public ResponseEntity<Bebida> buscarBebidaNomeTamanho(@PathVariable("nomeBanco") String nomeBanco, @PathVariable("tamanho") String tamanho) {
        try {
            return bebidaUseCase.buscarBebidaNomeETamanho(nomeBanco, tamanho);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{nomeBanco}")
    public ResponseEntity atualizarAcompanhamento(@PathVariable("nomeBanco") String nomeBanco, @RequestBody Bebida bebida) {
        try {
            return bebidaUseCase.atualizarBebida(nomeBanco, bebida);
        } catch (Exception e) {
            return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{nomeBanco}")
    public ResponseEntity apagarBebida(@PathVariable("nomeBanco") String nomeBanco) {
        try {
            return bebidaUseCase.apagarBebida(nomeBanco);
        } catch (Exception e) {
            return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
