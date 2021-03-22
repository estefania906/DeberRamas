/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.control;

import ec.edu.itq.programacion2.modelo.Producto;
import ec.edu.itq.programacion2.servicio.ProductoServicio;
import ec.edu.itq.programacion2.modelo.CategoriaProducto;
import ec.edu.itq.programacion2.servicio.CategoriaProductoServicio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author Estefi Mantilla
 */


    @ManagedBean
@ViewScoped
public class ProductoControl implements Serializable {

    private Producto producto;
    private List<Producto> listaProducto;
    private List<SelectItem> selectItemCategoriaProducto;
    private Integer idCategoriaProducto;
    private Map<Integer, CategoriaProducto> mapaCategoriaProducto;
    
    @EJB
    private CategoriaProductoServicio categoriaproductoServicio;
    @EJB
    private ProductoServicio productoServicio;
    
    @PostConstruct
    public void init(){
        producto = new Producto();
        crearSelectItemCategoriaProducto(buscarCategoriaProducto());
        buscarProducto();
    }
    
    private void buscarProducto(){
        listaProducto = productoServicio.buscarProducto();
    }
    
    private List<CategoriaProducto> buscarCategoriaProducto(){
        List<CategoriaProducto> listaCategoriaProducto = categoriaproductoServicio.buscarCategoriaProducto();
        mapaCategoriaProducto = new HashMap<>();
        for (CategoriaProducto categoriaproducto : listaCategoriaProducto) {
            mapaCategoriaProducto.put(categoriaproducto.getIdCategoriaProducto(), categoriaproducto);
        }
        return listaCategoriaProducto;
    }
    
    private void crearSelectItemCategoriaProducto(List<CategoriaProducto> listaCategoriaProducto){
        selectItemCategoriaProducto = new ArrayList<>();
        for (CategoriaProducto categoriaproducto : listaCategoriaProducto) {
            SelectItem itemProducto = new SelectItem(categoriaproducto.getIdCategoriaProducto(), categoriaproducto.getNombre());
            selectItemCategoriaProducto.add(itemProducto);
        }
    }
    
    public void guardar(){
        CategoriaProducto categoriaproducto = mapaCategoriaProducto.get(idCategoriaProducto);
        producto.setIdCategoriaProducto(categoriaproducto);
        productoServicio.guardar(producto);
        limpiar();
        buscarProducto();
    }
    
    public void limpiar(){
        this.producto = new Producto();
        idCategoriaProducto = null;
    }
    
    public void actualizar(Producto producto){
        this.producto = producto;
        this.idCategoriaProducto = producto.getIdCategoriaProducto().getIdCategoriaProducto();
    }
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public List<SelectItem> getSelectItemCategoriaProducto() {
        return selectItemCategoriaProducto;
    }

    public void setSelectItemCategoriaProducto(List<SelectItem> selectItemCategoriaProducto) {
        this.selectItemCategoriaProducto = selectItemCategoriaProducto;
    }

    public Integer getIdCategoriaProducto() {
        return idCategoriaProducto;
    }

    public void setIdCategoriaProducto(Integer idCategoriaProducto) {
        this.idCategoriaProducto = idCategoriaProducto;
    }
    
    
   
      }
    

