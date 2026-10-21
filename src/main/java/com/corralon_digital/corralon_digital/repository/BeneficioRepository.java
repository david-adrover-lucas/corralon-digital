package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.Beneficio;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface BeneficioRepository extends JpaRepository<Beneficio, Long> {
List<Beneficio> findByTipo (String tipo);
List<Beneficio> findByValor (BigDecimal valor);
List<Beneficio> findByEsPorcentaje (Boolean esPorcentaje);
List<Beneficio> findByCondicionMontoMinimo (BigDecimal condicionMontoMinimo);

}
