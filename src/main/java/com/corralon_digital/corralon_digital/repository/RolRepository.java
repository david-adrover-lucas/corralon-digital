package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.Rol;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface RolRepository extends JpaRepository<Rol, Long> {
    List<Rol> findByNombre (String nombre);
}
