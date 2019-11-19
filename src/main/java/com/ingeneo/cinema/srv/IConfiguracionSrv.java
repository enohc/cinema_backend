/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingeneo.cinema.srv;

import com.ingeneo.cinema.model.Configuracion;
import java.util.List;

/**
 *
 * @author enohc
 */
public interface IConfiguracionSrv {
    List<Configuracion> todo();
   /* Configuracion buscar (Integer id);
    Configuracion editar (Configuracion model);
    Configuracion crear (Configuracion model);
    Configuracion eliminar(Integer id ); */           
}
