package com.algaworks.algalog.services;

import java.util.List;
import java.util.Optional;

import com.algaworks.algalog.domain.Cliente;
import com.algaworks.algalog.domain.exceptions.NotFoundException;
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

    public Cliente findById(Long id){
        Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new NotFoundException("Cliente não encontrado."));
        return cliente;
    }

    public Cliente insert(Cliente cliente){
        Cliente obj = clienteRepository.save(cliente);
        return obj;
    }

    public Cliente update(Cliente cliente){
        findById(cliente.getId());
        Cliente obj = clienteRepository.save(cliente);
        return obj;
    }

    public void delete(Long id){
        Cliente cliente = findById(id);
        clienteRepository.delete(cliente);
    }
}