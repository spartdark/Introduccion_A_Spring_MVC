/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.finalcuestionario;

import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author T107
 */
public class DAOPruebaImpl extends DAO{
    
    public void insertarRegistro(Prueba p) {
    begin();
    getSession().save(p);
    commit();
    
    DAO.close();
    System.out.println("Insertado correctamente");
    }
 
  
    public List<Prueba> buscarTodosRegistros() {
        begin();
        Query q = getSession().createQuery("from Prueba");
        List<Prueba> registros = (List<Prueba>)q.list();// resgistros el cualquier nombre de nuestro array
        commit();
        DAO.close();
         
return registros; 
        
      
    }
    
 public void borrarproducto(Prueba p){
            begin();
             getSession().delete(p);
            commit();
            DAO.close();
 }   
 public Prueba buscarporID(int id){
     begin();
     Query q= getSession().createQuery("from Prueba where id=:id");
     q.setInteger("id", id);
     Prueba p= (Prueba) q.uniqueResult();
     commit();
     return p;
 }
    
}
