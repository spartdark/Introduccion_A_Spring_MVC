/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vsm.vladimir;

import java.util.ArrayList;
//Estudiar
/**
 *
 * @author T107
 */
public class GenerarUsuarios {
    public static ArrayList<Usuario> obtenerUsuario(){
      ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
      Usuario u1=new Usuario("Juan perez","558096356",42000);
      Usuario u2=new Usuario("Ana larantes","5585696356",42000);
      Usuario u3=new Usuario("Juan gomez","5580963266",42000);
     
      Usuario u4=new Usuario("Miguel Anguel","639096356",42000);
      Usuario u5=new Usuario("Rivera Maya","3205096356",42000);
      usuarios.add(u1);
      usuarios.add(u2);
      usuarios.add(u3);
      usuarios.add(u4);
      usuarios.add(u5);
      
      return usuarios;
    }
}
