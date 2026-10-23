package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.HistorialEstadoOrden;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface HistorialEstadoOrdenRepository extends JpaRepository<HistorialEstadoOrden, Long> {
List<HistorialEstadoOrden> findByEstado (String estado);
List<HistorialEstadoOrden> findByFechaHora (LocalDateTime fechaHora);
List<HistorialEstadoOrden> findByFechaHora (LocalDateTime desde, LocalDateTime hasta);
}
