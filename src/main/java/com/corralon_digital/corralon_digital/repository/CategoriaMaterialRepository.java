package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.CategoriaMaterial;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface CategoriaMaterialRepository extends JpaRepository<CategoriaMaterial, Long> {
List<CategoriaMaterial> findByNombre (String nombre);
}
