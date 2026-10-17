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
@Table(name = "lista_materiales")
public class ListaMateriales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lista")
    private Long id_lista;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario_comprador")
    private Usuario usuarioComprador;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "origen")
    private String origen;

    @Column(name = "fecha_creacion")
    private LocalDateTime fecha_creacion;

    public ListaMateriales() {
    }

    public ListaMateriales(Usuario usuarioComprador, String nombre, String origen, LocalDateTime fecha_creacion) {
        this.usuarioComprador = usuarioComprador;
        this.nombre = nombre;
        this.origen = origen;
        this.fecha_creacion = fecha_creacion;
    }

    public Long getId_lista() {
        return id_lista;
    }

    public void setId_lista(Long id_lista) {
        this.id_lista = id_lista;
    }

    public Usuario getUsuarioComprador() {
        return usuarioComprador;
    }

    public void setUsuarioComprador(Usuario usuarioComprador) {
        this.usuarioComprador = usuarioComprador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public LocalDateTime getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDateTime fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

}
