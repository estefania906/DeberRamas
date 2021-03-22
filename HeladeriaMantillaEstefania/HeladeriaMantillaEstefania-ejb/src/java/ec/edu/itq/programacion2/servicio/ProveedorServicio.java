/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.servicio;

import ec.edu.itq.programacion2.dao.ProveedoresDao;
import ec.edu.itq.programacion2.modelo.Proveedores;
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
public class ProveedorServicio {

   @EJB
private ProveedoresDao proveedorDao;

public void guardar(Proveedores  proveedor){
    proveedorDao.create(proveedor);
}

    public List<Proveedores> buscarProveedor() {
        List<Proveedores> listaProveedor = proveedorDao.buscarProveedor();
        return listaProveedor;
    }
}
