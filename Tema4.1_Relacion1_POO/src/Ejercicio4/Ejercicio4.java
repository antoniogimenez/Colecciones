/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona ("Antonio", "antoniogimenez@gmail.com");
        Persona persona2 = new Persona ("Pedro", "pedrolopez@gmail.com");
        
        System.out.println(persona1.mostrar_datos());
        System.out.println(persona2.mostrar_datos());
        
        System.out.println("-------------------------------------");
        System.out.println("Mediante Arrays");
        
        Persona [] listaPersona = new Persona [10];
        
        Persona unaPersona;
        int totalPersonas = 0;
        
        unaPersona = new Persona ("Antonio", "antoniogimenez@gmail.com");
        listaPersona[totalPersonas] = unaPersona;
        totalPersonas ++;
        
        unaPersona = new Persona ("Pedro", "pedrolopez@gmail.com");
        listaPersona[totalPersonas] = unaPersona;
        totalPersonas ++;
        
        unaPersona = new Persona ("Messi", "messicuchitini@gmail.com");
        listaPersona[totalPersonas] = unaPersona;
        totalPersonas ++;
        
        for (int i = 0; i < totalPersonas; i++) {
            System.out.println(listaPersona[i].mostrar_datos());
        }
        
        
        
    }
    
}
