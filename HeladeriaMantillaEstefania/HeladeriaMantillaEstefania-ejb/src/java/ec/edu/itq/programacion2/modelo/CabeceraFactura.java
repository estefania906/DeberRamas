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

/**
 *
 * @author Estefi Mantilla
 */
@Entity
@Table(name = "cabecera_factura")
@NamedQueries({
    @NamedQuery(name = "CabeceraFactura.findAll", query = "SELECT c FROM CabeceraFactura c")})
public class CabeceraFactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cabecera_factura")
    private Integer idCabeceraFactura;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente idCliente;
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado")
    @ManyToOne(fetch = FetchType.LAZY)
    private Empleado idEmpleado;
    @OneToMany(mappedBy = "idCabeceraFactura", fetch = FetchType.LAZY)
    private List<DetalleFactura> detalleFacturaList;

    public CabeceraFactura() {
    }

    public CabeceraFactura(Integer idCabeceraFactura) {
        this.idCabeceraFactura = idCabeceraFactura;
    }

    public Integer getIdCabeceraFactura() {
        return idCabeceraFactura;
    }

    public void setIdCabeceraFactura(Integer idCabeceraFactura) {
        this.idCabeceraFactura = idCabeceraFactura;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public List<DetalleFactura> getDetalleFacturaList() {
        return detalleFacturaList;
    }

    public void setDetalleFacturaList(List<DetalleFactura> detalleFacturaList) {
        this.detalleFacturaList = detalleFacturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCabeceraFactura != null ? idCabeceraFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CabeceraFactura)) {
            return false;
        }
        CabeceraFactura other = (CabeceraFactura) object;
        if ((this.idCabeceraFactura == null && other.idCabeceraFactura != null) || (this.idCabeceraFactura != null && !this.idCabeceraFactura.equals(other.idCabeceraFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.modelo.CabeceraFactura[ idCabeceraFactura=" + idCabeceraFactura + " ]";
    }
    
}
