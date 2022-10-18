/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Modelos;

/**
 *
 * @author linda
 */
public class CentroDeVotacion {
    private int codigo;
    private String nombre;
    private Direccion direccion;

    public CentroDeVotacion(int codigo, String nombre, Direccion direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public CentroDeVotacion(){
        
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
}
