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
@Table(name = "item_lista")
public class ItemLista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item_lista")
    private Long id_item_lista;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lista")
    private ListaMateriales lista;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Column(name = "cantidad", precision = 14, scale = 4)
    private BigDecimal cantidad;

    @Column(name = "observaciones")
    private String observaciones;

    public ItemLista() {
    }

public ItemLista(ListaMateriales lista, Producto producto, BigDecimal cantidad, String observaciones) {
        this.lista = lista;
        this.producto = producto;
        this.cantidad = cantidad;
        this.observaciones = observaciones;
    }

    public Long getId_item_lista() {
        return id_item_lista;
    }

    public void setId_item_lista(Long id_item_lista) {
        this.id_item_lista = id_item_lista;
    }

    public ListaMateriales getLista() {
        return lista;
    }

    public void setLista(ListaMateriales lista) {
        this.lista = lista;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
