/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingeneo.cinema.srv;

import com.ingeneo.cinema.model.Ciudad;
import java.util.List;

/**
 *
 * @author enohc
 */
public interface ICiudadSrv {
    List<Ciudad> todo();
    Ciudad buscar (Integer id);
    Ciudad editar (Ciudad model);
    Ciudad crear (Ciudad model);
    Ciudad eliminar(Integer id );            
}
