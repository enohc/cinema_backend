/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingeneo.cinema.repo;

import com.ingeneo.cinema.model.Cartelera;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author enohc
 */
public interface ICarteleraRepo extends Repository <Cartelera, Integer>{    
    List<Cartelera> findAll();
    //Cartelera findOne (Integer id);
    //Cartelera save (Cartelera model);
    //void delete (Cartelera model);
    
}
