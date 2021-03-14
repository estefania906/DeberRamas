/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Estefi Mantilla
 */
@Entity
@Table(name = "detalle_bodega")
@NamedQueries({
    @NamedQuery(name = "DetalleBodega.findAll", query = "SELECT d FROM DetalleBodega d")})
public class DetalleBodega implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle_bodega")
    private Long idDetalleBodega;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_compra")
    private double precioCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_venta")
    private double precioVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stock_inicial")
    private long stockInicial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stock_final")
    private long stockFinal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_produccion")
    @Temporal(TemporalType.DATE)
    private Date fechaProduccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "entradas")
    private int entradas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "salidas")
    private int salidas;
    @JoinColumn(name = "id_bodega", referencedColumnName = "id_bodega")
    @ManyToOne(fetch = FetchType.LAZY)
    private Bodega idBodega;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(fetch = FetchType.LAZY)
    private Producto idProducto;
    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor")
    @ManyToOne(fetch = FetchType.LAZY)
    private Proveedores idProveedor;
    @OneToMany(mappedBy = "idDetalleBodega", fetch = FetchType.LAZY)
    private List<DetalleDocumentacion> detalleDocumentacionList;

    public DetalleBodega() {
    }

    public DetalleBodega(Long idDetalleBodega) {
        this.idDetalleBodega = idDetalleBodega;
    }

    public DetalleBodega(Long idDetalleBodega, double precioCompra, double precioVenta, long stockInicial, long stockFinal, Date fechaProduccion, Date fechaVencimiento, int entradas, int salidas) {
        this.idDetalleBodega = idDetalleBodega;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stockInicial = stockInicial;
        this.stockFinal = stockFinal;
        this.fechaProduccion = fechaProduccion;
        this.fechaVencimiento = fechaVencimiento;
        this.entradas = entradas;
        this.salidas = salidas;
    }

    public Long getIdDetalleBodega() {
        return idDetalleBodega;
    }

    public void setIdDetalleBodega(Long idDetalleBodega) {
        this.idDetalleBodega = idDetalleBodega;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public long getStockInicial() {
        return stockInicial;
    }

    public void setStockInicial(long stockInicial) {
        this.stockInicial = stockInicial;
    }

    public long getStockFinal() {
        return stockFinal;
    }

    public void setStockFinal(long stockFinal) {
        this.stockFinal = stockFinal;
    }

    public Date getFechaProduccion() {
        return fechaProduccion;
    }

    public void setFechaProduccion(Date fechaProduccion) {
        this.fechaProduccion = fechaProduccion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

    public int getSalidas() {
        return salidas;
    }

    public void setSalidas(int salidas) {
        this.salidas = salidas;
    }

    public Bodega getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(Bodega idBodega) {
        this.idBodega = idBodega;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Proveedores getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedores idProveedor) {
        this.idProveedor = idProveedor;
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
        hash += (idDetalleBodega != null ? idDetalleBodega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleBodega)) {
            return false;
        }
        DetalleBodega other = (DetalleBodega) object;
        if ((this.idDetalleBodega == null && other.idDetalleBodega != null) || (this.idDetalleBodega != null && !this.idDetalleBodega.equals(other.idDetalleBodega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.modelo.DetalleBodega[ idDetalleBodega=" + idDetalleBodega + " ]";
    }
    
}
