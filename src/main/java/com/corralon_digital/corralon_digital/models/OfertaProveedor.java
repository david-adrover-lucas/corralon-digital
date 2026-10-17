package com.corralon_digital.corralon_digital.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
@Table(name = "oferta_proveedor")
public class OfertaProveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oferta")
    private Long id_oferta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa_proveedor")
    private Empresa empresaProveedor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Column(name = "precio", precision = 14, scale = 2)
    private BigDecimal precio;

    @Column(name = "stock", precision = 14, scale = 4)
    private BigDecimal stock;

    @Column(name = "stock_actualizado_en")
    private LocalDateTime stock_actualizado_en;

    @Column(name = "activo")
    private Boolean activo;

    public OfertaProveedor() {
    }

    public OfertaProveedor(Empresa empresaProveedor, Producto producto, BigDecimal precio, BigDecimal stock, LocalDateTime stock_actualizado_en, Boolean activo) {
        this.empresaProveedor = empresaProveedor;
        this.producto = producto;
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

    public Empresa getEmpresaProveedor() {
        return empresaProveedor;
    }

    public void setEmpresaProveedor(Empresa empresaProveedor) {
        this.empresaProveedor = empresaProveedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
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
