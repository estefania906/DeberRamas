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
public class Habitacion {
    
    private Integer id;
    private Equipamiento equipamiento;
    private Reserva reserva;
    private Boolean estado;
    private Integer capacidad_personas;

    public Integer getId() {
        return id;
    }

    public Equipamiento getEquipamiento() {
        return equipamiento;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public Boolean getEstado() {
        return estado;
    }

    public Integer getCapacidad_personas() {
        return capacidad_personas;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEquipamiento(Equipamiento equipamiento) {
        this.equipamiento = equipamiento;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void setCapacidad_personas(Integer capacidad_personas) {
        this.capacidad_personas = capacidad_personas;
    }
    
    
}
