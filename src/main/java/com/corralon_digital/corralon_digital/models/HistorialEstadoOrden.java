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
import jakarta.persistence.Table;

@Entity
@Table(name = "historial_estado_orden")
public class HistorialEstadoOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historial")
    private Long id_historial;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_orden")
    private OrdenProveedor orden;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha_hora")
    private LocalDateTime fecha_hora;

    @Column(name = "observacion")
    private String observacion;

    public HistorialEstadoOrden() {
    }

public HistorialEstadoOrden(OrdenProveedor orden, String estado, LocalDateTime fecha_hora, String observacion) {
        this.orden = orden;
        this.estado = estado;
        this.fecha_hora = fecha_hora;
        this.observacion = observacion;
    }

    public Long getId_historial() {
        return id_historial;
    }

    public void setId_historial(Long id_historial) {
        this.id_historial = id_historial;
    }

    public OrdenProveedor getOrden() {
        return orden;
    }

    public void setOrden(OrdenProveedor orden) {
        this.orden = orden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDateTime fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

}
