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
public class Pago {
    
    private Integer id;
    private String plataforma_pago;
    private Double precio;
    private String fecha_pago;
    private String descripcion;
    private Boolean estado;

    public Integer getId() {
        return id;
    }

    public String getPlataforma_pago() {
        return plataforma_pago;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPlataforma_pago(String plataforma_pago) {
        this.plataforma_pago = plataforma_pago;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
}
