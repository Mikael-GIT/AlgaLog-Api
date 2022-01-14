package com.algaworks.algalog.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Destinatario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    @OneToOne(mappedBy = "destinatario")
    private Entrega entrega;


    public Destinatario() {
    }

    public Destinatario(Long id, String nome, String logradouro, String numero, String complemento, String bairro, Entrega entrega) {
        this.id = id;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.entrega = entrega;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Destinatario)) {
            return false;
        }
        Destinatario destinatario = (Destinatario) o;
        return Objects.equals(id, destinatario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}