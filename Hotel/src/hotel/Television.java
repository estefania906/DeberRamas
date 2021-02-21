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
public class Television extends Equipamiento{
     private Integer id;
    private Boolean estado;
    private String descripcion;
     private Equipamiento equipamiento;
private String modelo;
private String marca;
private String medidas;

    public Integer getId() {
        return id;
    }

    public Boolean getEstado() {
        return estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Equipamiento getEquipamiento() {
        return equipamiento;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getMedidas() {
        return medidas;
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

    public void setEquipamiento(Equipamiento equipamiento) {
        this.equipamiento = equipamiento;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }

    
    
}
