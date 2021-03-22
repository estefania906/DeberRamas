/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.servicio;

import ec.edu.itq.programacion2.dao.DetalleFacturaDao;
import ec.edu.itq.programacion2.modelo.DetalleFactura;
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
public class DetalleFacturaServicio {
  @EJB
private DetalleFacturaDao detallefacturaDao;

public void guardar(DetalleFactura  detallefactura){
    detallefacturaDao.create(detallefactura);
}

    public List<DetalleFactura> buscarDetalleFactura() {
        List<DetalleFactura> listaDetalleFactura = detallefacturaDao.buscarDetalleFactura();
        return listaDetalleFactura;
    }
}
