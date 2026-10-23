package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.Resena;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ResenaRepository extends JpaRepository<Resena, Long> {
List<Resena> findByPuntaje (Integer puntaje);
List<Resena> findByComentario (String comentario);
List<Resena> findByFecha (LocalDateTime fecha);
List<Resena> findByFecha (LocalDateTime desde, LocalDateTime hasta);
}
