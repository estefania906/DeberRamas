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
@Table(name = "producto")
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_producto")
    private Long idProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;
    @OneToMany(mappedBy = "idProducto", fetch = FetchType.LAZY)
    private List<Venta> ventaList;
    @JoinColumn(name = "id_caracteristica_producto", referencedColumnName = "id_caracteristica_producto")
    @ManyToOne(fetch = FetchType.LAZY)
    private CaracteristicaProducto idCaracteristicaProducto;
    @JoinColumn(name = "id_categoria_producto", referencedColumnName = "id_categoria_producto")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategoriaProducto idCategoriaProducto;
    @OneToMany(mappedBy = "idProducto", fetch = FetchType.LAZY)
    private List<DetalleBodega> detalleBodegaList;
    @OneToMany(mappedBy = "idProducto", fetch = FetchType.LAZY)
    private List<DetalleDocumentacion> detalleDocumentacionList;

    public Producto() {
    }

    public Producto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(Long idProducto, String nombre, boolean estado) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    public CaracteristicaProducto getIdCaracteristicaProducto() {
        return idCaracteristicaProducto;
    }

    public void setIdCaracteristicaProducto(CaracteristicaProducto idCaracteristicaProducto) {
        this.idCaracteristicaProducto = idCaracteristicaProducto;
    }

    public CategoriaProducto getIdCategoriaProducto() {
        return idCategoriaProducto;
    }

    public void setIdCategoriaProducto(CategoriaProducto idCategoriaProducto) {
        this.idCategoriaProducto = idCategoriaProducto;
    }

    public List<DetalleBodega> getDetalleBodegaList() {
        return detalleBodegaList;
    }

    public void setDetalleBodegaList(List<DetalleBodega> detalleBodegaList) {
        this.detalleBodegaList = detalleBodegaList;
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
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.modelo.Producto[ idProducto=" + idProducto + " ]";
    }
    
}
