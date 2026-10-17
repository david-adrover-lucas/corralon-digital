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
@Table(name = "orden_proveedor")
public class OrdenProveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden")
    private Long id_orden;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa_proveedor")
    private Empresa empresaProveedor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cotizacion")
    private CotizacionProveedor cotizacion;

    @Column(name = "estado")
    private String estado;

    @Column(name = "total", precision = 14, scale = 2)
    private BigDecimal total;

    public OrdenProveedor() {
    }

    public OrdenProveedor(Pedido pedido, Empresa empresaProveedor, CotizacionProveedor cotizacion, String estado, BigDecimal total) {
        this.pedido = pedido;
        this.empresaProveedor = empresaProveedor;
        this.cotizacion = cotizacion;
        this.estado = estado;
        this.total = total;
    }

    public Long getId_orden() {
        return id_orden;
    }

    public void setId_orden(Long id_orden) {
        this.id_orden = id_orden;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Empresa getEmpresaProveedor() {
        return empresaProveedor;
    }

    public void setEmpresaProveedor(Empresa empresaProveedor) {
        this.empresaProveedor = empresaProveedor;
    }

    public CotizacionProveedor getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(CotizacionProveedor cotizacion) {
        this.cotizacion = cotizacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

}
