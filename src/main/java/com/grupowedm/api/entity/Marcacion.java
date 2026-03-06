package com.grupowedm.api.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Marcacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Empleado empleado;

    @ManyToOne
    private Op op;

    @ManyToOne
    private Item item;

    private String estado;

    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;

    public Marcacion(){}
}