/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelicula;

/**
 *
 * @author Estefi Mantilla
 */
public class Cliente extends Persona{
    
    private Integer id;
    private Integer codigo;
    private Boolean estado;
    private Persona persona;

    public Integer getId() {
        return id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
}
