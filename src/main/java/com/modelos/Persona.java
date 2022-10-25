/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelos;

import java.util.Date;

/**
 *
 * @author linda
 */
public class Persona {

    private int codigo;
    private String dpi;
    private int padron;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String foto;
    private String firma;
    private Date fechaDeNacimiento;
    private Direccion direccion;

    public Persona(int codigo, String dpi, int padron, String nombre1, String nombre2, String apellido1, String apellido2, String foto, String firma, Date fechaDeNacimiento, Direccion direccion) {
        this.codigo = codigo;
        this.dpi = dpi;
        this.padron = padron;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.foto = foto;
        this.firma = firma;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.direccion = direccion;
    }

    public Persona() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public int getPadron() {
        return padron;
    }

    public void setPadron(int padron) {
        this.padron = padron;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}
