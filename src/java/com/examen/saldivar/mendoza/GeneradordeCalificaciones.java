/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.examen.saldivar.mendoza;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class GeneradordeCalificaciones {
    public static ArrayList<Evaluacion> generarCalificaciones(){
        ArrayList<Evaluacion> cal=new ArrayList<Evaluacion>();
        
        Evaluacion a=new Evaluacion("Petra",  5.8f);
        Evaluacion b=new Evaluacion("Jose", (float) 7.4);
        Evaluacion c=new Evaluacion("Roberta", (float) 8.6);
        
        cal.add(a);
        cal.add(b);
        cal.add(c);
        
        
        return cal;
        
        
    }
}
