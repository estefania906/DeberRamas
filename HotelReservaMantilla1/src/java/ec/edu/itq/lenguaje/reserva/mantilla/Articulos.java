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
@Table(name = "articulos")
@NamedQueries({
    @NamedQuery(name = "Articulos.findAll", query = "SELECT a FROM Articulos a")})
public class Articulos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_articulos")
    private Integer idArticulos;
    @Column(name = "estado")
    private Boolean estado;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idArticulos", fetch = FetchType.LAZY)
    private List<Equipamiento> equipamientoList;

    public Articulos() {
    }

    public Articulos(Integer idArticulos) {
        this.idArticulos = idArticulos;
    }

    public Integer getIdArticulos() {
        return idArticulos;
    }

    public void setIdArticulos(Integer idArticulos) {
        this.idArticulos = idArticulos;
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

    public List<Equipamiento> getEquipamientoList() {
        return equipamientoList;
    }

    public void setEquipamientoList(List<Equipamiento> equipamientoList) {
        this.equipamientoList = equipamientoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArticulos != null ? idArticulos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articulos)) {
            return false;
        }
        Articulos other = (Articulos) object;
        if ((this.idArticulos == null && other.idArticulos != null) || (this.idArticulos != null && !this.idArticulos.equals(other.idArticulos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.lenguaje.reserva.mantilla.Articulos[ idArticulos=" + idArticulos + " ]";
    }
    
}
