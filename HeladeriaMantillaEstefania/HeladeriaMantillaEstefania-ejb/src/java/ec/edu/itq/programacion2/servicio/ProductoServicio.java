/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.servicio;

import ec.edu.itq.programacion2.dao.ProductoDao;
import ec.edu.itq.programacion2.modelo.Producto;
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
public class ProductoServicio {

    @EJB
private ProductoDao productoDao;

public void guardar(Producto  producto){
    productoDao.create(producto);
}

    public List<Producto> buscarProducto() {
        List<Producto> listaProducto = productoDao.buscarProducto();
        return listaProducto;
    }
}
