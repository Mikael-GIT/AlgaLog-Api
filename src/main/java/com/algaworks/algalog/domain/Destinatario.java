package com.algaworks.algalog.domain;

import lombok.Data;

@Data
public class Destinatario {
    
    private Long id;
    private String nome;
    private String numero;
    private String complemento;
    private String bairro;
}