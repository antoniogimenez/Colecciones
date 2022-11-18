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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        String cadena;
        char caracter;
        int cont=0;
        
        System.out.println("Dime una frase: ");
        cadena = s.nextLine();
        
        System.out.println("Dime un caracter[que aparezca en la cadena]: ");
        caracter = s.nextLine().charAt(0);
        
        System.out.println("");
        System.out.println("--PARTE 1--");
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i)+" "); //mostrar la cadena
        }
        System.out.println("");
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i)==caracter){
                cont++;
            }
        }
        System.out.println("El caracter "+caracter+" aparece "+cont);
        
        
        System.out.println("");
        int espacios = 0;
        System.out.println("--PARTE 2 (Utilizando el split y metiendo la cadena en un array)--");
        String []palabras= cadena.split(" ");
        System.out.println("La cantidad de palabras es "+palabras.length);
        
        System.out.println("");
        System.out.println("--Parte 2 con charAT");
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i)==(' ')){
                espacios++;
            }
        }
        System.out.println("La cantidad de palabras es "+(espacios+1));
    }
    
}
