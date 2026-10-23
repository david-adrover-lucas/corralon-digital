package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.SolicitudCotizacion;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface SolicitudCotizacionRepository extends JpaRepository<SolicitudCotizacion, Long> {
List<SolicitudCotizacion> findByFechaSolicitud (LocalDateTime fechaSolicitud);
List<SolicitudCotizacion> findByFechaSolicitud (LocalDateTime desde, LocalDateTime hasta);

}
