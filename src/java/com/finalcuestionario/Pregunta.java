/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.finalcuestionario;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class Pregunta {
    private ArrayList<Opcion> opciones;

    @Override
    public String toString() {
        return "Pregunta{" + "opciones=" + opciones + ", titulo=" + titulo + '}';
    }

    public Pregunta(ArrayList<Opcion> opciones, String titulo) {
        this.opciones = opciones;
        this.titulo = titulo;
    }
    private String titulo;

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
