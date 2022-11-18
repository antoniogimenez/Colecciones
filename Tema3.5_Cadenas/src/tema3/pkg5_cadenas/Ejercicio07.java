/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.pkg5_cadenas;

import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        String cadena, cadena2;
        
        System.out.println("Dime una palabra: ");
        cadena = s.nextLine();
        
        cadena = cadena.toLowerCase();
        cadena = cadena.toUpperCase();
        
        System.out.println("Dime una palabra: ");
        cadena2 = s.nextLine();
        
        cadena2 = cadena2.toLowerCase();
        cadena2 = cadena2.toUpperCase();
        
        if(cadena.equals(cadena2)){
            System.out.println("Son iguales");
        } else {
            System.out.println("No son Igulaes");
        }
        
        
    }
    
}
