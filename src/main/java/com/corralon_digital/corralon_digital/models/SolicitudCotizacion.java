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
@Table(name = "solicitud_cotizacion")
public class SolicitudCotizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitud")
    private Long id_solicitud;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lista")
    private ListaMateriales lista;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario_comprador")
    private Usuario usuarioComprador;

    @Column(name = "fecha_solicitud")
    private LocalDateTime fecha_solicitud;

    public SolicitudCotizacion() {
    }

    public SolicitudCotizacion(ListaMateriales lista, Usuario usuarioComprador, LocalDateTime fecha_solicitud) {
        this.lista = lista;
        this.usuarioComprador = usuarioComprador;
        this.fecha_solicitud = fecha_solicitud;
    }

    public Long getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(Long id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public ListaMateriales getLista() {
        return lista;
    }

    public void setLista(ListaMateriales lista) {
        this.lista = lista;
    }

    public Usuario getUsuarioComprador() {
        return usuarioComprador;
    }

    public void setUsuarioComprador(Usuario usuarioComprador) {
        this.usuarioComprador = usuarioComprador;
    }

    public LocalDateTime getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(LocalDateTime fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

}
