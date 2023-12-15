package com.appgym.logica;

import com.appgym.persistencia.ControladoraPersistencia;


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
    
}
