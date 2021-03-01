/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.lenguaje.mantilla;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Estefi Mantilla
 */
@Entity
@Table(name = "habitacion")
@NamedQueries({
    @NamedQuery(name = "Habitacion.findAll", query = "SELECT h FROM Habitacion h")})
public class Habitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_habitacion")
    private Integer idHabitacion;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "capacidad_persona")
    private Integer capacidadPersona;
    @JoinColumn(name = "id_equipamiento", referencedColumnName = "id_equipamiento")
    @ManyToOne(fetch = FetchType.LAZY)
    private Equipamiento idEquipamiento;
    @OneToMany(mappedBy = "idHabitacion", fetch = FetchType.LAZY)
    private List<Factura> facturaList;
    @OneToMany(mappedBy = "idHabitacion", fetch = FetchType.LAZY)
    private List<Reserva> reservaList;

    public Habitacion() {
    }

    public Habitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Integer getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getCapacidadPersona() {
        return capacidadPersona;
    }

    public void setCapacidadPersona(Integer capacidadPersona) {
        this.capacidadPersona = capacidadPersona;
    }

    public Equipamiento getIdEquipamiento() {
        return idEquipamiento;
    }

    public void setIdEquipamiento(Equipamiento idEquipamiento) {
        this.idEquipamiento = idEquipamiento;
    }

    public List<Factura> getFacturaList() {
        return facturaList;
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
    }

    public List<Reserva> getReservaList() {
        return reservaList;
    }

    public void setReservaList(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHabitacion != null ? idHabitacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Habitacion)) {
            return false;
        }
        Habitacion other = (Habitacion) object;
        if ((this.idHabitacion == null && other.idHabitacion != null) || (this.idHabitacion != null && !this.idHabitacion.equals(other.idHabitacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.lenguaje.mantilla.Habitacion[ idHabitacion=" + idHabitacion + " ]";
    }
    
}
