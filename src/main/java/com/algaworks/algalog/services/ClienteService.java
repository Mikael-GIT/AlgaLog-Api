package com.algaworks.algalog.services;

import java.util.List;

import com.algaworks.algalog.domain.Cliente;
import com.algaworks.algalog.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public List<Cliente> findByNome(String nome){
        return clienteRepository.findByNome(nome);
    }
}