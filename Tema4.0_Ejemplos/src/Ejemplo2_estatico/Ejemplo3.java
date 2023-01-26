/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo2_estatico;

/**
 *
 * @author antonio.gimenez
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona ("Alicia", 23);
        System.out.println("Personas creadas: "+Persona.getContadorPersonas());
        
        Persona p2 = new Persona ("Celia", 30);
        System.out.println("Personas creadas: "+Persona.getContadorPersonas());
        
        Persona p3 = new Persona ("Fran", 31);
        System.out.println("Personas creadas: "+Persona.getContadorPersonas());
    }
    
}
