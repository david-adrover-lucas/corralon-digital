package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.Pedido;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<PedidoRepository> findByEstadoGeneral (String estadoGeneral);
    List<PedidoRepository> findByTotalGeneral (String totalGeneral);
}
