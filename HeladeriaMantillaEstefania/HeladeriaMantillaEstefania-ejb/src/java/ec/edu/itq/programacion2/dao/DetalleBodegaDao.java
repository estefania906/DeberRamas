/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.dao;

import ec.edu.itq.programacion2.generico.GenericoDao;
import ec.edu.itq.programacion2.modelo.DetalleBodega;
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
public class DetalleBodegaDao extends GenericoDao<DetalleBodega> {

    public DetalleBodegaDao() {
        super(DetalleBodega.class);
    }
   
     public List<DetalleBodega> buscarDetalleBodega() {
        Query query = getEntityManager().createQuery("SELECT db FROM DetalleBodega db");
        List<DetalleBodega> listaDetalleBodega = query.getResultList();
        return listaDetalleBodega;
    }
     
     
}
