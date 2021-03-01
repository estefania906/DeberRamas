/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.lenguaje.dao;

import ec.edu.itq.lenguaje.mantilla.Articulos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Estefi Mantilla
 */
@Stateless
public class ArticulosFacadeDao extends AbstractFacadeDao<Articulos> {

    @PersistenceContext(unitName = "HotelReservaMantillaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArticulosFacadeDao() {
        super(Articulos.class);
    }
    
}
