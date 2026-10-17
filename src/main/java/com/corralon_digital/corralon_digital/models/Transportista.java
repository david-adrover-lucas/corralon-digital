package com.corralon_digital.corralon_digital.models;

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
@Table(name = "transportista")
public class Transportista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transportista")
    private Long id_transportista;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa_proveedor")
    private Empresa empresaProveedor;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "cuit")
    private String cuit;

    public Transportista() {
    }

public Transportista(Empresa empresaProveedor, String nombre, String tipo, String telefono, String cuit) {
        this.empresaProveedor = empresaProveedor;
        this.nombre = nombre;
        this.tipo = tipo;
        this.telefono = telefono;
        this.cuit = cuit;
    }

    public Long getId_transportista() {
        return id_transportista;
    }

    public void setId_transportista(Long id_transportista) {
        this.id_transportista = id_transportista;
    }

    public Empresa getEmpresaProveedor() {
        return empresaProveedor;
    }

    public void setEmpresaProveedor(Empresa empresaProveedor) {
        this.empresaProveedor = empresaProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

}
