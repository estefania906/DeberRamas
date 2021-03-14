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
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Long idCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "empresa")
    private String empresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_visitas")
    private short numeroVisitas;
    @OneToMany(mappedBy = "idCliente", fetch = FetchType.LAZY)
    private List<Venta> ventaList;
    @OneToMany(mappedBy = "idCliente", fetch = FetchType.LAZY)
    private List<Facturacion> facturacionList;
    @JoinColumn(name = "id_estado_civil", referencedColumnName = "id_estado")
    @ManyToOne(fetch = FetchType.LAZY)
    private EstadoCivil idEstadoCivil;
    @JoinColumn(name = "id_genero", referencedColumnName = "id_genero")
    @ManyToOne(fetch = FetchType.LAZY)
    private Genero idGenero;
    @JoinColumn(name = "id_nacionalidad", referencedColumnName = "id_nacionalidad")
    @ManyToOne(fetch = FetchType.LAZY)
    private Nacionalidad idNacionalidad;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne(fetch = FetchType.LAZY)
    private Persona idPersona;
    @JoinColumn(name = "id_tipo_cliente", referencedColumnName = "id_tipo_cliente")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoCliente idTipoCliente;

    public Cliente() {
    }

    public Cliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(Long idCliente, String empresa, short numeroVisitas) {
        this.idCliente = idCliente;
        this.empresa = empresa;
        this.numeroVisitas = numeroVisitas;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public short getNumeroVisitas() {
        return numeroVisitas;
    }

    public void setNumeroVisitas(short numeroVisitas) {
        this.numeroVisitas = numeroVisitas;
    }

    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    public List<Facturacion> getFacturacionList() {
        return facturacionList;
    }

    public void setFacturacionList(List<Facturacion> facturacionList) {
        this.facturacionList = facturacionList;
    }

    public EstadoCivil getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(EstadoCivil idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public Genero getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Genero idGenero) {
        this.idGenero = idGenero;
    }

    public Nacionalidad getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Nacionalidad idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public TipoCliente getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(TipoCliente idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.modelo.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
