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
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Long id_pedido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario_comprador")
    private Usuario usuarioComprador;

    @Column(name = "estado_general")
    private String estado_general;

    @Column(name = "total_general", precision = 14, scale = 2)
    private BigDecimal total_general;

    public Pedido() {
    }

    public Pedido(Usuario usuarioComprador, String estado_general, BigDecimal total_general) {
        this.usuarioComprador = usuarioComprador;
        this.estado_general = estado_general;
        this.total_general = total_general;
    }

    public Long getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Long id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Usuario getUsuarioComprador() {
        return usuarioComprador;
    }

    public void setUsuarioComprador(Usuario usuarioComprador) {
        this.usuarioComprador = usuarioComprador;
    }

    public String getEstado_general() {
        return estado_general;
    }

    public void setEstado_general(String estado_general) {
        this.estado_general = estado_general;
    }

    public BigDecimal getTotal_general() {
        return total_general;
    }

    public void setTotal_general(BigDecimal total_general) {
        this.total_general = total_general;
    }

}
