/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingeneo.cinema.repo;

import com.ingeneo.cinema.model.Ciudad;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author enohc
 */
public interface ICiudadRepo extends Repository <Ciudad, Integer>{    
    List<Ciudad> findAll();
    /*Ciudad findOne (Integer id);
    Ciudad save (Ciudad model);
    void delete (Ciudad model);*/
    
}
