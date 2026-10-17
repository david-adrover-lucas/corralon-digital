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
@Table(name = "cotizacion_proveedor")
public class CotizacionProveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cotizacion")
    private Long id_cotizacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_solicitud")
    private SolicitudCotizacion solicitud;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa_proveedor")
    private Empresa empresaProveedor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_beneficio")
    private Beneficio beneficio;

    @Column(name = "horas_validez")
    private Integer horas_validez;

    @Column(name = "fecha_expiracion")
    private LocalDateTime fecha_expiracion;

    @Column(name = "subtotal", precision = 14, scale = 2)
    private BigDecimal subtotal;

    @Column(name = "monto_descuento", precision = 14, scale = 2)
    private BigDecimal monto_descuento;

    @Column(name = "total", precision = 14, scale = 2)
    private BigDecimal total;

    @Column(name = "estado")
    private String estado;

    public CotizacionProveedor() {
    }

public CotizacionProveedor(SolicitudCotizacion solicitud, Empresa empresaProveedor, Beneficio beneficio, Integer horas_validez, LocalDateTime fecha_expiracion, BigDecimal subtotal, BigDecimal monto_descuento, BigDecimal total, String estado) {
        this.solicitud = solicitud;
        this.empresaProveedor = empresaProveedor;
        this.beneficio = beneficio;
        this.horas_validez = horas_validez;
        this.fecha_expiracion = fecha_expiracion;
        this.subtotal = subtotal;
        this.monto_descuento = monto_descuento;
        this.total = total;
        this.estado = estado;
    }

    public Long getId_cotizacion() {
        return id_cotizacion;
    }

    public void setId_cotizacion(Long id_cotizacion) {
        this.id_cotizacion = id_cotizacion;
    }

    public SolicitudCotizacion getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(SolicitudCotizacion solicitud) {
        this.solicitud = solicitud;
    }

    public Empresa getEmpresaProveedor() {
        return empresaProveedor;
    }

    public void setEmpresaProveedor(Empresa empresaProveedor) {
        this.empresaProveedor = empresaProveedor;
    }

    public Beneficio getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(Beneficio beneficio) {
        this.beneficio = beneficio;
    }

    public Integer getHoras_validez() {
        return horas_validez;
    }

    public void setHoras_validez(Integer horas_validez) {
        this.horas_validez = horas_validez;
    }

    public LocalDateTime getFecha_expiracion() {
        return fecha_expiracion;
    }

    public void setFecha_expiracion(LocalDateTime fecha_expiracion) {
        this.fecha_expiracion = fecha_expiracion;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getMonto_descuento() {
        return monto_descuento;
    }

    public void setMonto_descuento(BigDecimal monto_descuento) {
        this.monto_descuento = monto_descuento;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
