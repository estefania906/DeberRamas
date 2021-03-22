/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.control;

import ec.edu.itq.programacion2.modelo.Proveedores;
import ec.edu.itq.programacion2.servicio.ProveedorServicio;
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
public class ProveedorControl implements Serializable{

    
    @EJB
    private ProveedorServicio proveedorServicio;

    private Proveedores proveedor;
    private List<Proveedores> listProveedor;

    
    @PostConstruct
    public void init(){
        buscarProveedor();
        proveedor = new Proveedores();
    }
    
    public void buscarProveedor(){
       listProveedor = proveedorServicio.buscarProveedor();
    }
    
    public void seleccionarProveedor(Proveedores proveedor){
        this.proveedor = proveedor;
        System.out.println(this.proveedor.toString());
    }
    
    public void guardar(){
        System.out.println("Si llega al boton");
        proveedorServicio.guardar(proveedor);
        limpiar();
        buscarProveedor();
    }
    
    private void limpiar(){
       proveedor = new Proveedores();
    }

    public List<Proveedores> getListProveedor() {
        return listProveedor;
    }   

    public Proveedores getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedores proveedor) {
        this.proveedor = proveedor;
    }

      public void actualizar(Proveedores proveedor){
        this.proveedor = proveedor;
    }
    
    
    
    

}
