/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vsm.vladimir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author T107
 */
@Controller
@RequestMapping("/servicios-rest")
public class ControladorServicios2 {
    @RequestMapping (value="/hola",method=RequestMethod.GET,headers={"Accept=text/html"})
    
    public @ResponseBody String enviarMensaje(){
        String mensajito="Hola mundo desde REST";
        return mensajito;
    }
    @RequestMapping(value="/Usuarios-json",method = RequestMethod.GET, headers={"Accept=application/json"})
    public @ResponseBody String buscarUsuario()throws Exception{
        Map<String,ArrayList<Usuario>> singletonMap=Collections.singletonMap("usuarios", GenerarUsuarios.obtenerUsuario());
        ObjectMapper mapper=new ObjectMapper();
        return mapper.writeValueAsString(singletonMap);
        
    }
    @RequestMapping(value="/servicio-usuario",method = RequestMethod.GET, headers={"Accept=aplication/json"})
    public @ResponseBody String GenerarUsuarios() throws Exception{
        Map<String,ArrayList<Usuario>> singletonMap=Collections.singletonMap("usuarios", GenerarUsuarios.obtenerUsuario());
        ObjectMapper mapper=new ObjectMapper();
        return mapper.writeValueAsString(singletonMap);
    }
}
