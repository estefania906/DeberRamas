/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.dao;

import ec.edu.itq.programacion2.generico.GenericoDao;
import ec.edu.itq.programacion2.modelo.Empleado;
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
public class EmpleadoDao extends GenericoDao<Empleado> {

  

    public EmpleadoDao() {
        super(Empleado.class);
    }
    
    public List<Empleado> buscarEmpleado() {
        Query query = getEntityManager().createQuery("SELECT e FROM Empleado e WHERE e.estado=true");
        List<Empleado> listaEmpleado = query.getResultList();
        return listaEmpleado;
    }
}
