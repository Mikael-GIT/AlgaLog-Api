package com.algaworks.algalog.config;

import java.util.Arrays;

import com.algaworks.algalog.domain.Cliente;
import com.algaworks.algalog.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void run(String... args) throws Exception {
        Cliente cliente1 = new Cliente(null, "Mikael Tavares", "mikael12938@gmail.com", "2197238423");
        Cliente cliente2 = new Cliente(null, "Maria Souza", "maria938@gmail.com", "2192382382");
        clienteRepository.saveAll(Arrays.asList(cliente1, cliente2));
    }
}