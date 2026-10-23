package com.corralon_digital.corralon_digital.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.corralon_digital.corralon_digital.models.Rol;
import com.corralon_digital.corralon_digital.repository.RolRepository;

@Service
public class RolServices {
    private RolRepository rolRepository;
    
    // metodos publicos
    //CRUD
    public void guardarRol(Rol rol){//rol que manda el usaurio
        Rol rolLimpio = new Rol(); // rol vacio que  creamos para recibir los datos limpios
        rolLimpio.setNombre(validarString(rol.getNombre()));// colocamos el  nombre limpio al rol creado.
        rolRepository.save(rolLimpio); // lo mandamos al repository ya limpio
    }

    public void editarRol(Long id, String nombre){// nombre del rol y id que manda el usaurio
        Rol rol=  rolRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Rol no encontrado con el ID: " + id));// creamos un rol y toma el valor que buscamos en la base de datos con el id
        rol.setNombre(validarString(nombre));// colocamos el nombre del rol que nos mando el  cliente ya limpio al rol existente de la base de datos
        rolRepository.save(rol);// guardamos las modificaciones ya limpia
    }

    public void eliminarRol(Long id){// el id que nos manda el usuario
          Rol rol=  rolRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Rol no encontrado con el ID: " + id));// creamos un rol y toma el valor que buscamos en la base de datos con el id
        rolRepository.delete(rol);
    }

 

    public List<Rol> buscarTodosLosRoles() { //listar todos los roles
        return rolRepository.findAll();
    }

    //metodos personalizados
    public List<Rol> buscarNombre(String nombre){ //nombre que manda el usario
        String nombreLimpio= validarString(nombre);// limpiar el nombre que nos manda el usuario
        return  rolRepository.findByNombre(nombreLimpio);// mostrar el rol buscado por el usuario
    }

    //metodos privados 
    private String  validarString(String nombre){ 
        if (nombre ==null || nombre.toLowerCase().isEmpty()) {
          new RuntimeException(" Rol  vacio o inexitente");
        }
        if (nombre.equals("comprador")|| nombre.equals("proveedor")
            || nombre.equals("admin")) {
            new  RuntimeException("Rol inexistente");
        }
        String nombreLimpio= nombre.toLowerCase().strip();
        return  nombreLimpio;
        
    }
}
