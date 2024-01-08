package com.appgym.logica;

import com.appgym.igu.Consulta;
import com.appgym.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarPersona(int dni, String nombre, String apellido, String email, int telefono) {
        
        Persona persona = new Persona();
        persona.setDni(dni);
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setEmail(email);
        persona.setTelefono(telefono);
        
        controlPersis.agregarPersona(persona);
        
    }

    public List<Persona> traerPersona() {
        
       return controlPersis.traerPersona();
        
    }


    public void borrarPersona(int Id) {
        
        controlPersis.borrarPersona(Id);
        
    }

    public Persona traerPersona(int Id) {
        
        return controlPersis.traerPersona(Id);
        
    }

    public void modificarPersona(Persona persona, int dni, String nombre, String apellido, String email, int telefono) {
        
        persona.setDni(dni);
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setEmail(email);
        persona.setTelefono(telefono);
        
        controlPersis.modificarPersona(persona);
        
    }
    
}
