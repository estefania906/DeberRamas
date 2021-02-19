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
public class Entrada {
    
    private Integer id;
    private Pelicula pelicula;
    private Horario horario;
    private Sala sala;
    private Cliente cliente;
    private Cajero cajero;
    private Double precio;

    public Integer getId() {
        return id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Horario getHorario() {
        return horario;
    }

    public Sala getSala() {
        return sala;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
    
    
    
}
