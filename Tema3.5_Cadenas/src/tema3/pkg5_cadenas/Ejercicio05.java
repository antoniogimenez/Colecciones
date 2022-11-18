/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.pkg5_cadenas;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase = "  me llamo Pepe";
        
        System.out.println("***PARTE 1***");
        int posicion =0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)!=' '){
                posicion = i;
                System.out.println("La frase sin espacios al principio es:"+frase.substring(posicion));
                break;
            }
        }
        System.out.println("");
        
        System.out.println("***PARTE 2***");
        String frase2="  hola don Pepito  ";
        int posicion2 =0;
        for (int i = 0; i < frase2.length(); i++) {
            if(frase2.charAt(i)!=' '){
                posicion2 = i;
                System.out.println("La frase sin espacios al principio es:"+frase2.substring(posicion));
                break;
            }
        }
        int posicionUltima =-1;
        for (int i = frase2.length()-1; i >0; i--) {
            if(frase2.charAt(i)!=' '){
                posicionUltima = i;
                System.out.println("La frase sin espacio al principio y al final:"+frase2.substring(posicion2,posicionUltima+1));
                break;
            }
        }
        System.out.println("");
        
        System.out.println("**PARTE 3**");
        String frase4="  haberlo dicho antes  ";
        System.out.println("La frase inicial es:"+frase4);
        
        String frase5 = frase4.trim();
        
        System.out.println("La frase terminada es:"+frase5);
        

    }
}
