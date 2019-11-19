/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingeneo.cinema.impl;


import com.ingeneo.cinema.model.Empleado;
import com.ingeneo.cinema.repo.IEmpleadoRepo;
import com.ingeneo.cinema.srv.IEmpleadoSrv;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author enohc
 */
@Service
public class EmpleadoImpl implements IEmpleadoSrv{
    @Autowired
    private IEmpleadoRepo repo;
            
    @Override
    public List<Empleado> todo() {
        return repo.findAll();
    }
/*
    @Override
    public Empleado buscar(Integer id) {
        return repo.findOne(id);
    }

    @Override
    public Empleado editar(Empleado model) {
        return repo.save(model);
    }

    @Override
    public Empleado crear(Empleado model) {
        return repo.save(model);
    }

    @Override
    public Empleado eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}
