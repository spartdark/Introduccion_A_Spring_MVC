/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Examen2do;

/**
 *
 * @author AuxSistemas
 */
public class DAOCuenta extends DAO{
    
    public void insertarRegistro(Cuenta a) {
    begin();
    getSession().save(a);
    commit();
    
    DAO.close();
    System.out.println("Insertado correctamente");
    }
    
}
