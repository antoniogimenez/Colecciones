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
public class Ejercicio02bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        String frase;
        System.out.println("Dime una frase: ");
        frase = s.nextLine().toLowerCase(); //para convertir la frase en minusculas
        
        int num=0, vocales=0, consonante=0, espacios=0;
        
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)== 'a' || frase.charAt(i)== 'e' || frase.charAt(i)== 'i' ||
                    frase.charAt(i)== 'o' || frase.charAt(i)== 'u'){
                vocales++;
                System.out.print("Es vocal      "+frase.charAt(i));
                System.out.println(" ");
            } else if(frase.charAt(i)=='0' || frase.charAt(i)=='1' || frase.charAt(i)=='2' || frase.charAt(i)=='3' 
                    || frase.charAt(i)=='4' || frase.charAt(i)=='5' || frase.charAt(i)=='6' || frase.charAt(i)=='7'
                    || frase.charAt(i)=='8' || frase.charAt(i)=='9'){
                System.out.println("Es Numero     "+frase.charAt(i));
                num++;
            } else if(frase.charAt(i)==' '){
                System.out.println("Es Espacio");
                espacios++;
            } else {
                System.out.println("Es consonante "+frase.charAt(i));
                consonante++;
            }
            
        }
        System.out.println("");
        System.out.println("Hay "+vocales+" vocales");
        System.out.println("Hay "+consonante+" consonantes");
        System.out.println("Hay "+num+" numeros");
        System.out.println("Hay "+espacios+" espacios");
    }
    
}
