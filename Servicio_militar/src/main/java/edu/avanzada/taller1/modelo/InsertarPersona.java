/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author asfak
 */
public class InsertarPersona {
    
    public InsertarPersona(){
    
    }
    public void hola(){
        System.out.println("HOLA");
    }
    
    public void menu(){
    Scanner scanner = new Scanner(System.in);
    List<Persona> personas = new ArrayList<>();

            int opcion = 0;
            
            boolean tipos = true;
            while(tipos){
                System.out.println("Seleccione el tipo de persona a ingresar:");
            System.out.println("1. Remiso");
            System.out.println("2. Reservista");
            System.out.println("3. Aplazado");
            System.out.println("4. Reclutado");
            System.out.println("5. Salir");
            
                
                try{
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    if(opcion>0 && opcion <= 5){
                    tipos = false;
                }   else{
                       System.out.println("El número debe ser positivo. Intente nuevamente.");
                    }    
                }catch(Exception e){
                    System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                    scanner.next();
                }
            }
            
            

            switch (opcion) {
                case 1:
                 
                    System.out.println("Ingrese la cedula del remiso:");
                    String cedulaRemiso = scanner.nextLine();
                    System.out.println("Ingrese el nombre del remiso:");
                    String nombreRemiso = scanner.nextLine();
                    System.out.println("Ingrese el apellido del remiso:");
                    String apellidoRemiso = scanner.nextLine();
                    personas.add(new Remiso(cedulaRemiso, nombreRemiso, apellidoRemiso));
                    break;
                case 2:
                   
                    System.out.println("Ingrese la cedula del reservista:");
                    String cedulaReservista = scanner.nextLine();
                    System.out.println("Ingrese el nombre del reservista:");
                    String nombreReservista = scanner.nextLine();
                    System.out.println("Ingrese el apellido del reservista:");
                    String apellidoReservista = scanner.nextLine();
                    System.out.println("Ingrese la libreta militar del reservista:");
                    String libretaMilitar = scanner.nextLine();
                    personas.add(new Reservista(cedulaReservista, nombreReservista, apellidoReservista, libretaMilitar));
                    break;
                case 3:
                    
                    System.out.println("Ingrese la cedula del aplazado:");
                    String cedulaAplazado = scanner.nextLine();
                    System.out.println("Ingrese el nombre del aplazado:");
                    String nombreAplazado = scanner.nextLine();
                    System.out.println("Ingrese el apellido del aplazado:");
                    String apellidoAplazado = scanner.nextLine();
                    System.out.println("Ingrese la fecha de aplazamiento:");
                    String fechaAplazamiento = scanner.nextLine();
                    personas.add(new Aplazado(cedulaAplazado, nombreAplazado, apellidoAplazado, fechaAplazamiento));
                    break;
                case 4:
                  
                    System.out.println("Ingrese la cedula del reclutado:");
                    String cedulaReclutado = scanner.nextLine();
                    System.out.println("Ingrese el nombre del reclutado:");
                    String nombreReclutado = scanner.nextLine();
                    System.out.println("Ingrese el apellido del reclutado:");
                    String apellidoReclutado = scanner.nextLine();
                    System.out.println("Ingrese el codigo militar:");
                    String codigoMilitar = scanner.nextLine();
                    personas.add(new Reclutado(cedulaReclutado, nombreReclutado, apellidoReclutado, codigoMilitar));
                    break;
                case 5:
                   
                   
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }

      
        System.out.println("\nPersonas ingresadas:");
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }

        scanner.close();
    }
}
