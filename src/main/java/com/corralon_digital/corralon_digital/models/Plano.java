package com.corralon_digital.corralon_digital.models;

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
@Table(name = "plano")
public class Plano {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plano")
    private Long id_plano;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lista", unique = true)
    private ListaMateriales lista;

    @Column(name = "url_archivo")
    private String url_archivo;

    @Column(name = "estado_procesamiento")
    private String estado_procesamiento;

    @Column(name = "resultado_json", columnDefinition = "TEXT")
    private String resultado_json;

    @Column(name = "mensaje_error", columnDefinition = "TEXT")
    private String mensaje_error;

    public Plano() {
    }

    public Plano(ListaMateriales lista, String url_archivo, String estado_procesamiento, String resultado_json, String mensaje_error) {
        this.lista = lista;
        this.url_archivo = url_archivo;
        this.estado_procesamiento = estado_procesamiento;
        this.resultado_json = resultado_json;
        this.mensaje_error = mensaje_error;
    }

    public Long getId_plano() {
        return id_plano;
    }

    public void setId_plano(Long id_plano) {
        this.id_plano = id_plano;
    }

    public ListaMateriales getLista() {
        return lista;
    }

    public void setLista(ListaMateriales lista) {
        this.lista = lista;
    }

    public String getUrl_archivo() {
        return url_archivo;
    }

    public void setUrl_archivo(String url_archivo) {
        this.url_archivo = url_archivo;
    }

    public String getEstado_procesamiento() {
        return estado_procesamiento;
    }

    public void setEstado_procesamiento(String estado_procesamiento) {
        this.estado_procesamiento = estado_procesamiento;
    }

    public String getResultado_json() {
        return resultado_json;
    }

    public void setResultado_json(String resultado_json) {
        this.resultado_json = resultado_json;
    }

    public String getMensaje_error() {
        return mensaje_error;
    }

    public void setMensaje_error(String mensaje_error) {
        this.mensaje_error = mensaje_error;
    }

}
