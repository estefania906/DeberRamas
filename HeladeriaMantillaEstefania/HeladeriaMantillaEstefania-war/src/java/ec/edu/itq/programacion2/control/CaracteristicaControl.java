/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.control;

import ec.edu.itq.programacion2.modelo.Caracteristica;
import ec.edu.itq.programacion2.servicio.CaracteristicaServicio;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Estefi Mantilla
 */
@ManagedBean
@ViewScoped
public class CaracteristicaControl implements Serializable{
 @EJB
    private CaracteristicaServicio caracteristicaServicio;

    private Caracteristica caracteristica;
    private List<Caracteristica> listCaracteristica;

    
    @PostConstruct
    public void init(){
        buscarCaracteristica();
        caracteristica = new Caracteristica();
    }
    
    public void buscarCaracteristica(){
       listCaracteristica = caracteristicaServicio.buscarCaracteristica();
    }
    
    public void seleccionarCaracteristica(Caracteristica caracteristica){
        this.caracteristica = caracteristica;
        System.out.println(this.caracteristica.toString());
    }
    
    public void guardar(){
        System.out.println("Si llega al boton");
        caracteristicaServicio.guardar(caracteristica);
        limpiar();
        buscarCaracteristica();
    }
    
    private void limpiar(){
       caracteristica = new Caracteristica();
    }

    public List<Caracteristica> getListCaracteristica() {
        return listCaracteristica;
    }   

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(Caracteristica caracteristica) {
        this.caracteristica = caracteristica;
    }

      public void actualizar(Caracteristica caracteristica){
        this.caracteristica = caracteristica;
    }
    
}
