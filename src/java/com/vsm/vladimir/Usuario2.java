/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vsm.vladimir;

/**
 *
 * @author Spartdark
 */
public class Usuario2 {
private int ID;
        private String nombre;
        private String email;

    public int getID() {
        return ID;
    }

    public Usuario2(int ID, String nombre, String email) {
        this.ID = ID;
        this.nombre = nombre;
        this.email = email;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
