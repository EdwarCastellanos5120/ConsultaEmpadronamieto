/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Modelos;

/**
 *
 * @author linda
 */
public class Departamento {
    private int codigo;
    private String nombre;

    public Departamento(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Departamento(){
        
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
