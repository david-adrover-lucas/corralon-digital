package com.corralon_digital.corralon_digital.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity 
@Table (name = "producto")
public class Producto {
@Column (name = "id_producto")
private Long id_producto;
@Column (name = "nombre")
private String nombre;
@Column (name = "descripcion")
private String descripcion;
@Column (name = "marca")
private String marca;
@Column (name = "id_categoria")
private CategoriaMaterial id_categoria;
@Column (name = "id_unidad")
private UnidadMedida id_unidad;
public Producto() {
}
public Producto(Long id_producto, String nombre, String descripcion, String marca, CategoriaMaterial id_categoria,
        UnidadMedida id_unidad) {
    this.id_producto = id_producto;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.marca = marca;
    this.id_categoria = id_categoria;
    this.id_unidad = id_unidad;
}
public Long getId_producto() {
    return id_producto;
}
public void setId_producto(Long id_producto) {
    this.id_producto = id_producto;
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
public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public CategoriaMaterial getId_categoria() {
    return id_categoria;
}
public void setId_categoria(CategoriaMaterial id_categoria) {
    this.id_categoria = id_categoria;
}
public UnidadMedida getId_unidad() {
    return id_unidad;
}
public void setId_unidad(UnidadMedida id_unidad) {
    this.id_unidad = id_unidad;
}

    
}