package com.algaworks.algalog.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Ocorrencia {
    
    private Long id;
    private String descricao;
    private LocalDateTime dataRegistro;
}