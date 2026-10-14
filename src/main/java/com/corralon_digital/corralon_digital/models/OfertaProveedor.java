package com.corralon_digital.corralon_digital.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity 
@Table (name = " oferta_proveedor")
public class OfertaProveedor {
@Column (name = "id_oferta")
private Long id_oferta;
@Column (name = "id_empresa_proveedor")
private Empresa id_empresa_proveedor;
@Column (name = "id_producto")
private Producto id_producto;
@Column (name = "precio")
private double precio;
@Column (name = "stock")
private int stock;
@Column (name = "stock_actualizado_en")
private LocalDateTime stock_actualizado_en;
@Column (name = "activo")
private Boolean activo;
public OfertaProveedor() {
}
public OfertaProveedor(Long id_oferta, Empresa id_empresa_proveedor, Producto id_producto, double precio, int stock,
        LocalDateTime stock_actualizado_en, Boolean activo) {
    this.id_oferta = id_oferta;
    this.id_empresa_proveedor = id_empresa_proveedor;
    this.id_producto = id_producto;
    this.precio = precio;
    this.stock = stock;
    this.stock_actualizado_en = stock_actualizado_en;
    this.activo = activo;
}
public Long getId_oferta() {
    return id_oferta;
}
public void setId_oferta(Long id_oferta) {
    this.id_oferta = id_oferta;
}
public Empresa getId_empresa_proveedor() {
    return id_empresa_proveedor;
}
public void setId_empresa_proveedor(Empresa id_empresa_proveedor) {
    this.id_empresa_proveedor = id_empresa_proveedor;
}
public Producto getId_producto() {
    return id_producto;
}
public void setId_producto(Producto id_producto) {
    this.id_producto = id_producto;
}
public double getPrecio() {
    return precio;
}
public void setPrecio(double precio) {
    this.precio = precio;
}
public int getStock() {
    return stock;
}
public void setStock(int stock) {
    this.stock = stock;
}
public LocalDateTime getStock_actualizado_en() {
    return stock_actualizado_en;
}
public void setStock_actualizado_en(LocalDateTime stock_actualizado_en) {
    this.stock_actualizado_en = stock_actualizado_en;
}
public Boolean getActivo() {
    return activo;
}
public void setActivo(Boolean activo) {
    this.activo = activo;
}
    
}