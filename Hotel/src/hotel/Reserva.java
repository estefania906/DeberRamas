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
public class Reserva {
    private Integer id;
    private String nombre_cliente;
    private Double precio;
    private String fecha_inicio;
    private String fecha_fin;
    private Pago pago;
    private Habitacion habitacion;
    private Boolean estado;

    public Integer getId() {
        return id;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public Pago getPago() {
        return pago;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
}
