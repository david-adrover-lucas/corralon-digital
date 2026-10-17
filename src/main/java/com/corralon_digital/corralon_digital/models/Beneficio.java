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
@Table(name = "beneficio")
public class Beneficio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_beneficio")
    private Long id_beneficio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa_proveedor")
    private Empresa empresa;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "valor", precision = 14, scale = 2)
    private BigDecimal valor;

    @Column(name = "es_porcentaje")
    private Boolean es_porcentaje;

    @Column(name = "condicion_monto_minimo", precision = 14, scale = 2)
    private BigDecimal condicion_monto_minimo;

    public Beneficio() {
    }

    public Beneficio(Empresa empresa, String tipo, String descripcion, BigDecimal valor, Boolean es_porcentaje, BigDecimal condicion_monto_minimo) {
        this.empresa = empresa;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.valor = valor;
        this.es_porcentaje = es_porcentaje;
        this.condicion_monto_minimo = condicion_monto_minimo;
    }

    public Long getId_beneficio() {
        return id_beneficio;
    }

    public void setId_beneficio(Long id_beneficio) {
        this.id_beneficio = id_beneficio;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Boolean getEs_porcentaje() {
        return es_porcentaje;
    }

    public void setEs_porcentaje(Boolean es_porcentaje) {
        this.es_porcentaje = es_porcentaje;
    }

    public BigDecimal getCondicion_monto_minimo() {
        return condicion_monto_minimo;
    }

    public void setCondicion_monto_minimo(BigDecimal condicion_monto_minimo) {
        this.condicion_monto_minimo = condicion_monto_minimo;
    }

}
