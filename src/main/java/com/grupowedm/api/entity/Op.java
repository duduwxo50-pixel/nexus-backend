package com.grupowedm.api.entity;

import jakarta.persistence.*;

@Entity
public class Op {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;

    public Op(){}

    public Long getId(){ return id; }

    public String getNumero(){ return numero; }

    public void setNumero(String numero){ this.numero = numero; }
}