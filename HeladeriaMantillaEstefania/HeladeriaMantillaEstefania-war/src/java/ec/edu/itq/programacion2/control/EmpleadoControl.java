/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.control;

import ec.edu.itq.programacion2.modelo.Empleado;
import ec.edu.itq.programacion2.modelo.Persona;
import ec.edu.itq.programacion2.modelo.Puesto;
import ec.edu.itq.programacion2.servicio.EmpleadoServicio;
import ec.edu.itq.programacion2.servicio.PuestoServicio;
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
public class EmpleadoControl implements Serializable{

    private Empleado empleado;
    private List<Empleado> listaEmpleado;
    private List<SelectItem> selectItemPuesto;
    private Integer idPuesto;
    private Map<Integer, Puesto> mapaPuesto;
    
    @EJB
    private EmpleadoServicio empleadoServicio;
    @EJB
    private PuestoServicio puestoServicio;
    
    @PostConstruct
    public void init(){
        empleado = new Empleado();
        empleado.setIdPersona(new Persona());
        crearSelectItemPuesto(buscarPuesto());
        buscarEmpleado();
    }
    
    private void buscarEmpleado(){
        listaEmpleado = empleadoServicio.buscarEmpleado();
    }
    
     public List<Puesto> buscarPuesto(){
        List<Puesto> listaPuesto = puestoServicio.buscarPuesto();
        mapaPuesto = new HashMap<>();
        for (Puesto puesto : listaPuesto) {
            mapaPuesto.put(puesto.getIdPuesto(), puesto);
        }
        return listaPuesto;
    }
    
    
      private void crearSelectItemPuesto(List<Puesto> listaPuesto){
        selectItemPuesto = new ArrayList<>();
        for (Puesto puesto : listaPuesto) {
            SelectItem itemEmpleado = new SelectItem(puesto.getIdPuesto(), puesto.getNombre());
            selectItemPuesto.add(itemEmpleado);
        }
    }
    
    public void guardar(){
        Puesto puesto = mapaPuesto.get(idPuesto);
        empleado.setIdPuesto(puesto);
        empleadoServicio.guardar(empleado);
        limpiar();
        buscarEmpleado();
    }
    
    public void limpiar(){
        empleado = new Empleado();
        idPuesto = null;
    }
    
    public void actualizar(Empleado empleado){
        this.empleado = empleado;
        this.idPuesto = empleado.getIdPuesto().getIdPuesto();
    }
    
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(List<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

   
    
    public List<SelectItem> getSelectItemPuesto() {
        return selectItemPuesto;
    }

    
    public void setSelectItemPuesto(List<SelectItem> selectItemPuesto) {
        this.selectItemPuesto = selectItemPuesto;
    }


    public Integer getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(Integer idPuesto) {
        this.idPuesto = idPuesto;
    }
    
   
      }
