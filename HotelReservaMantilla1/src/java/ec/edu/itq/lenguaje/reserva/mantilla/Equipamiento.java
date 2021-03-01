/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.lenguaje.reserva.mantilla;

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
import javax.validation.constraints.Size;

/**
 *
 * @author Estefi Mantilla
 */
@Entity
@Table(name = "equipamiento")
@NamedQueries({
    @NamedQuery(name = "Equipamiento.findAll", query = "SELECT e FROM Equipamiento e")})
public class Equipamiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_equipamiento")
    private Integer idEquipamiento;
    @Column(name = "estado")
    private Boolean estado;
    @Size(max = 10)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idEquipamiento", fetch = FetchType.LAZY)
    private List<Habitacion> habitacionList;
    @JoinColumn(name = "id_articulos", referencedColumnName = "id_articulos")
    @ManyToOne(fetch = FetchType.LAZY)
    private Articulos idArticulos;
    @JoinColumn(name = "id_consumo", referencedColumnName = "id_consumo")
    @ManyToOne(fetch = FetchType.LAZY)
    private Consumo idConsumo;
    @JoinColumn(name = "id_television", referencedColumnName = "id_television")
    @ManyToOne(fetch = FetchType.LAZY)
    private Television idTelevision;

    public Equipamiento() {
    }

    public Equipamiento(Integer idEquipamiento) {
        this.idEquipamiento = idEquipamiento;
    }

    public Integer getIdEquipamiento() {
        return idEquipamiento;
    }

    public void setIdEquipamiento(Integer idEquipamiento) {
        this.idEquipamiento = idEquipamiento;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Habitacion> getHabitacionList() {
        return habitacionList;
    }

    public void setHabitacionList(List<Habitacion> habitacionList) {
        this.habitacionList = habitacionList;
    }

    public Articulos getIdArticulos() {
        return idArticulos;
    }

    public void setIdArticulos(Articulos idArticulos) {
        this.idArticulos = idArticulos;
    }

    public Consumo getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(Consumo idConsumo) {
        this.idConsumo = idConsumo;
    }

    public Television getIdTelevision() {
        return idTelevision;
    }

    public void setIdTelevision(Television idTelevision) {
        this.idTelevision = idTelevision;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipamiento != null ? idEquipamiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipamiento)) {
            return false;
        }
        Equipamiento other = (Equipamiento) object;
        if ((this.idEquipamiento == null && other.idEquipamiento != null) || (this.idEquipamiento != null && !this.idEquipamiento.equals(other.idEquipamiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.lenguaje.reserva.mantilla.Equipamiento[ idEquipamiento=" + idEquipamiento + " ]";
    }
    
}
