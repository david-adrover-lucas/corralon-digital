package com.corralon_digital.corralon_digital.models;

import java.math.BigDecimal;

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
@Table(name = "item_orden")
public class ItemOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item_orden")
    private Long id_item_orden;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_orden")
    private OrdenProveedor orden;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Column(name = "cantidad", precision = 14, scale = 4)
    private BigDecimal cantidad;

    @Column(name = "precio_unitario", precision = 14, scale = 2)
    private BigDecimal precio_unitario;

    @Column(name = "subtotal", precision = 14, scale = 2)
    private BigDecimal subtotal;

    public ItemOrden() {
    }

    public ItemOrden(OrdenProveedor orden, Producto producto, BigDecimal cantidad, BigDecimal precio_unitario, BigDecimal subtotal) {
        this.orden = orden;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.subtotal = subtotal;
    }

    public Long getId_item_orden() {
        return id_item_orden;
    }

    public void setId_item_orden(Long id_item_orden) {
        this.id_item_orden = id_item_orden;
    }

    public OrdenProveedor getOrden() {
        return orden;
    }

    public void setOrden(OrdenProveedor orden) {
        this.orden = orden;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(BigDecimal precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

}
