package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.Usuario;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
List <Usuario> findByNombre_completo (String nombre);
List <Usuario> findByEmail (String email);
List <Usuario> findByTelefono (String telefono);
List <Usuario> findByDni (String dni);
List <Usuario> findByDireccion (String direccion);
List <Usuario> findByEstado (String estado);
List <Usuario> findByFecha_registro (LocalDateTime fecha_registro);
}
