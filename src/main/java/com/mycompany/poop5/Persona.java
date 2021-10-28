/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop5;

/**
 *
 * @author Piixxel
 */
public class Persona 
{
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;
    private Coche carro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }

    public Persona(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        /*Opcion 1
        Fecha fecha3 = new Fecha(dia, mes, anio);
        this.fNacimiento = fecha3;*/
        //Opcion 2
        /*fNacimiento = new Fecha();
        fNacimiento.setDia(dia);
        fNacimiento.setMes(mes);
        fNacimiento.setAnio(anio);*/
        //Opcion 3
        fNacimiento = new Fecha(dia, mes, anio);
    }
    
    public Persona(String nombre, String apellido, int dia, int mes, int anio, 
            String asiento, String marcaAuto, String modeloAuto){
        this.nombre = nombre;
        this.apellido = apellido;
        fNacimiento = new Fecha(dia, mes, anio);
        carro = new Coche(asiento, marcaAuto, modeloAuto);
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + 
                ", fNacimiento=" + fNacimiento + ", carro=" + carro + '}';
    }
}



