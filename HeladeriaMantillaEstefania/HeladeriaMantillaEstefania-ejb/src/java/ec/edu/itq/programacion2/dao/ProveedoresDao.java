/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.dao;

import ec.edu.itq.programacion2.generico.GenericoDao;
import ec.edu.itq.programacion2.modelo.Bodega;
import ec.edu.itq.programacion2.modelo.Proveedores;
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
public class ProveedoresDao extends GenericoDao<Proveedores> {


    public ProveedoresDao() {
        super(Proveedores.class);
    }
    
      public List<Proveedores> buscarProveedor() {
        Query query = getEntityManager().createQuery("SELECT pr FROM Proveedores pr");
        List<Proveedores> listaProveedor = query.getResultList();
        return listaProveedor;
    }
    
}
