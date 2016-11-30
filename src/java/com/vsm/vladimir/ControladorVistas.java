/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vsm.vladimir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author T107
 */
@Controller //@ anotacion
@RequestMapping(value="/empresax") //a donde se dirige para ver donde el cliente lo ve
public class ControladorVistas {
    @Autowired ServicioCuenta cuenta;// enlace con el model "cuenta" es un bean (@autowired nombre de la clase nombre de algo, declarando sus metodos y atributos automaticasmente se convierte en bean   
    @RequestMapping(value="/nominas.aspx" )
    public String accesoaNominas(Model model){
        model.addAttribute("cualquiernombre", cuenta.CrearCuenta());//logica
        return "administracion";
    }
    @RequestMapping(value="/admin.htp")
    public String accesoaAdministracion(){
        return "administracion";
    }
    
}
