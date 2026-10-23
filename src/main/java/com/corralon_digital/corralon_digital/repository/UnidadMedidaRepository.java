package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.UnidadMedida;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface UnidadMedidaRepository extends JpaRepository<UnidadMedida, Long> {
List<UnidadMedida> findByNombre (String nombre);
List<UnidadMedida> findByAbreviatura (String abreviatura);
}
