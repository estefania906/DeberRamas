/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.servicio;

import ec.edu.itq.programacion2.dao.PuestoDao;
import ec.edu.itq.programacion2.modelo.Puesto;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Estefi Mantilla
 */
@Stateless
@LocalBean
public class PuestoServicio {

   @EJB
private PuestoDao puestoDao;

public void guardar(Puesto  puesto){
    puestoDao.create(puesto);
}

    public List<Puesto> buscarPuesto() {
        List<Puesto> listaPuesto = puestoDao.buscarPuesto();
        return listaPuesto;
    }
}