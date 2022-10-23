/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Modelos;

/**
 *
 * @author linda
 */
public class Linea {
    private int codigo;
    private Hoja hoja;
    private Persona persona;

    public Linea(int codigo, Hoja hoja, Persona persona) {
        this.codigo = codigo;
        this.hoja = hoja;
        this.persona = persona;
    }

    public Linea(){
        
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Hoja getHoja() {
        return hoja;
    }

    public void setHoja(Hoja hoja) {
        this.hoja = hoja;
    }
    
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
