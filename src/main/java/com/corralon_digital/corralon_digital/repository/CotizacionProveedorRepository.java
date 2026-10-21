package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.CotizacionProveedor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface CotizacionProveedorRepository extends JpaRepository<CotizacionProveedor, Long> {
List<CotizacionProveedor> findByHorasValidez (Integer horasValidez);
List<CotizacionProveedor> findByFechaExpiracion (LocalDateTime fechaExpiracion);
List<CotizacionProveedor> findByFechaExpiracion (LocalDateTime desde, LocalDateTime hasta);
List<CotizacionProveedor> findBySubtotal (BigDecimal subtotal);
List<CotizacionProveedor> findByMontoDescuento (BigDecimal montoDescuento);
List<CotizacionProveedor> findByTotal (BigDecimal total);
List<CotizacionProveedor> findByEstado (String estado);
}
