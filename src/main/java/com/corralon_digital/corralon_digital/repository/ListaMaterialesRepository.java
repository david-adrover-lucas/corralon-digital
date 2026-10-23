package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.ListaMateriales;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ListaMaterialesRepository extends JpaRepository<ListaMateriales, Long> {
List<ListaMateriales> findByNombre (String nombre);
List<ListaMateriales> findByOrigen (String origen);
List<ListaMateriales> findByFechaCreacion (LocalDateTime fechaCreacion);
List<ListaMateriales> findByFechaCreacion (LocalDateTime desde, LocalDateTime hasta);

}
