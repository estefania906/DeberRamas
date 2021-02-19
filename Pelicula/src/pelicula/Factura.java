/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelicula;

/**
 *
 * @author Estefi Mantilla
 */
public class Factura {
    
    private Persona persona;
    
    private Cliente cliente;
   private Entrada entrada;

    public Persona getPersona() {
        return persona;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }
    
    
}
