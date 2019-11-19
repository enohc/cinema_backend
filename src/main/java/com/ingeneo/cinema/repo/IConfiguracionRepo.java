/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingeneo.cinema.repo;

import com.ingeneo.cinema.model.Configuracion;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author enohc
 */
public interface IConfiguracionRepo extends Repository <Configuracion, Integer>{    
    List<Configuracion> findAll();
    //Configuracion findOne (Integer id);
    //Configuracion save (Configuracion model);
    //void delete (Configuracion model);
    
}
