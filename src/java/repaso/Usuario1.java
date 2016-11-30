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
@Table(name="usuario1")
public class Usuario1 {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="nombre")
    private String nombre;

    public Usuario1(int id, String nombre, Cuenta1 cuenta) {
        this.id = id;
        this.nombre = nombre;
        this.cuenta = cuenta;
    }
    private Cuenta1 cuenta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cuenta1 getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta1 cuenta) {
        this.cuenta = cuenta;
    }
}
