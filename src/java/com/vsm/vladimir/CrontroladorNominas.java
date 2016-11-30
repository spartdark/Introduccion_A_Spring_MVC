/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vsm.vladimir;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author T107
 */

 @Controller
 @RequestMapping("/servicio-cuenta")
public class CrontroladorNominas {
    @RequestMapping(value="/tipo/{tipo}" ,method=RequestMethod.GET) //{} Meter variable a /tipo
    public String ObtenerNomina(@PathVariable String tipo, Model model) { //Variable que almacena {}
        String mensaje="Tu estas interesado en un tipo de cuenta"+tipo;
        model.addAttribute("minomina", mensaje);  //, mensaje a mostrar
        return "servicioNomina";
    }
    @RequestMapping(value="/tipo" ,method=RequestMethod.GET) //{} Meter variable a /tipo
    public String ObtenerNomina( Model model) { //Variable que almacena {}
        String mensaje="Despues de / escribe el tipo de cuenta";
        model.addAttribute("minomina", mensaje);  //, mensaje a mostrar
        return "servicioNomina";
    }
}
