/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingeneo.cinema.repo;

import com.ingeneo.cinema.model.Empleado;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author enohc
 */
public interface IEmpleadoRepo extends Repository <Empleado, Integer>{    
    List<Empleado> findAll();
    //Empleado findOne (Integer id);
    //Empleado save (Empleado model);
    //void delete (Empleado model);
    
}
