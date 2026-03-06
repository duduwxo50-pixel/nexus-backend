package com.grupowedm.api.entity;

import jakarta.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    public Item(){}

    public Long getId(){ return id; }

    public String getNombre(){ return nombre; }

    public void setNombre(String nombre){ this.nombre = nombre; }
}