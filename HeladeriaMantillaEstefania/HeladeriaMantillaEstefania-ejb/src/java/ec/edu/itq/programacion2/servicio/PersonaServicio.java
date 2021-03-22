/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.servicio;

import ec.edu.itq.programacion2.dao.PersonaDao;
import ec.edu.itq.programacion2.modelo.Persona;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Estefi Mantilla
 */
@Stateless
@LocalBean
public class PersonaServicio {

     @EJB
private PersonaDao personaDao;

public void guardar(Persona  persona){
    personaDao.create(persona);
}

    public List<Persona> buscarPersona() {
        List<Persona> listaPersona = personaDao.buscarPersona();
        return listaPersona;
    }
}

