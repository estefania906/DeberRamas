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
@Table(name = "television")
@NamedQueries({
    @NamedQuery(name = "Television.findAll", query = "SELECT t FROM Television t")})
public class Television implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_television")
    private Integer idTelevision;
    @Column(name = "estado")
    private Boolean estado;
    @Size(max = 10)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 10)
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 10)
    @Column(name = "marca")
    private String marca;
    @Size(max = 10)
    @Column(name = "medidas")
    private String medidas;
    @OneToMany(mappedBy = "idTelevision", fetch = FetchType.LAZY)
    private List<Equipamiento> equipamientoList;

    public Television() {
    }

    public Television(Integer idTelevision) {
        this.idTelevision = idTelevision;
    }

    public Integer getIdTelevision() {
        return idTelevision;
    }

    public void setIdTelevision(Integer idTelevision) {
        this.idTelevision = idTelevision;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMedidas() {
        return medidas;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
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
        hash += (idTelevision != null ? idTelevision.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Television)) {
            return false;
        }
        Television other = (Television) object;
        if ((this.idTelevision == null && other.idTelevision != null) || (this.idTelevision != null && !this.idTelevision.equals(other.idTelevision))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.lenguaje.mantilla.Television[ idTelevision=" + idTelevision + " ]";
    }
    
}
