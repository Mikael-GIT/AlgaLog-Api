package com.algaworks.algalog.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.algaworks.algalog.domain.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        Cliente cliente = new Cliente(1L, "Mikael", "mikaeltavares123@hotmaail.com", "21971973573");
        Cliente cliente2 = new Cliente(2L, "Bia", "mikaeltavares123@hotmaail.com", "21971973573");
        return Arrays.asList(cliente, cliente2);
    }
}