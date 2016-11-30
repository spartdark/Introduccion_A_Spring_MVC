/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.exam.vl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ISC
 */
@Controller
@RequestMapping("/respuesta")
public class ControladorVista {
    
    @RequestMapping(value="/superrespuesta")
   
    public String userView(Model mod){
        Usuario n=new Usuario(1,"vladimir","vlad@gmail.com");
        mod.addAttribute("vista",n);
        
        return "ResultadoDExam";
        
        
        
    }
    @RequestMapping(value="/rest", method=RequestMethod.GET,
            headers={"Accept=application/json"})
    
    public @ResponseBody
    
    String buscarUsuarios()throws Exception{
        Map<String,ArrayList<Usuario>> singletonMap=Collections.singletonMap("ar",GeneradorDeUsuarios.modelU());
        ObjectMapper mapper=new ObjectMapper();
        return mapper.writeValueAsString(singletonMap);
        
    }
    
}
