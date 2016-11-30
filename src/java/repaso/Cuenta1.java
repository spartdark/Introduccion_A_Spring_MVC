/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repaso;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author spart_000
 */
@Entity
@Table(name="cuenta1")
public class Cuenta1 {
    @Id
    @Column(name="id")
    private int idCuenta;
    @Column(name="saldo")
    private int saldo;
    @Column(name="numero")
    private int numero;

    public Cuenta1(int idCuenta, int saldo, int numero) {
        this.idCuenta = idCuenta;
        this.saldo = saldo;
        this.numero = numero;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
