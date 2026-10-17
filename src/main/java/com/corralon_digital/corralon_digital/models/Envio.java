package com.corralon_digital.corralon_digital.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "envio")
public class Envio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_envio")
    private Long id_envio;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_orden", unique = true)
    private OrdenProveedor orden;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_transportista")
    private Transportista transportista;

    @Column(name = "fecha_despacho")
    private LocalDateTime fecha_despacho;

    @Column(name = "fecha_entrega_estimada")
    private LocalDateTime fecha_entrega_estimada;

    @Column(name = "fecha_entrega_real")
    private LocalDateTime fecha_entrega_real;

    public Envio() {
    }

public Envio(OrdenProveedor orden, Transportista transportista, LocalDateTime fecha_despacho, LocalDateTime fecha_entrega_estimada, LocalDateTime fecha_entrega_real) {
        this.orden = orden;
        this.transportista = transportista;
        this.fecha_despacho = fecha_despacho;
        this.fecha_entrega_estimada = fecha_entrega_estimada;
        this.fecha_entrega_real = fecha_entrega_real;
    }

    public Long getId_envio() {
        return id_envio;
    }

    public void setId_envio(Long id_envio) {
        this.id_envio = id_envio;
    }

    public OrdenProveedor getOrden() {
        return orden;
    }

    public void setOrden(OrdenProveedor orden) {
        this.orden = orden;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    public LocalDateTime getFecha_despacho() {
        return fecha_despacho;
    }

    public void setFecha_despacho(LocalDateTime fecha_despacho) {
        this.fecha_despacho = fecha_despacho;
    }

    public LocalDateTime getFecha_entrega_estimada() {
        return fecha_entrega_estimada;
    }

    public void setFecha_entrega_estimada(LocalDateTime fecha_entrega_estimada) {
        this.fecha_entrega_estimada = fecha_entrega_estimada;
    }

    public LocalDateTime getFecha_entrega_real() {
        return fecha_entrega_real;
    }

    public void setFecha_entrega_real(LocalDateTime fecha_entrega_real) {
        this.fecha_entrega_real = fecha_entrega_real;
    }

}
