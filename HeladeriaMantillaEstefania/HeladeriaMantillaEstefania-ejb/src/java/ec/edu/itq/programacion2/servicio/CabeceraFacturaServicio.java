/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.servicio;

import ec.edu.itq.programacion2.dao.CabeceraFacturaDao;
import ec.edu.itq.programacion2.modelo.CabeceraFactura;
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
public class CabeceraFacturaServicio {

   @EJB
private CabeceraFacturaDao cabecerafacturaDao;

public void guardar(CabeceraFactura  cabecerafactura){
    cabecerafacturaDao.create(cabecerafactura);
}

    public List<CabeceraFactura> buscarCabeceraFactura() {
        List<CabeceraFactura> listaCabeceraFactura = cabecerafacturaDao.buscarCabeceraFactura();
        return listaCabeceraFactura;
    }
}
