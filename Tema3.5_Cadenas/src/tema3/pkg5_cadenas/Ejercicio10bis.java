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
public class Ejercicio10bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        String cadena= "La resaca de Juan es pesada";
        String palabra="esa";
        
        System.out.println("La frase es: "+cadena);
        
        int cont =0;
        int posicion =0;
        while(cadena.indexOf(palabra)!=-1){
            posicion = cadena.indexOf(palabra);
            cont++;
            cadena = cadena.substring(posicion+palabra.length());
            
            System.out.println("La frase recortada es:"+cadena);
        } 
        System.out.println("La cantidad de la palabra "+palabra+" aparece "+cont+" veces");
    }
    
}
