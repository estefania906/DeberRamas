/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author Estefi Mantilla
 */
public class Factura {
    
    private Integer id;
    private Cliente cliente;
    private Habitacion habitacion;
    private Empleado empleado;
    private Descuento descuento;
    private String descripcion;
    private Double precio;
    private Boolean estado;

    public Integer getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
}
