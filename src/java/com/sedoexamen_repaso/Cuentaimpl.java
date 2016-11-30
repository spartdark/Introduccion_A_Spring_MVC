

package com.sedoexamen_repaso;
public class Cuentaimpl extends DAO{
    public void InsertarCuenta(Cuentas a){
        begin();
        getSession().save(a);
        commit();
        
        DAO.close();
        System.out.println("Se a insertado con exito");
        
    }
    public void ActuañizarCuenta(Cuentas b){
        begin();
        getSession().update(b);
        commit();
        DAO.close();
        System.out.println("Se a borrado con exito");
    }
}
