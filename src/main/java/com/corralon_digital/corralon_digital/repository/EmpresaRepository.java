package com.corralon_digital.corralon_digital.repository;

import com.corralon_digital.corralon_digital.models.CondicionIVA;
import com.corralon_digital.corralon_digital.models.Empresa;
import com.corralon_digital.corralon_digital.models.EstadoAprobacion;
import com.corralon_digital.corralon_digital.models.TipoEmpresa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    List<Empresa> findByRazon_social (String razon_social);
    List<Empresa> findByCuit (String cuit);
    List<Empresa> findByCondicion_iva (CondicionIVA condicion_iva);
    List<Empresa> findByTipo_empresa (TipoEmpresa tipo_empresa);
    List<Empresa> findByEstado_aprobacion (EstadoAprobacion estado_aprobacion);
}
