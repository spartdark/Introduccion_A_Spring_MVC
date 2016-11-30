/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repaso;

/**
 *
 * @author spart_000
 */
public class CuentaImpl extends DAO{
    public void InsertarCuenta(Cuenta1 a){
        begin();
        getSession().save(a);
        commit();
        DAO.close();
        System.out.println("Insertado");
    }
}
