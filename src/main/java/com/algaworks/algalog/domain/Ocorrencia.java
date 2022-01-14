package com.algaworks.algalog.domain;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Ocorrencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private LocalDateTime dataRegistro;
    @ManyToOne
    @JoinColumn(name = "entrega_id")
    private Entrega entrega;


    public Ocorrencia() {
    }


    public Ocorrencia(Long id, String descricao, LocalDateTime dataRegistro, Entrega entrega) {
        this.id = id;
        this.descricao = descricao;
        this.dataRegistro = dataRegistro;
        this.entrega = entrega;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Ocorrencia)) {
            return false;
        }
        Ocorrencia ocorrencia = (Ocorrencia) o;
        return Objects.equals(id, ocorrencia.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


}