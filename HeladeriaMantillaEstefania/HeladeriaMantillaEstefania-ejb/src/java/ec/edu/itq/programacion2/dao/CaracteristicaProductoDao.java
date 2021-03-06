/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.dao;

import ec.edu.itq.programacion2.generico.GenericoDao;
import ec.edu.itq.programacion2.modelo.CaracteristicaProducto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Estefi Mantilla
 */
@Stateless
public class CaracteristicaProductoDao extends GenericoDao<CaracteristicaProducto> {

    @PersistenceContext(unitName = "HeladeriaMantillaEstefania-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CaracteristicaProductoDao() {
        super(CaracteristicaProducto.class);
    }
    
}
