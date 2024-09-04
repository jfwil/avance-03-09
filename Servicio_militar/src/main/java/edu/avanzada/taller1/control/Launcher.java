/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.avanzada.taller1.control;

/**
 *
 * @author asfak
 */
import edu.avanzada.taller1.modelo.Aplazado;
import edu.avanzada.taller1.modelo.Persona;
import edu.avanzada.taller1.modelo.Reclutado;
import edu.avanzada.taller1.modelo.Remiso;
import edu.avanzada.taller1.modelo.InsertarPersona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        InsertarPersona test = new InsertarPersona();
        test.menu();
    }
}
