package com.appgym.persistencia;

import com.appgym.logica.Persona;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    PersonaJpaController personaJpa = new PersonaJpaController();

    public void agregarPersona(Persona persona) {
        
        personaJpa.create(persona);
        
    }

    public List<Persona> traerPersona() {
        
       return personaJpa.findPersonaEntities();
        
    }

    public void borrarPersona(int Id) {
        
        try {
            personaJpa.destroy(Id);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
