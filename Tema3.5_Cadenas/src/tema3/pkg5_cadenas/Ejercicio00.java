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
public class Ejercicio00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        String frase;
        
        System.out.println("Dime una cadena: ");
        frase = s.nextLine();
        System.out.println("");
        
        System.out.println("***Con CahrAt***");
        for (int i = 0; i < frase.length(); i++) {
            System.out.print(frase.charAt(i)+" ");
        }
        System.out.println("");
        
        System.out.println("");
        System.out.println("***Con substring***");
        for (int i = 0; i < frase.length(); i++) {
            System.out.print(frase.substring(i,i+1)+" ");
        }
        System.out.println("");
    }
    
}
