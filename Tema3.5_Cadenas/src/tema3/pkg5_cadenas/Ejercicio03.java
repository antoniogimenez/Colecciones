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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        String frase="hombres y mujeres tenemos los mismos derechos";
        String palabra="mujeres";
        
        System.out.println("--OPCION 1--");
        if(frase.indexOf("mujeres")!=-1){ //porque si fuese -1 es porque no esta contenida la palabra
            System.out.println("Si aparece la palabra mujeres");
        }
        
        System.out.println("--OPCION 2--");
        if(frase.contains("mujeres")){
            System.out.println("Si aparece la palabra mujeres");
        }
        
    }
    
}
