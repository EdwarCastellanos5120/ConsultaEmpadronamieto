/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelos;

import javax.sound.sampled.Line;

import com.Modelos.Linea;
import com.Modelos.Persona;

/**
 *
 * @author linda
 */

public class Firma {
    private Persona persona;
    private Linea linea;

    public Firma(Persona persona, Linea linea) {
        this.persona = persona;
        this.linea = linea;
    }

    public Firma() {

    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Linea getLinea() {
        return linea;
    }
    
    public void setLinea(Linea linea) {
        this.linea = linea;
    }

}
