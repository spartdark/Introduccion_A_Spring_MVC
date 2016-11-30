/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.examen.saldivar.mendoza;

/**
 *
 * @author T107
 */
public class Evaluacion {
    private String nombre;
    private float Calificacion;

    @Override
    public String toString() {
        return "Evaluacion{" + "nombre=" + nombre + ", Calificacion=" + Calificacion + '}';
    }

    public Evaluacion(String nombre, float Calificacion) {
        this.nombre = nombre;
        this.Calificacion = Calificacion;
    }

    public float getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(float Calificacion) {
        this.Calificacion = Calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
            
}
