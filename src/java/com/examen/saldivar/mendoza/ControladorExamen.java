/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.examen.saldivar.mendoza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author T107
 */

@Controller
@RequestMapping("/resultados")
public class ControladorExamen {
     @RequestMapping(value="/final")
   
    public String vista(Model mod){
        Evaluacion n=new Evaluacion("Ana",7);
        mod.addAttribute("vista",n);
        
        return "presentacion";
}
     @RequestMapping(value="/servicio-calificaciones", method=RequestMethod.GET,
             headers= {"Accept=application/json"})
    
   public @ResponseBody String calificaciones()throws Exception{
        Map<String,ArrayList<Evaluacion>> singletonMap=Collections.singletonMap("cal",GeneradordeCalificaciones.generarCalificaciones());
        ObjectMapper mapper=new ObjectMapper();
        return mapper.writeValueAsString(singletonMap);
        
    }
}
