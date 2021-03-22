/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.control;

import ec.edu.itq.programacion2.modelo.Bodega;
import ec.edu.itq.programacion2.modelo.Producto;
import ec.edu.itq.programacion2.modelo.DetalleBodega;
import ec.edu.itq.programacion2.servicio.BodegaServicio;
import ec.edu.itq.programacion2.servicio.ProductoServicio;
import ec.edu.itq.programacion2.servicio.DetalleBodegaServicio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Estefi Mantilla
 */
@ManagedBean
@ViewScoped
public class DetalleBodegaControl implements Serializable {

     private DetalleBodega detallebodega;
    private List<DetalleBodega> listaDetalleBodega;
     private List<DetalleBodega> listaResta;
    private List<SelectItem> selectItemProducto;
    private Integer idProducto;
    private Map<Integer, Producto> mapaProducto;

    private List<SelectItem> selectItemBodega;
    private Integer idBodega;
    private Map<Integer, Bodega> mapaBodega;
    
    @EJB
    private ProductoServicio productoServicio;
    @EJB
    private DetalleBodegaServicio detallebodegaServicio;
 @EJB
    private BodegaServicio bodegaServicio;
    
    
    @PostConstruct
    public void init(){
        detallebodega = new DetalleBodega();
        crearSelectItemProducto(buscarProducto());
        crearSelectItemBodega(buscarBodega());
        buscarDetalleBodega();
    }
    
    private void buscarDetalleBodega(){
        listaDetalleBodega = detallebodegaServicio.buscarDetalleBodega();
    }
    
    private List<Producto> buscarProducto(){
        List<Producto> listaProducto = productoServicio.buscarProducto();
        mapaProducto = new HashMap<>();
        for (Producto producto : listaProducto) {
            mapaProducto.put(producto.getIdProducto(), producto);
        }
        return listaProducto;
    }
    
    
    private void crearSelectItemProducto(List<Producto> listaProducto){
        selectItemProducto = new ArrayList<>();
        for (Producto producto : listaProducto) {
            SelectItem itemDetalleBodega = new SelectItem(producto.getIdProducto(), producto.getNombre());
            selectItemProducto.add(itemDetalleBodega);
        }
    }

    private List<Bodega> buscarBodega(){
        List<Bodega> listaBodega = bodegaServicio.buscarBodega();
        mapaBodega = new HashMap<>();
        for (Bodega bodega : listaBodega) {
            mapaBodega.put(bodega.getIdBodega(), bodega);
        }
        return listaBodega;
    }
    
    
    private void crearSelectItemBodega(List<Bodega> listaBodega){
        selectItemBodega = new ArrayList<>();
        for (Bodega bodega : listaBodega) {
            SelectItem itemDetalleBodega2 = new SelectItem(bodega.getIdBodega(), bodega.getDireccion());
            selectItemBodega.add(itemDetalleBodega2);
        }
    }
    
    public void guardar(){
        Producto producto = mapaProducto.get(idProducto);
        detallebodega.setIdProducto(producto);
        Bodega bodega = mapaBodega.get(idBodega);
        detallebodega.setIdBodega(bodega);
        detallebodegaServicio.guardar(detallebodega);
        limpiar();
        buscarDetalleBodega();
    }
    
    public void limpiar(){
        this.detallebodega = new DetalleBodega();
        idProducto = null;
        idBodega = null;
    }
    
    public void actualizar(DetalleBodega detallebodega){
        this.detallebodega = detallebodega;
        this.idProducto = detallebodega.getIdProducto().getIdProducto();
        this.idBodega = detallebodega.getIdBodega().getIdBodega();
    }
    
    public DetalleBodega getDetalleBodega() {
        return detallebodega;
    }

    public void setDetalleBodega(DetalleBodega detallebodega) {
        this.detallebodega = detallebodega;
    }

    public List<DetalleBodega> getListaDetalleBodega() {
        return listaDetalleBodega;
    }

    public void setListaDetalleBodega(List<DetalleBodega> listaDetalleBodega) {
        this.listaDetalleBodega = listaDetalleBodega;
    }

    public List<SelectItem> getSelectItemProducto() {
        return selectItemProducto;
    }

    public void setSelectItemProducto(List<SelectItem> selectItemProducto) {
        this.selectItemProducto = selectItemProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
 
     public List<SelectItem> getSelectItemBodega() {
        return selectItemBodega;
    }

    public void setSelectItemBodega(List<SelectItem> selectItemBodega) {
        this.selectItemBodega = selectItemBodega;
    }

    public Integer getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(Integer idBodega) {
        this.idBodega = idBodega;
    }
      }