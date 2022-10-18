/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Modelos;

/**
 *
 * @author linda
 */
public class Mesa {
    private int codigo;
    private CentroDeVotacion centroVotacion;

    public Mesa(int codigo, CentroDeVotacion centroVotacion) {
        this.codigo = codigo;
        this.centroVotacion = centroVotacion;
    }

    public Mesa(){
        
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public CentroDeVotacion getCentroVotacion() {
        return centroVotacion;
    }

    public void setCentroVotacion(CentroDeVotacion centroVotacion) {
        this.centroVotacion = centroVotacion;
    }


}
