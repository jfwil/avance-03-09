/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.modelo;

/**
 *
 * @author asfak
 */

public class Persona { 
      protected String nombre;
      protected String apellido; 
      protected String cedula;

public Persona (String nombre, String apellido, String cedula) { 
      this.nombre = nombre; 
      this.apellido = apellido; 
      this.cedula = cedula; 
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
public String getCedula() {
      return cedula; 
} 
public void setCedula(String cedula) {
      this.cedula = cedula; 
}

@Override
 public String toString() {
 return nombre + " " + apellido + ", Cédula: " + cedula; 
}

}

