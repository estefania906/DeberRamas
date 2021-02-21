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
public class Equipamiento {
    private Integer id;
    private Boolean estado;
    private String descripcion;
    private ArticulosLimpieza articulo;
    private ConsumosExtras consumo;
    private Television television;

    public Integer getId() {
        return id;
    }

    public Boolean getEstado() {
        return estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArticulosLimpieza getArticulo() {
        return articulo;
    }

    public ConsumosExtras getConsumo() {
        return consumo;
    }

    public Television getTelevision() {
        return television;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setArticulo(ArticulosLimpieza articulo) {
        this.articulo = articulo;
    }

    public void setConsumo(ConsumosExtras consumo) {
        this.consumo = consumo;
    }

    public void setTelevision(Television television) {
        this.television = television;
    }
    
    
}
