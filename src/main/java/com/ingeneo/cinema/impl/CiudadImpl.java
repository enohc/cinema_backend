/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingeneo.cinema.impl;


import com.ingeneo.cinema.model.Ciudad;
import com.ingeneo.cinema.repo.ICiudadRepo;
import com.ingeneo.cinema.srv.ICiudadSrv;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author enohc
 */
@Service
public class CiudadImpl implements ICiudadSrv{
    @Autowired
    private ICiudadRepo repo;
            
    @Override
    public List<Ciudad> todo() {
        return repo.findAll();
    }

    @Override
    public Ciudad buscar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ciudad editar(Ciudad model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ciudad crear(Ciudad model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ciudad eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
