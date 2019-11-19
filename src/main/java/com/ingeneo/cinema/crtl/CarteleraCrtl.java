/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingeneo.cinema.crtl;

import com.ingeneo.cinema.impl.CarteleraImpl;
import com.ingeneo.cinema.model.Cartelera;
import com.ingeneo.cinema.srv.ICarteleraSrv;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author enohc
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/cartelera"})
public class CarteleraCrtl {

    @Autowired
    CarteleraImpl srv;

    @GetMapping
    public List<Cartelera> listarTodo(){
        return srv.todo();
    }
}
