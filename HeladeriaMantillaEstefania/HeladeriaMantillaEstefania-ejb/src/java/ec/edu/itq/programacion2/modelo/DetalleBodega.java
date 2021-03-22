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
import javax.validation.constraints.Size;

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
    private Integer idDetalleBodega;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_compra")
    private Double precioCompra;
    @Column(name = "precio_venta")
    private Double precioVenta;
    @Column(name = "stock_inicial")
    private Integer stockInicial;
    @Column(name = "stock_final")
    private Integer stockFinal;
    @Column(name = "salidas")
    private Integer salidas;
    @Size(max = 20)
    @Column(name = "fecha_produccion")
    private String fechaProduccion;
    @Size(max = 20)
    @Column(name = "fecha_vencimiento")
    private String fechaVencimiento;
    @JoinColumn(name = "id_bodega", referencedColumnName = "id_bodega")
    @ManyToOne(fetch = FetchType.LAZY)
    private Bodega idBodega;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(fetch = FetchType.LAZY)
    private Producto idProducto;

    public DetalleBodega() {
    }

    public DetalleBodega(Integer idDetalleBodega) {
        this.idDetalleBodega = idDetalleBodega;
    }

    public Integer getIdDetalleBodega() {
        return idDetalleBodega;
    }

    public void setIdDetalleBodega(Integer idDetalleBodega) {
        this.idDetalleBodega = idDetalleBodega;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getStockInicial() {
        return stockInicial;
    }

    public void setStockInicial(Integer stockInicial) {
        this.stockInicial = stockInicial;
    }

    public Integer getStockFinal() {
        return stockFinal;
    }

    public void setStockFinal(Integer stockFinal) {
        this.stockFinal = stockFinal;
    }

    public Integer getSalidas() {
        return salidas;
    }

    public void setSalidas(Integer salidas) {
        this.salidas = salidas;
    }

    public String getFechaProduccion() {
        return fechaProduccion;
    }

    public void setFechaProduccion(String fechaProduccion) {
        this.fechaProduccion = fechaProduccion;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
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
