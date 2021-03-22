/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.control;

import ec.edu.itq.programacion2.modelo.Cliente;
import ec.edu.itq.programacion2.modelo.Persona;
import ec.edu.itq.programacion2.servicio.ClienteServicio;
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
public class ClienteControl implements Serializable {

 
    private Cliente cliente;
    private List<Cliente> listaCliente;

    
    @EJB
    private ClienteServicio clienteServicio;
  
    
    @PostConstruct
    public void init(){
        cliente = new Cliente();
        cliente.setIdPersona(new Persona());
        buscarCliente();
    }
    
    private void buscarCliente(){
        listaCliente = clienteServicio.buscarCliente();
    }
    
    
    public void guardar(){
        clienteServicio.guardar(cliente);
        limpiar();
        buscarCliente();
    }
    
    public void limpiar(){
        cliente = new Cliente();
   
    }
    
    public void actualizar(Cliente cliente){
        this.cliente = cliente;

    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCLiente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
   
      }

