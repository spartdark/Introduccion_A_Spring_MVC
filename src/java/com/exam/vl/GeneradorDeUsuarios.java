/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.exam.vl;

import java.util.ArrayList;

/**
 *
 * @author ISC
 */
public class GeneradorDeUsuarios {
    public static ArrayList<Usuario> modelU(){
        
        ArrayList<Usuario> ar=new ArrayList<Usuario>();
           
            Usuario e=new Usuario(1,"val","1234");
            Usuario r=new Usuario(2,"jd","234");
            
            ar.add(e);
            ar.add(r);
            
            return ar;
            
            
            
        
        
    }
    
}

