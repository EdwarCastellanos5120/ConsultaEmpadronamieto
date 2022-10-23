/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelos;

/**
 *
 * @author linda
 */
public class Direccion {
   private int codigo;
   private float longitud;
   private float latitud;
   private int zona;
   private int calle;
   private int avenida;
   private int casa;
   private Municipio municipio;

    public Direccion(int codigo, float longitud, float latitud, int zona, int calle, int avenida, int casa, Municipio municipio) {
        this.codigo = codigo;
        this.longitud = longitud;
        this.latitud = latitud;
        this.zona = zona;
        this.calle = calle;
        this.avenida = avenida;
        this.casa = casa;
        this.municipio = municipio;
    }

   
    public Direccion(){
        
    }
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public int getCalle() {
        return calle;
    }

    public void setCalle(int calle) {
        this.calle = calle;
    }

    public int getAvenida() {
        return avenida;
    }

    public void setAvenida(int avenida) {
        this.avenida = avenida;
    }

    public int getCasa() {
        return casa;
    }

    public void setCasa(int casa) {
        this.casa = casa;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
   
   
}
