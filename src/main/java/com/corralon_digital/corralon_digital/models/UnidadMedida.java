package com.corralon_digital.corralon_digital.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "unidad_medida")
public class UnidadMedida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_unidad")
    private Long id_unidad;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "abreviatura")
    private String abreviatura;

    public UnidadMedida() {
    }

public UnidadMedida(String nombre, String abreviatura) {
        this.nombre = nombre;
        this.abreviatura = abreviatura;
    }

    public Long getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(Long id_unidad) {
        this.id_unidad = id_unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

}
