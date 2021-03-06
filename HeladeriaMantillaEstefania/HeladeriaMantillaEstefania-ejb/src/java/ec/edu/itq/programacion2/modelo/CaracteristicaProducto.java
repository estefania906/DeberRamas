/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Estefi Mantilla
 */
@Entity
@Table(name = "caracteristica_producto")
@NamedQueries({
    @NamedQuery(name = "CaracteristicaProducto.findAll", query = "SELECT c FROM CaracteristicaProducto c")})
public class CaracteristicaProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_caracteristica_producto")
    private Integer idCaracteristicaProducto;
    @JoinColumn(name = "id_caracteristica", referencedColumnName = "id_caracteristica")
    @OneToOne(fetch = FetchType.LAZY)
    private Caracteristica idCaracteristica;

    public CaracteristicaProducto() {
    }

    public CaracteristicaProducto(Integer idCaracteristicaProducto) {
        this.idCaracteristicaProducto = idCaracteristicaProducto;
    }

    public Integer getIdCaracteristicaProducto() {
        return idCaracteristicaProducto;
    }

    public void setIdCaracteristicaProducto(Integer idCaracteristicaProducto) {
        this.idCaracteristicaProducto = idCaracteristicaProducto;
    }

    public Caracteristica getIdCaracteristica() {
        return idCaracteristica;
    }

    public void setIdCaracteristica(Caracteristica idCaracteristica) {
        this.idCaracteristica = idCaracteristica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCaracteristicaProducto != null ? idCaracteristicaProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaracteristicaProducto)) {
            return false;
        }
        CaracteristicaProducto other = (CaracteristicaProducto) object;
        if ((this.idCaracteristicaProducto == null && other.idCaracteristicaProducto != null) || (this.idCaracteristicaProducto != null && !this.idCaracteristicaProducto.equals(other.idCaracteristicaProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.modelo.CaracteristicaProducto[ idCaracteristicaProducto=" + idCaracteristicaProducto + " ]";
    }
    
}
