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
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        String cadena= "el rock mola siempre";
        String cadena2="";
        
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i)=='o'){
                cadena2 = cadena2 + '0';
                
            } else if (cadena.charAt(i)=='i'){
                cadena2 = cadena2 + '1';
            }else {
                cadena2 = cadena2 + cadena.charAt(i);
            }
        }
        
        cadena2 = cadena2.toUpperCase();
        System.out.println("La frase sin espacios es -->"+cadena2);
    }
    
}
