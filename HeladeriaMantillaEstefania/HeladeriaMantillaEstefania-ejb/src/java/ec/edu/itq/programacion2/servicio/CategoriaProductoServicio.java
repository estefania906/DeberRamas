/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.servicio;

import ec.edu.itq.programacion2.dao.CategoriaProductoDao;
import ec.edu.itq.programacion2.modelo.CategoriaProducto;
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
public class CategoriaProductoServicio {
    
    @EJB
private CategoriaProductoDao categoriaproductoDao;

public void guardar(CategoriaProducto  categoriaproducto){
    categoriaproductoDao.create(categoriaproducto);
}

    public List<CategoriaProducto> buscarCategoriaProducto() {
        List<CategoriaProducto> listaCategoriaProducto = categoriaproductoDao.buscarCategoriaProducto();
        return listaCategoriaProducto;
    }
}
