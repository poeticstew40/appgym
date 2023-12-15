package com.appgym.persistencia;

import com.appgym.logica.Persona;


public class ControladoraPersistencia {
    
    PersonaJpaController personaJpa = new PersonaJpaController();

    public void agregarPersona(Persona persona) {
        personaJpa.create(persona);
    }
    
}
