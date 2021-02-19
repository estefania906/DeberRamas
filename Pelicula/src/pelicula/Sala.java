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
public class Sala {
    
    private Integer id;
    private String descripcion;
    private String clave;
    private Integer sillas;
    private Boolean estado;

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getClave() {
        return clave;
    }

    public Integer getSillas() {
        return sillas;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setSillas(Integer sillas) {
        this.sillas = sillas;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
}
