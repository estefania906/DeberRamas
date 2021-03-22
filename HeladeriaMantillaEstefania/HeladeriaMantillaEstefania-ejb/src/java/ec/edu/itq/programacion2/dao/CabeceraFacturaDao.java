/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.dao;

import ec.edu.itq.programacion2.generico.GenericoDao;
import ec.edu.itq.programacion2.modelo.CabeceraFactura;
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
public class CabeceraFacturaDao extends GenericoDao<CabeceraFactura> {

    public CabeceraFacturaDao() {
        super(CabeceraFactura.class);
    }
    
    public List<CabeceraFactura> buscarCabeceraFactura() {
        Query query = getEntityManager().createQuery("SELECT cf FROM CabeceraFactura cf");
        List<CabeceraFactura> listaCabeceraFactura = query.getResultList();
        return listaCabeceraFactura;
    }
}
