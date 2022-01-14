package com.algaworks.algalog.controller;

import java.util.List;

import com.algaworks.algalog.domain.Cliente;
import com.algaworks.algalog.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> listar(){
        return ResponseEntity.ok().body(clienteService.findAll());
    }
}