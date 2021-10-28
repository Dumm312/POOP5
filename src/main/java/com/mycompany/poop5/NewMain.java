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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("######## Getters y Setters ########");
        Circulo cir = new Circulo();
        System.out.println(cir);
        cir.setRadio(5);
        System.out.println(cir);
        System.out.println("Radio de cir = "+cir.getRadio());
        cir.setRadio((float)7.2);
        cir.setRadio(8.9f);
        cir.setRadio((float)7.66);
        
        float var = 5;
        cir.setRadio(var);
        
        cir.setRadio(-7);
        System.out.println(cir);
        
        System.out.println("####### Composicion 1 ########");
        Persona persona1 = new Persona();
        System.out.println(persona1);
        persona1.setNombre("Antonio");
        persona1.setApellido("Lopez");
        Fecha fNac1 = new Fecha(14,10,2021);
        persona1.setfNacimiento(fNac1);
        System.out.println(persona1);
        
        System.out.println("####### Composicion 1 ########");
        Fecha fNac2 = new Fecha(25, 10, 1999);
        Persona persona2 = new Persona("Ricardo", "Lopez", fNac2);
        System.out.println(persona2);
        
        System.out.println("####### Composicion 3 ########");
        Persona persona3 = new  Persona("Liliana", "Fuentes", 22, 4, 1998);
        System.out.println(persona3);
        
        System.out.println("\n\n");
        System.out.println("####### Composicion Coche ########");
        Persona pasajero1 = new Persona("Emmanuel", "Medrano", 16, 12, 1994, "Chofer", "Dodge", "Neon");
        System.out.println(pasajero1);
        Persona pasajero2 = new Persona("Daniel", "Medrano", 3, 1, 2002, "Copiloto", "Dodge", "Neon");
        System.out.println(pasajero2);
        Persona pasajero3 = new Persona("Katia", "Pineda", 25, 2, 1995, "Pasajero 1", "Dogde", "Neon");
        System.out.println(pasajero3);
        Persona pasajero4 = new Persona("Gabriela", "Arroyo", 9, 5, 1995, "Pasajero 2", "Dogde", "Neon");
        System.out.println(pasajero4);
    } 
}




