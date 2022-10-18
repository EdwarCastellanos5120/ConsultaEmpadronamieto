/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Modelos;

/**
 *
 * @author linda
 */
public class Libro {
    private int codigo;
    private Mesa mesa;

    public Libro(int codigo, Mesa mesa) {
        this.codigo = codigo;
        this.mesa = mesa;
    }

    public Libro(){
        
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    
    
}
