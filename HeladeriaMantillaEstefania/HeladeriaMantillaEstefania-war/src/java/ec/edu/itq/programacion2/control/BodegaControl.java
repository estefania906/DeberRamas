/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.control;


import ec.edu.itq.programacion2.modelo.Bodega;
import ec.edu.itq.programacion2.modelo.Empleado;
import ec.edu.itq.programacion2.servicio.BodegaServicio;
import ec.edu.itq.programacion2.servicio.EmpleadoServicio;
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
public class BodegaControl implements Serializable {

      private Bodega bodega;
    private List<Bodega> listaBodega;
    private List<SelectItem> selectItemEmpleado;
    private Integer idEmpleado;
    private Map<Integer, Empleado> mapaEmpleado;
    
     @EJB
    private EmpleadoServicio empleadoServicio;
    @EJB
    private BodegaServicio bodegaServicio;
    
    @PostConstruct
    public void init(){
        bodega = new Bodega();
        crearSelectItemEmpleado(buscarEmpleado());
        buscarBodega();
    }
    
    private void buscarBodega(){
        listaBodega = bodegaServicio.buscarBodega();
    }
    
    
    private List<Empleado> buscarEmpleado(){
        List<Empleado> listaBodega = empleadoServicio.buscarEmpleado();
        mapaEmpleado = new HashMap<>();
        for (Empleado empleado : listaBodega) {
            mapaEmpleado.put(empleado.getIdEmpleado(), empleado);
        }
        return listaBodega;
    }
    

    private void crearSelectItemEmpleado(List<Empleado> listaEmpleado){
        selectItemEmpleado = new ArrayList<>();
        for (Empleado empleado : listaEmpleado) {
            SelectItem itemBodega = new SelectItem(empleado.getIdEmpleado());
            selectItemEmpleado.add(itemBodega);
        }
    }
    
    public void guardar(){
        Empleado empleado = mapaEmpleado.get(idEmpleado);
        bodega.setIdEmpleado(empleado);
        bodegaServicio.guardar(bodega);
        limpiar();
        buscarBodega();
    }
    
    public void limpiar(){
        this.bodega = new Bodega();
        idEmpleado = null;
    }
    
    public void actualizar(Bodega bodega){
        this.bodega = bodega;
        this.idEmpleado = bodega.getIdEmpleado().getIdEmpleado();
    }
    
    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    public List<Bodega> getListaBodega() {
        return listaBodega;
    }

    public void setListaBodega(List<Bodega> listaBodega) {
        this.listaBodega = listaBodega;
    }

    public List<SelectItem> getSelectItemEmpleado() {
        return selectItemEmpleado;
    }

    public void setSelectItemEmpleado(List<SelectItem> selectItemEmpleado) {
        this.selectItemEmpleado = selectItemEmpleado;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    
   
      }
    
