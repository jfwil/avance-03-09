/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.modelo;

/**
 *
 * @author asfak
 */
public class Aplazado extends Persona {
      private String fechaAplazamiento; 

public Aplazado(String nombre, String apellido, String cedula, String fechaAplazamiento) {
     super(nombre, apellido, cedula); 
     this.fechaAplazamiento = fechaAplazamiento; 
} 

public String getFechaAplazamiento() { 
     return fechaAplazamiento; 
}
 
public void setFechaAplazamiento(String fechaAplazamiento) { 
    this.fechaAplazamiento = fechaAplazamiento;
 }

 @Override 
public String toString() { 
     return super.toString() + ", Fecha de Aplazamiento: " + fechaAplazamiento;
}
 
}

