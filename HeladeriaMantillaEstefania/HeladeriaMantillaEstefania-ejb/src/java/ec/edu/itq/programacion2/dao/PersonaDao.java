/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.dao;

import ec.edu.itq.programacion2.generico.GenericoDao;
import ec.edu.itq.programacion2.modelo.Empleado;
import ec.edu.itq.programacion2.modelo.Persona;
import ec.edu.itq.programacion2.modelo.Producto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Estefi Mantilla
 */
@Stateless
public class PersonaDao extends GenericoDao<Persona> {

  
    public PersonaDao() {
        super(Persona.class);
    }
    
    public List<Persona> buscarPersona() {
        Query query = getEntityManager().createQuery("SELECT pe FROM Persona pe");
        List<Persona> listaPersona = query.getResultList();
        return listaPersona;
    }
 
}
