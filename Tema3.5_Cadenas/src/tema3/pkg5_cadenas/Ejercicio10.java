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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        String cadena= "uno dos tres uno,dos,tres uno dos tres";
        String palabra="tres";
        
        String frasenueva = cadena.replace(",", " ");
        String frasenueva1 = frasenueva.replace(".", " ");
        System.out.println("La frase es: "+cadena);
        
        String []frase= frasenueva1.split(" ");
        int cont =0;
        for (int i = 0; i < frase.length; i++) {
            System.out.println(frase[i]);
            if(frase[i].equals(palabra)){
                cont++;
            } 
        }
        System.out.println("La cantidad de la palabra "+palabra+" es "+cont);
    }
    
}
