/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

import java.util.Scanner;
import Utilidades.*;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        String nombre;
        String email;
        Persona [] listaPersona = new Persona [10];
        //int contadorArray = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Dime tu nombre: ");
            nombre = s.nextLine();
            do{
                System.out.print("Dime tu correo: ");
                email = s.nextLine();
            } while(!Utilidades.checkEmail(email));
            
            Persona persona = new Persona (nombre, email);
            listaPersona[i]=persona;
            System.out.println("--------------------- añadida "+Persona.getContadorPersonas()+".");
        }
        
        System.out.println("===============================");
        
        for (int i = 0; i < Persona.contadorPersonas; i++) {
            System.out.println(listaPersona[i].mostrar_datos());
        }
        
        System.out.println("===============================");
        
    }
    
}
