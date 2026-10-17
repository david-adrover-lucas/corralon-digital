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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private Long id_pago;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_orden", unique = true)
    private OrdenProveedor orden;

    @Column(name = "monto", precision = 14, scale = 2)
    private BigDecimal monto;

    @Column(name = "comision_plataforma", precision = 14, scale = 2)
    private BigDecimal comision_plataforma;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha_pago")
    private LocalDateTime fecha_pago;

    @Column(name = "metodo_pago")
    private String metodo_pago;

    public Pago() {
    }

    public Pago(OrdenProveedor orden, BigDecimal monto, BigDecimal comision_plataforma, String estado, LocalDateTime fecha_pago, String metodo_pago) {
        this.orden = orden;
        this.monto = monto;
        this.comision_plataforma = comision_plataforma;
        this.estado = estado;
        this.fecha_pago = fecha_pago;
        this.metodo_pago = metodo_pago;
    }

    public Long getId_pago() {
        return id_pago;
    }

    public void setId_pago(Long id_pago) {
        this.id_pago = id_pago;
    }

    public OrdenProveedor getOrden() {
        return orden;
    }

    public void setOrden(OrdenProveedor orden) {
        this.orden = orden;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getComision_plataforma() {
        return comision_plataforma;
    }

    public void setComision_plataforma(BigDecimal comision_plataforma) {
        this.comision_plataforma = comision_plataforma;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(LocalDateTime fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

}
