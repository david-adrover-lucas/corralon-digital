package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
