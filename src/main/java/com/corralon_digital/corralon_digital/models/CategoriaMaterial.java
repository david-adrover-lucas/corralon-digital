package com.corralon_digital.corralon_digital.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria_material")
public class CategoriaMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long id_categoria;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria_padre")
    private CategoriaMaterial categoria_padre;

    public CategoriaMaterial() {
    }

    public CategoriaMaterial(String nombre, String descripcion, CategoriaMaterial categoria_padre) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria_padre = categoria_padre;
    }

    public Long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CategoriaMaterial getCategoria_padre() {
        return categoria_padre;
    }

    public void setCategoria_padre(CategoriaMaterial categoria_padre) {
        this.categoria_padre = categoria_padre;
    }

}
