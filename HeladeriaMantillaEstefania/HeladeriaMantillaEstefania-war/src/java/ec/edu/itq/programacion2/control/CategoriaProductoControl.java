/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.control;

import ec.edu.itq.programacion2.modelo.CategoriaProducto;
import ec.edu.itq.programacion2.modelo.Producto;
import ec.edu.itq.programacion2.servicio.CategoriaProductoServicio;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author fcatucuamba
 */
@ManagedBean
@ViewScoped
public class CategoriaProductoControl implements Serializable{
    
    @EJB
    private CategoriaProductoServicio categoriaproductoServicio;

    private CategoriaProducto categoriaproducto;
    private List<CategoriaProducto> listCategoriaProducto;

    
    @PostConstruct
    public void init(){
        buscarCategoriaProducto();
        categoriaproducto = new CategoriaProducto();
    }
    
    public void buscarCategoriaProducto(){
       listCategoriaProducto = categoriaproductoServicio.buscarCategoriaProducto();
    }
    
    public void seleccionarCategoriaProducto(CategoriaProducto categoriaproducto){
        this.categoriaproducto = categoriaproducto;
        System.out.println(this.categoriaproducto.toString());
    }
    
    public void guardar(){
        System.out.println("Si llega al boton");
        categoriaproductoServicio.guardar(categoriaproducto);
        limpiar();
        buscarCategoriaProducto();
    }
    
    private void limpiar(){
       categoriaproducto = new CategoriaProducto();
    }

    public List<CategoriaProducto> getListCategoriaProducto() {
        return listCategoriaProducto;
    }   

    public CategoriaProducto getCategoriaProducto() {
        return categoriaproducto;
    }

    public void setCategoriaProducto(CategoriaProducto categoriaproducto) {
        this.categoriaproducto = categoriaproducto;
    }

      public void actualizar(CategoriaProducto categoriaproducto){
        this.categoriaproducto = categoriaproducto;
    }
    
    
    
    

}
