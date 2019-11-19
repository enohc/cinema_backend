/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingeneo.cinema.impl;


import com.ingeneo.cinema.model.Cartelera;
import com.ingeneo.cinema.repo.ICarteleraRepo;
import com.ingeneo.cinema.srv.ICarteleraSrv;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author enohc
 */
@Service
public class CarteleraImpl implements ICarteleraSrv{
    @Autowired
    private ICarteleraRepo repo;
            
    @Override
    public List<Cartelera> todo() {
        return repo.findAll();
    }

    @Override
    public Cartelera buscar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cartelera editar(Cartelera cartelera) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cartelera crear(Cartelera cartelera) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cartelera eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
