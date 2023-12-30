package com.appgym.persistencia;

import com.appgym.logica.Persona;
import java.util.List;


public class ControladoraPersistencia {
    
    PersonaJpaController personaJpa = new PersonaJpaController();

    public void agregarPersona(Persona persona) {
        personaJpa.create(persona);
    }

    public List<Persona> traerPersona() {
        
       return personaJpa.findPersonaEntities();
        
    }
    
}
