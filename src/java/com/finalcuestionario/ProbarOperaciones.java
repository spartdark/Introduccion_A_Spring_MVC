/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.finalcuestionario;

/**
 *
 * @author T107
 */
public class ProbarOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DAOPruebaImpl d=new DAOPruebaImpl();
        Prueba p=new Prueba();
        p.setNombre("Anas");
        d.insertarRegistro(p);
    }
    
    
    
}
