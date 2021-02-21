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
public class Administrador extends Persona{
     private Integer id;
    private Boolean estado;
    private Integer contrato;
    private Integer horario;
 private Persona persona;

    public Integer getId() {
        return id;
    }

    public Boolean getEstado() {
        return estado;
    }

    public Integer getContrato() {
        return contrato;
    }

    public Integer getHorario() {
        return horario;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void setContrato(Integer contrato) {
        this.contrato = contrato;
    }

    public void setHorario(Integer horario) {
        this.horario = horario;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
 
 
}
