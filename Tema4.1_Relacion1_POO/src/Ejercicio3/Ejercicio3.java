/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro libro1 = new Libro("Imposible","Smith",1970);
        Libro libro2 = new Libro("Moby Dick","H. Merville",1851,"L001");
        Libro libro3 = new Libro("50 sombras","Mike M.",2010);
        
        libro1.setIsbn("L002");
        
        System.out.println(libro1.getIsbn());
        System.out.println(libro2.getIsbn());
        System.out.println(libro3.getIsbn());
        
        System.out.println(libro1.citaBibliografica());
        System.out.println(libro2.citaBibliografica());
        System.out.println(libro3.citaBibliografica());
    }
    
}
