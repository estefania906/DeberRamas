/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.dao;

import ec.edu.itq.programacion2.generico.GenericoDao;
import ec.edu.itq.programacion2.modelo.Producto;
import ec.edu.itq.programacion2.modelo.Puesto;
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
public class PuestoDao extends GenericoDao<Puesto> {

   

    public PuestoDao() {
        super(Puesto.class);
    }
    
    public List<Puesto> buscarPuesto() {
        Query query = getEntityManager().createQuery("SELECT pu FROM Puesto pu WHERE pu.estado=true");
        List<Puesto> listaPuesto = query.getResultList();
        return listaPuesto;
    }
}
