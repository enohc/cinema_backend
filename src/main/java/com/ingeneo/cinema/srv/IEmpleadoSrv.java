/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingeneo.cinema.srv;

import com.ingeneo.cinema.model.Empleado;
import java.util.List;

/**
 *
 * @author enohc
 */
public interface IEmpleadoSrv {
    List<Empleado> todo();
    /*Empleado buscar (Integer id);
    Empleado editar (Empleado model);
    Empleado crear (Empleado model);
    Empleado eliminar(Integer id );        */    
}
