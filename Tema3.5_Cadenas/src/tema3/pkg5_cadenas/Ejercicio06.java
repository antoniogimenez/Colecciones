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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        char continuar;
        String continuar2;
        
        System.out.println("Recogiendo un char por teclado");
        System.out.println("---------------------------------------");
        do{
            System.out.println("¿Quieres continuar [S | N]?");
            continuar = s.nextLine().charAt(0);
            continuar = Character.toUpperCase(continuar);
        }while(continuar=='S');
        System.out.println("");
        
        
        System.out.println("Recogiendo un String por teclado");
        System.out.println("---------------------------------------");
        do{
            System.out.println("¿Quieres continuar [S | N]?");
            continuar2 = s.nextLine().substring(0,1);
            continuar2 = continuar2.toUpperCase();
        }while(continuar2.equals("S"));
        
        
        
    }
    
}
