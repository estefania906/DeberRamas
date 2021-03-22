/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.control;

import ec.edu.itq.programacion2.modelo.CabeceraFactura;
import ec.edu.itq.programacion2.modelo.CategoriaProducto;
import ec.edu.itq.programacion2.modelo.DetalleFactura;
import ec.edu.itq.programacion2.modelo.Persona;
import ec.edu.itq.programacion2.modelo.Cliente;
import ec.edu.itq.programacion2.modelo.Empleado;
import ec.edu.itq.programacion2.modelo.Producto;
import ec.edu.itq.programacion2.servicio.ProductoServicio;
import ec.edu.itq.programacion2.servicio.CabeceraFacturaServicio;
import ec.edu.itq.programacion2.servicio.DetalleFacturaServicio;
import ec.edu.itq.programacion2.servicio.EmpleadoServicio;
import ec.edu.itq.programacion2.servicio.ClienteServicio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Estefi Mantilla
 */
@ManagedBean
@ViewScoped
public class DetalleFacturaControl implements Serializable {

    private CabeceraFactura cabecerafactura;
    private List<CabeceraFactura> listaCabeceraFactura;

    private List<DetalleFactura> listaDetalleFactura;
    private DetalleFactura detallefactura;

    private List<SelectItem> selectItemProducto;
    private Integer idProducto;
    private Map<Integer, Producto> mapaProducto;

    private List<SelectItem> selectItemEmpleado;
    private Integer idEmpleado;
    private Map<Integer, Empleado> mapaEmpleado;

    private Cliente cliente;

    @EJB
    private ProductoServicio productoServicio;
    @EJB
    private CabeceraFacturaServicio cabecerafacturaServicio;
    @EJB
    private DetalleFacturaServicio detallefacturaServicio;
    @EJB
    private EmpleadoServicio empleadoServicio;
    @EJB
    private ClienteServicio clienteServicio;

    @PostConstruct
    public void init() {
        listaDetalleFactura = new ArrayList<>();
        cabecerafactura = new CabeceraFactura();
        detallefactura = new DetalleFactura();
        cabecerafactura.setIdCliente(new Cliente());
        crearSelectItemProducto(buscarProducto());
        crearSelectItemEmpleado(buscarEmpleado());
        buscarDetalleFactura();
        buscarCabeceraFactura();

    }

    private void buscarCabeceraFactura() {
        listaCabeceraFactura = cabecerafacturaServicio.buscarCabeceraFactura();
    }

    private void buscarDetalleFactura() {
        listaDetalleFactura = detallefacturaServicio.buscarDetalleFactura();
    }

    private List<Producto> buscarProducto() {
        List<Producto> listaProducto = productoServicio.buscarProducto();
        mapaProducto = new HashMap<>();
        for (Producto producto : listaProducto) {
            mapaProducto.put(producto.getIdProducto(), producto);
        }
        return listaProducto;
    }

    private void crearSelectItemProducto(List<Producto> listaProducto) {
        selectItemProducto = new ArrayList<>();
        for (Producto producto : listaProducto) {
            SelectItem itemDetalleFactura = new SelectItem(producto.getIdProducto(), producto.getNombre());
            selectItemProducto.add(itemDetalleFactura);
        }
    }

    private List<Empleado> buscarEmpleado() {
        List<Empleado> listaEmpleado = empleadoServicio.buscarEmpleado();
        mapaEmpleado = new HashMap<>();
        for (Empleado empleado : listaEmpleado) {
            mapaEmpleado.put(empleado.getIdEmpleado(), empleado);
        }
        return listaEmpleado;
    }

    private void crearSelectItemEmpleado(List<Empleado> listaEmpleado) {
        selectItemEmpleado = new ArrayList<>();
        for (Empleado empleado : listaEmpleado) {
            SelectItem itemDetalleFactura1 = new SelectItem(empleado.getIdEmpleado(), empleado.getIdPersona().getNombres(), empleado.getIdPersona().getApellidos());
            selectItemEmpleado.add(itemDetalleFactura1);
        }
    }

    public void añadirProducto() {
        Producto producto = mapaProducto.get(idProducto);
        detallefactura.setIdProducto(producto);
        detallefacturaServicio.guardar(detallefactura);
        DetalleFactura detalle = new DetalleFactura();
        detalle.setIdCabeceraFactura(cabecerafactura);
        buscarProducto();

    }

    public void Subtotal() {
        
         for (DetalleFactura detallefactura : listaDetalleFactura) {            
        detallefactura.setSubtotal(detallefactura.getCantidad() * detallefactura.getIdProducto().getPrecion());
    }
         
    }
    public void Iva() {
        detallefactura.setIva(detallefactura.getSubtotal() * 1.12);
    }

    public void Total() {
        detallefactura.setTotal(detallefactura.getSubtotal() + detallefactura.getIva());
    }

    public void añadirCliente() {
        Empleado empleado = mapaEmpleado.get(idEmpleado);
        cabecerafactura.setIdEmpleado(empleado);
        cabecerafacturaServicio.guardar(cabecerafactura);
        buscarEmpleado();
        cabecerafactura.setDetalleFacturaList(listaDetalleFactura);
    }

    public void guardar() {
        limpiar();
        Subtotal();
        Iva();
        Total();
    }

    public void limpiar() {
        cliente = new Cliente();
        this.detallefactura = new DetalleFactura();
        this.cabecerafactura = new CabeceraFactura();
        idProducto = null;
        idEmpleado = null;
        this.listaDetalleFactura = new ArrayList<>();
    }

    public void actualizar(DetalleFactura detallefactura) {
        this.detallefactura = detallefactura;
    }

    public DetalleFactura getDetalleFactura() {
        return detallefactura;
    }

    public void setDetalleFactura(DetalleFactura detallefactura) {
        this.detallefactura = detallefactura;
    }

    public CabeceraFactura getCabeceraFactura() {
        return cabecerafactura;
    }

    public void setCabeceraFactura(CabeceraFactura cabecerafactura) {
        this.cabecerafactura = cabecerafactura;
    }

    public List<DetalleFactura> getListaDetalleFactura() {
        return listaDetalleFactura;
    }

    public void setListaDetalleFactura(List<DetalleFactura> listaDetalleFactura) {
        this.listaDetalleFactura = listaDetalleFactura;
    }

    public List<CabeceraFactura> getListaCabeceraFactura() {
        return listaCabeceraFactura;
    }

    public void setListaCabeceraFactura(List<CabeceraFactura> listaCabeceraFactura) {
        this.listaCabeceraFactura = listaCabeceraFactura;
    }

    public List<SelectItem> getSelectItemProducto() {
        return selectItemProducto;
    }

    public void setSelectItemProducto(List<SelectItem> selectItemProducto) {
        this.selectItemProducto = selectItemProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public List<SelectItem> getSelectItemEmpleado() {
        return selectItemEmpleado;
    }

    public void setSelectItemEmpleado(List<SelectItem> selectItemEmpleado) {
        this.selectItemEmpleado = selectItemEmpleado;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

}
