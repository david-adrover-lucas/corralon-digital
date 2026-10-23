package com.corralon_digital.corralon_digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corralon_digital.corralon_digital.models.OrdenProveedor;
import java.util.List;
import java.math.BigDecimal;



@Repository 
public interface OrdenProveedorRepository extends JpaRepository<OrdenProveedor, Long> {
    List<OrdenProveedor> findByEstado(String estado);
    
    List<OrdenProveedor> findByTotal(BigDecimal total);
}
