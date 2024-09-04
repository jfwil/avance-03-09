/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.modelo;

/**
 *
 * @author asfak
 */
public class Reclutado extends Persona { 
      private String codigoMilitar; 

public Reclutado(String nombre, String apellido, String cedula, String codigoMilitar) {
       super(nombre, apellido, cedula); this.codigoMilitar = codigoMilitar;
 } 

public String getCodigoMilitar() { 
      return codigoMilitar; 
}
public void setCodigoMilitar(String codigoMilitar) { 
      this.codigoMilitar = codigoMilitar; 
} 

@Override 
public String toString() { 
     return super.toString() + ", Código Militar: " + codigoMilitar; 
}

}


