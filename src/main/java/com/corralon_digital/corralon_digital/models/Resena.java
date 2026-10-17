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
@Table(name = "resena")
public class Resena {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_resena")
    private Long id_resena;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario_comprador")
    private Usuario usuarioComprador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa_proveedor")
    private Empresa empresaProveedor;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_orden", unique = true)
    private OrdenProveedor orden;

    @Column(name = "puntaje")
    private Integer puntaje;

    @Column(name = "comentario", columnDefinition = "TEXT")
    private String comentario;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    public Resena() {
    }

    public Resena(Usuario usuarioComprador, Empresa empresaProveedor, OrdenProveedor orden, Integer puntaje, String comentario, LocalDateTime fecha) {
        this.usuarioComprador = usuarioComprador;
        this.empresaProveedor = empresaProveedor;
        this.orden = orden;
        this.puntaje = puntaje;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public Long getId_resena() {
        return id_resena;
    }

    public void setId_resena(Long id_resena) {
        this.id_resena = id_resena;
    }

    public Usuario getUsuarioComprador() {
        return usuarioComprador;
    }

    public void setUsuarioComprador(Usuario usuarioComprador) {
        this.usuarioComprador = usuarioComprador;
    }

    public Empresa getEmpresaProveedor() {
        return empresaProveedor;
    }

    public void setEmpresaProveedor(Empresa empresaProveedor) {
        this.empresaProveedor = empresaProveedor;
    }

    public OrdenProveedor getOrden() {
        return orden;
    }

    public void setOrden(OrdenProveedor orden) {
        this.orden = orden;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

}
