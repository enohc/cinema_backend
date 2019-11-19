/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingeneo.cinema.crtl;

import com.ingeneo.cinema.impl.CiudadImpl;
import com.ingeneo.cinema.model.Ciudad;
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
@RequestMapping({"/Ciudad"})
public class CiudadCrtl {
/*
    @Autowired
    CiudadImpl srv;

    @GetMapping
    public List<Ciudad> listarTodo(){
        return srv.todo();
    }*/
}
