package com.corralon_digital.corralon_digital.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "categoria_material")
public class CategoriaMaterial {
@Id    
@Column (name = "id_categoria")
@GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
private Long id_categoria;
@Column (name = "nombre")
private String nombre;
@Column (name = "descripcion")
private String descripcion;
@Column (name = "id_categoria_padre")
private CategoriaMaterial id_categoria_padre;
public CategoriaMaterial() {
}
public CategoriaMaterial(Long id_categoria, String nombre, String descripcion, CategoriaMaterial id_categoria_padre) {
    this.id_categoria = id_categoria;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.id_categoria_padre = id_categoria_padre;
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
public CategoriaMaterial getId_categoria_padre() {
    return id_categoria_padre;
}
public void setId_categoria_padre(CategoriaMaterial id_categoria_padre) {
    this.id_categoria_padre = id_categoria_padre;
}

    
}