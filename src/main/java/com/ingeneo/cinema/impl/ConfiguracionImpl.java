/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingeneo.cinema.impl;


import com.ingeneo.cinema.model.Configuracion;
import com.ingeneo.cinema.repo.IConfiguracionRepo;
import com.ingeneo.cinema.srv.IConfiguracionSrv;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author enohc
 */
@Service
public class ConfiguracionImpl implements IConfiguracionSrv{
    @Autowired
    private IConfiguracionRepo repo;
            
    @Override
    public List<Configuracion> todo() {
        return repo.findAll();
    }
/*
    @Override
    public Configuracion buscar(Integer id) {
        return repo.findOne(id);
    }

    @Override
    public Configuracion editar(Configuracion model) {
        return repo.save(model);
    }

    @Override
    public Configuracion crear(Configuracion model) {
        return repo.save(model);
    }
*/
    
}
