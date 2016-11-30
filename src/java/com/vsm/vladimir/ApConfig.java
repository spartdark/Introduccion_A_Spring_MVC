/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vsm.vladimir;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author T107
 */
//Archivo de configuracion de tipo bean
@Configuration //logica de enlaces de los beans
public class ApConfig {
    @Bean
    ServicioCuenta CrearCuenta(){ //papa, este lo ve el controller el general es cp,p el autowired
        return new CuentaNominaImpl(); //es un hijo de servicio de cuenta
    }
}
