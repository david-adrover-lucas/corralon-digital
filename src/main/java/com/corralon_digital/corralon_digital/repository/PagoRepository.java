package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.Pago;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Repository 
public interface PagoRepository extends JpaRepository<Pago, Long> {
    List<Pago> findByMonto(BigDecimal monto);
    List<Pago> findByComision_plataforma(BigDecimal comision_plataforma);
    List<Pago> findByEstado(String estado);
    List<Pago> findByMetodPagos ( String metodoPago); 
    List<Pago> findByFecha_pago (LocalDateTime desde, LocalDateTime hasta);
}
