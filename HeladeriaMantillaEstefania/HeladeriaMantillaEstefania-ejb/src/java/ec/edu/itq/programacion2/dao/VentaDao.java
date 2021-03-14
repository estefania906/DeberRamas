/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.dao;

import ec.edu.itq.programacion2.generico.Generico;
import ec.edu.itq.programacion2.modelo.Venta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Estefi Mantilla
 */
@Stateless
public class VentaDao extends Generico<Venta> {


    public VentaDao() {
        super(Venta.class);
    }
    
}
