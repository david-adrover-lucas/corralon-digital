package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.ItemCotizacion;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ItemCotizacionRepository extends JpaRepository<ItemCotizacion, Long> {
List<ItemCotizacion> findByCantidadCotizada (BigDecimal cantidadCotizada);
List<ItemCotizacion> findByPrecioUnitario (BigDecimal precioUnitario);
List<ItemCotizacion> findBySubtotalItem (BigDecimal subtotalItem);
}
