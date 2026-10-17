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
@Table(name = "item_cotizacion")
public class ItemCotizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item_cotizacion")
    private Long id_item_cotizacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cotizacion")
    private CotizacionProveedor cotizacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_item_lista")
    private ItemLista itemLista;

    @Column(name = "cantidad_cotizada", precision = 14, scale = 4)
    private BigDecimal cantidad_cotizada;

    @Column(name = "precio_unitario", precision = 14, scale = 2)
    private BigDecimal precio_unitario;

    @Column(name = "subtotal_item", precision = 14, scale = 2)
    private BigDecimal subtotal_item;

    public ItemCotizacion() {
    }

public ItemCotizacion(CotizacionProveedor cotizacion, ItemLista itemLista, BigDecimal cantidad_cotizada, BigDecimal precio_unitario, BigDecimal subtotal_item) {
        this.cotizacion = cotizacion;
        this.itemLista = itemLista;
        this.cantidad_cotizada = cantidad_cotizada;
        this.precio_unitario = precio_unitario;
        this.subtotal_item = subtotal_item;
    }

    public Long getId_item_cotizacion() {
        return id_item_cotizacion;
    }

    public void setId_item_cotizacion(Long id_item_cotizacion) {
        this.id_item_cotizacion = id_item_cotizacion;
    }

    public CotizacionProveedor getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(CotizacionProveedor cotizacion) {
        this.cotizacion = cotizacion;
    }

    public ItemLista getItemLista() {
        return itemLista;
    }

    public void setItemLista(ItemLista itemLista) {
        this.itemLista = itemLista;
    }

    public BigDecimal getCantidad_cotizada() {
        return cantidad_cotizada;
    }

    public void setCantidad_cotizada(BigDecimal cantidad_cotizada) {
        this.cantidad_cotizada = cantidad_cotizada;
    }

    public BigDecimal getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(BigDecimal precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public BigDecimal getSubtotal_item() {
        return subtotal_item;
    }

    public void setSubtotal_item(BigDecimal subtotal_item) {
        this.subtotal_item = subtotal_item;
    }

}
