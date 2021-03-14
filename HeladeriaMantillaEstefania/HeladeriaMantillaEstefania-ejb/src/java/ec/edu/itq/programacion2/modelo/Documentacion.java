/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "documentacion")
@NamedQueries({
    @NamedQuery(name = "Documentacion.findAll", query = "SELECT d FROM Documentacion d")})
public class Documentacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_documentacion")
    private Long idDocumentacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idDocumentacion", fetch = FetchType.LAZY)
    private List<DetalleDocumentacion> detalleDocumentacionList;

    public Documentacion() {
    }

    public Documentacion(Long idDocumentacion) {
        this.idDocumentacion = idDocumentacion;
    }

    public Documentacion(Long idDocumentacion, String descripcion) {
        this.idDocumentacion = idDocumentacion;
        this.descripcion = descripcion;
    }

    public Long getIdDocumentacion() {
        return idDocumentacion;
    }

    public void setIdDocumentacion(Long idDocumentacion) {
        this.idDocumentacion = idDocumentacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<DetalleDocumentacion> getDetalleDocumentacionList() {
        return detalleDocumentacionList;
    }

    public void setDetalleDocumentacionList(List<DetalleDocumentacion> detalleDocumentacionList) {
        this.detalleDocumentacionList = detalleDocumentacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocumentacion != null ? idDocumentacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documentacion)) {
            return false;
        }
        Documentacion other = (Documentacion) object;
        if ((this.idDocumentacion == null && other.idDocumentacion != null) || (this.idDocumentacion != null && !this.idDocumentacion.equals(other.idDocumentacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.modelo.Documentacion[ idDocumentacion=" + idDocumentacion + " ]";
    }
    
}
