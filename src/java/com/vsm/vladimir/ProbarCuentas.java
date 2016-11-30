/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vsm.vladimir;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 *
 * @author T107
 */
public class ProbarCuentas {
    public static void main(String args[]){
        System.out.println("...:::Bienvenidos a la creacion de cuentas:::...");
        ApplicationContext ctx=new AnnotationConfigApplicationContext(ApConfig.class);
        ServicioCuenta cuenta=ctx.getBean(ServicioCuenta.class);
        
    //ServicioCuenta c=new CuentaAhorroImpl();
    System.out.println(cuenta.CrearCuenta());
    /*CuentaNominaImpl d=new CuentaNominaImpl();
    System.out.println(d.CrearCuenta());
    CuentaDebitoImpl e=new CuentaDebitoImpl();
    System.out.println(e.CrearCuenta());*/
    }
    
}
