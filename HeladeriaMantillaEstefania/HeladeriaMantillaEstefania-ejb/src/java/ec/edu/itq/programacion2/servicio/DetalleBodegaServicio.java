/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.servicio;

import ec.edu.itq.programacion2.dao.DetalleBodegaDao;
import ec.edu.itq.programacion2.modelo.DetalleBodega;
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
public class DetalleBodegaServicio {

   @EJB
private DetalleBodegaDao detallebodegaDao;

public void guardar(DetalleBodega  detallebodega){
    detallebodegaDao.create(detallebodega);
}

    public List<DetalleBodega> buscarDetalleBodega() {
        List<DetalleBodega> listaDetalleBodega = detallebodegaDao.buscarDetalleBodega();
        return listaDetalleBodega;
    }
    
}