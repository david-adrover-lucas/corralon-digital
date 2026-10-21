package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.Plano;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface PlanoRepository extends JpaRepository<Plano, Long> {
List<Plano> findByUrlArchivo (String urlArchivo);
List<Plano> findByEstadoProcesamiento (String estadoProcesamiento);
List<Plano> findByResultadoJson (String resultadoJson);
List<Plano> findByMensajeError (String mensajeError);
}
