package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.ItemLista;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ItemListaRepository extends JpaRepository<ItemLista, Long> {
List<ItemLista> findByCantidad (BigDecimal cantidad);
List<ItemLista> findByObservaciones (String observaciones);
}
