/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.lenguaje.dao;

import es.edu.itq.lenguaje.generico.Generico;
import ec.edu.itq.lenguaje.reserva.mantilla.Persona;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Estefi Mantilla
 */
@Stateless
public class PersonaDao extends Generico<Persona> {

    public PersonaDao() {
        super(Persona.class);
    }
    
}
