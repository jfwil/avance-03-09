/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.modelo;

/**
 *
 * @author asfak
 */
public class Reservista extends Persona {
    private String libretaMilitar; 

    public Reservista(String cedula, String nombre, String apellido, String libretaMilitar) {
        super(cedula, nombre, apellido); 
        this.libretaMilitar = libretaMilitar;
    } 

    public String getLibretaMilitar() { 
        return libretaMilitar; 
    }

    public void setLibretaMilitar(String libretaMilitar) {
        this.libretaMilitar = libretaMilitar; 
    }

    @Override 
    public String toString() { 
        return super.toString() + ", Libreta Militar: " + libretaMilitar; 
    }
}
