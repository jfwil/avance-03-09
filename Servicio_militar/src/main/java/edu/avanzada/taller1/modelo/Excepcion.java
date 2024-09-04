/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.modelo;
import java.util.Scanner;
/**
 *
 * @author asfak
 */
public class Excepcion {
    public Excepcion(){
    
    }
    public boolean esNumeroPositivo(int a){
    Scanner scanner = new Scanner(System.in);
        try{
            a = scanner.nextInt();
            scanner.nextLine();
                if(a>0 && a <= 5){
                    return true;
                }else{
                       System.out.println("El número debe ser positivo. Intente nuevamente.");
                       return false;
                }    
        }catch(Exception e){
            scanner.next();
            return false;
        }
    }
    
    public boolean esNumero(String a) {
        try {
            Integer.parseInt(a);
            return true; //Es numero
        } catch (NumberFormatException e) {
            return false; //No es numero
        }
    }
}
