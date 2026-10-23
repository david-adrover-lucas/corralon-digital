package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.Beneficio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  
public interface BeneficioRepository extends JpaRepository<Beneficio, Long> {

}
