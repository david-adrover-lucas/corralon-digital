package com.corralon_digital.corralon_digital.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@Entity 
@Table (name = "rol")
public class Rol {
    @Column (name = "id_rol")
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id_rol;
    @Column (name = "nombre")
    private String nombre;

    public Rol() {
    }

    public Rol(Long id_rol, String nombre) {
        this.id_rol = id_rol;
        this.nombre = nombre;
    }

    public Long getId_rol() {
        return id_rol;
    }

    public void setId_rol(Long id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}