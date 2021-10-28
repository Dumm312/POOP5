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
public class Coche 
{
    private String asiento;
    private String marca;
    private String modelo;

    public Coche() {
    }

    public Coche(String asiento, String marca, String modelo) {
        this.asiento = asiento;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche{" + "asiento=" + asiento + ", marca=" + marca +
                ", modelo=" + modelo + '}';
    }    
}





