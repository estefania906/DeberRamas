/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.servicio;

import ec.edu.itq.programacion2.dao.EmpleadoDao;
import ec.edu.itq.programacion2.modelo.Empleado;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Estefi Mantilla
 */
@Stateless
@LocalBean
public class EmpleadoServicio {

  @EJB
private EmpleadoDao empleadoDao;

public void guardar(Empleado  empleado){
    empleadoDao.create(empleado);
}

    public List<Empleado> buscarEmpleado() {
        List<Empleado> listaEmpleado = empleadoDao.buscarEmpleado();
        return listaEmpleado;
    }
}