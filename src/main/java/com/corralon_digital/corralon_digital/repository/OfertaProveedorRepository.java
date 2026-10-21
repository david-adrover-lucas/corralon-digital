package com.corralon_digital.corralon_digital.repository;


import com.corralon_digital.corralon_digital.models.OfertaProveedor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface OfertaProveedorRepository extends JpaRepository<OfertaProveedor, Long> {
List<OfertaProveedor> findByPrecio (BigDecimal precio);
List<OfertaProveedor> findByStock (BigDecimal stock);
List<OfertaProveedor> findByStock_actualizado_en (LocalDateTime stock_actualizado_en);
List<OfertaProveedor> findByActivo (Boolean activo);
List<OfertaProveedor> findByRangoPrecio (BigDecimal desde, BigDecimal hasta);

}
