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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Estefi Mantilla
 */
@Entity
@Table(name = "detalle_documentacion")
@NamedQueries({
    @NamedQuery(name = "DetalleDocumentacion.findAll", query = "SELECT d FROM DetalleDocumentacion d")})
public class DetalleDocumentacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle_documentacion")
    private Long idDetalleDocumentacion;
    @JoinColumn(name = "id_detalle_bodega", referencedColumnName = "id_detalle_bodega")
    @ManyToOne(fetch = FetchType.LAZY)
    private DetalleBodega idDetalleBodega;
    @JoinColumn(name = "id_documentacion", referencedColumnName = "id_documentacion")
    @ManyToOne(fetch = FetchType.LAZY)
    private Documentacion idDocumentacion;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(fetch = FetchType.LAZY)
    private Producto idProducto;
    @JoinColumn(name = "id_venta", referencedColumnName = "id_venta")
    @ManyToOne(fetch = FetchType.LAZY)
    private Venta idVenta;

    public DetalleDocumentacion() {
    }

    public DetalleDocumentacion(Long idDetalleDocumentacion) {
        this.idDetalleDocumentacion = idDetalleDocumentacion;
    }

    public Long getIdDetalleDocumentacion() {
        return idDetalleDocumentacion;
    }

    public void setIdDetalleDocumentacion(Long idDetalleDocumentacion) {
        this.idDetalleDocumentacion = idDetalleDocumentacion;
    }

    public DetalleBodega getIdDetalleBodega() {
        return idDetalleBodega;
    }

    public void setIdDetalleBodega(DetalleBodega idDetalleBodega) {
        this.idDetalleBodega = idDetalleBodega;
    }

    public Documentacion getIdDocumentacion() {
        return idDocumentacion;
    }

    public void setIdDocumentacion(Documentacion idDocumentacion) {
        this.idDocumentacion = idDocumentacion;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Venta getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleDocumentacion != null ? idDetalleDocumentacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleDocumentacion)) {
            return false;
        }
        DetalleDocumentacion other = (DetalleDocumentacion) object;
        if ((this.idDetalleDocumentacion == null && other.idDetalleDocumentacion != null) || (this.idDetalleDocumentacion != null && !this.idDetalleDocumentacion.equals(other.idDetalleDocumentacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.modelo.DetalleDocumentacion[ idDetalleDocumentacion=" + idDetalleDocumentacion + " ]";
    }
    
}
