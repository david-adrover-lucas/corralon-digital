package com.corralon_digital.corralon_digital.repository;
import com.corralon_digital.corralon_digital.models.Transportista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository 
public interface TransportistaRepository extends JpaRepository<Transportista, Long> {
    List<Transportista> findByNombre(String nombre);
    List<Transportista> findByTipo(String nombre);
    List<Transportista> findByCuit(String cuit);
    List<Transportista> findByTelefono(String telefono);
    
}
