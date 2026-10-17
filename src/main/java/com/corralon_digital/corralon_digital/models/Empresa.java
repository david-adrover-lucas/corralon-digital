package com.corralon_digital.corralon_digital.models;

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
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Long id_empresa;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", unique = true)
    private Usuario usuario;

    @Column(name = "razon_social")
    private String razon_social;

    @Column(name = "cuit")
    private String cuit;

    @Enumerated(EnumType.STRING)
    @Column(name = "condicion_iva")
    private CondicionIVA condicion_iva;

    @Column(name = "direccion_fiscal")
    private String direccion_fiscal;

    @Column(name = "direccion_comercial")
    private String direccion_comercial;

    @Column(name = "representante_legal")
    private String representante_legal;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_empresa")
    private TipoEmpresa tipo_empresa;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado_aprobacion")
    private EstadoAprobacion estado_aprobacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_admin_aprobador")
    private Usuario adminAprobador;

    public Empresa() {
    }

    public Empresa(Usuario usuario, String razon_social, String cuit, CondicionIVA condicion_iva, String direccion_fiscal, String direccion_comercial, String representante_legal, TipoEmpresa tipo_empresa, EstadoAprobacion estado_aprobacion, Usuario adminAprobador) {
        this.usuario = usuario;
        this.razon_social = razon_social;
        this.cuit = cuit;
        this.condicion_iva = condicion_iva;
        this.direccion_fiscal = direccion_fiscal;
        this.direccion_comercial = direccion_comercial;
        this.representante_legal = representante_legal;
        this.tipo_empresa = tipo_empresa;
        this.estado_aprobacion = estado_aprobacion;
        this.adminAprobador = adminAprobador;
    }

    public Long getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Long id_empresa) {
        this.id_empresa = id_empresa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public CondicionIVA getCondicion_iva() {
        return condicion_iva;
    }

    public void setCondicion_iva(CondicionIVA condicion_iva) {
        this.condicion_iva = condicion_iva;
    }

    public String getDireccion_fiscal() {
        return direccion_fiscal;
    }

    public void setDireccion_fiscal(String direccion_fiscal) {
        this.direccion_fiscal = direccion_fiscal;
    }

    public String getDireccion_comercial() {
        return direccion_comercial;
    }

    public void setDireccion_comercial(String direccion_comercial) {
        this.direccion_comercial = direccion_comercial;
    }

    public String getRepresentante_legal() {
        return representante_legal;
    }

    public void setRepresentante_legal(String representante_legal) {
        this.representante_legal = representante_legal;
    }

    public TipoEmpresa getTipo_empresa() {
        return tipo_empresa;
    }

    public void setTipo_empresa(TipoEmpresa tipo_empresa) {
        this.tipo_empresa = tipo_empresa;
    }

    public EstadoAprobacion getEstado_aprobacion() {
        return estado_aprobacion;
    }

    public void setEstado_aprobacion(EstadoAprobacion estado_aprobacion) {
        this.estado_aprobacion = estado_aprobacion;
    }

    public Usuario getAdminAprobador() {
        return adminAprobador;
    }

    public void setAdminAprobador(Usuario adminAprobador) {
        this.adminAprobador = adminAprobador;
    }

}
