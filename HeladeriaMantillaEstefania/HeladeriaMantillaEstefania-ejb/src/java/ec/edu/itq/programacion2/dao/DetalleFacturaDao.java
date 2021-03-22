/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.dao;

import ec.edu.itq.programacion2.generico.GenericoDao;
import ec.edu.itq.programacion2.modelo.DetalleFactura;

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
public class DetalleFacturaDao extends GenericoDao<DetalleFactura> {


    public DetalleFacturaDao() {
        super(DetalleFactura.class);
    }
    
    public List<DetalleFactura> buscarDetalleFactura() {
        Query query = getEntityManager().createQuery("SELECT df FROM DetalleFactura df");
        List<DetalleFactura> listaDetalleFactura = query.getResultList();
        return listaDetalleFactura;
    }
}
