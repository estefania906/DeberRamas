/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author Estefi Mantilla
 */
public class Persona {
    private String nombres;
    private String apellidos;
    private String razon;
    private Integer identificacion;
    private String genero;
    private Integer edad;
    private String rol;
    private String correo;
    private Integer telefono;
    private String direccion;

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getRazon() {
        return razon;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getRol() {
        return rol;
    }

    public String getCorreo() {
        return correo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
