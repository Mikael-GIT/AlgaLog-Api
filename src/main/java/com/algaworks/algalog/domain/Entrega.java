package com.algaworks.algalog.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.algaworks.algalog.domain.enums.StatusEntrega;

import lombok.Data;

@Data
public class Entrega {
    
    private BigDecimal taxa;
    private LocalDateTime dataPedido;
    private LocalDateTime dataFinalizacao;
    private Cliente cliente;
    private Destinatario destinatario;
    private StatusEntrega statusEntrega;
    private Ocorrencia ocorrencia;
}