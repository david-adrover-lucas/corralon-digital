package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.Producto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ProductoRepository extends JpaRepository<Producto, Long> {
List<Producto> findByNombre (String nombre);
List<Producto> findByMarca (String marca);
}
