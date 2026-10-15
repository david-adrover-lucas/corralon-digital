package com.corralon_digital.corralon_digital.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "usuario")
public class Usuario{
    @Id 
    @Column (name = "id_usuario") 
    @Generated (value = "jakarta.persistence.GenerationType.IDENTITY")
    private Long id_usuario;
    
    @Column (name = "nombre_completo")
    private String nombre_completo;
    
    @Column (name = "email")
    private String email;
    
    @Column (name = "password_hash")
    private String password_hash;
    
    @Column (name = "dni")
    private String dni;
    
    @Column (name = "direccion")
    private String direccion;
    
    @Column (name = "telefono")
    private String telefono;
    

    public Usuario() {
    }

    public Usuario(Long id_usuario, String nombre_completo, String email, String password_hash, String dni, String direccion, String telefono) {
        this.id_usuario = id_usuario;
        this.nombre_completo = nombre_completo;
        this.email = email;
        this.password_hash = password_hash;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}