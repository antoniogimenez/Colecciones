/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;

import ejemplo0.*;

/**
 *
 * @author antonio.gimenez
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //me creo una persona
        Persona persona1 = new Persona();
        
        //metemos valores en los atribotis de una clase
        persona1.setNombre("Alicia");
        persona1.setEdad(40);
        persona1.setDni("12345678A");
        persona1.setAltura(1.73);
        
        System.out.println("Objeto persona1: ");
        System.out.println("---------------------");
        System.out.println("Nombre: "+persona1.getNombre());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Dni: "+persona1.getDni());
        System.out.println("Altura: "+persona1.getAltura());
        
        System.out.println("");
        Persona persona2 = new Persona("Antonio", 18,"22222222A",1.68,70.5);
        
        System.out.println("Objeto persona2: ");
        System.out.println("---------------------");
        persona2.imprimirDatos();
//        System.out.println("Nombre: "+persona2.getNombre());
//        System.out.println("Edad: "+persona2.getEdad());
//        System.out.println("Dni: "+persona2.getDni());
//        System.out.println("Altura: "+persona2.getAltura());

        //Despues de navidad ha engordado...
        persona2.setPeso(73.5);
        persona2.imprimirDatos();

        
//        System.out.println("");
//        Persona persona3 = new Persona(persona2);//aqui metes el objeto al que quieres hacer una copia
//        
//        System.out.println("Objeto persona3: ");
//        System.out.println("---------------------");
//        persona3.imprimirDatos();
    }
    
}
