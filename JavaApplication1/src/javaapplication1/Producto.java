/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author freddyxaviercatucuambaecheverria
 */
public class Producto {
    
    private String nombre;
    private Double precio;
    private String codigo;
    private String seccion;
    private Integer cantidad;
    private String descripcion;
    private Byte imagen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Byte getImagen() {
        return imagen;
    }

    public void setImagen(Byte imagen) {
        this.imagen = imagen;
    }
    
    public void verImagen(){
        System.out.println("Imprime imagen horizontal");
    }
    public void verImagen(String posicion){
        if(posicion.equals("vertical"))
        System.out.println("Imprime imagen vertical");
    }

//    @Override
//    public String toString() {
//        return  "nombre=" + nombre + ", precio=" + precio;
//    }
//    
    
    
    
    
}
