/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sedoexamen_repaso;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuarios {

    public Usuarios(int IdUsuario, String nombre, Cuentas cuenta) {
        this.IdUsuario = IdUsuario;
        this.nombre = nombre;
        this.cuenta = cuenta;
    }
    @Id
  @Column(name="id")
    private int IdUsuario;
    @Column(name="nombre")
    private String nombre;
    
private Cuentas cuenta;

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cuentas getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuentas cuenta) {
        this.cuenta = cuenta;
    }
}

