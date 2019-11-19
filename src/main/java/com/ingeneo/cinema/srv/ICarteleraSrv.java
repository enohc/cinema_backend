/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingeneo.cinema.srv;

import com.ingeneo.cinema.model.Cartelera;
import java.util.List;

/**
 *
 * @author enohc
 */
public interface ICarteleraSrv {
    List<Cartelera> todo();
    Cartelera buscar (Integer id);
    Cartelera editar (Cartelera model);
    Cartelera crear (Cartelera model);
    Cartelera eliminar(Integer id );            
}
