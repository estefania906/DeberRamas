/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.control;

import ec.edu.itq.programacion2.modelo.Puesto;
import ec.edu.itq.programacion2.servicio.PuestoServicio;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Estefi Mantilla
 */
@Named(value = "puestoControl")
@ViewScoped
public class PuestoControl implements Serializable{

     @EJB
    private PuestoServicio puestoServicio;

    private Puesto puesto;
    private List<Puesto> listPuesto;

    
    @PostConstruct
    public void init(){
        buscarPuesto();
        puesto = new Puesto();
    }
    
    public void buscarPuesto(){
       listPuesto = puestoServicio.buscarPuesto();
    }
    
    public void seleccionarPuesto(Puesto puesto){
        this.puesto = puesto;
        System.out.println(this.puesto.toString());
    }
    
    public void guardar(){
        System.out.println("Si llega al boton");
        puestoServicio.guardar(puesto);
        limpiar();
        buscarPuesto();
    }
    
    private void limpiar(){
       puesto = new Puesto();
    }

    public List<Puesto> getListPuesto() {
        return listPuesto;
    }   

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

      public void actualizar(Puesto puesto){
        this.puesto = puesto;
    }
    
    
    
    

}
