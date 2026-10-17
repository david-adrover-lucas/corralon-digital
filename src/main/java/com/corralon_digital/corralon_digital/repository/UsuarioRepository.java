package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
