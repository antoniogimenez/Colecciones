/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo0;

/**
 *
 * @author antonio.gimenez
 */
public class Ejemplo0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //me creo una persona
        Persona persona1 = new Persona();
        
        //metemos valores en los atribotis de una clase
        persona1.setNombre("Alicia");
        persona1.setEdad(44);
        persona1.setDni("12345678A");
        
        System.out.println("Objeto persona1: ");
        System.out.println("---------------------");
        System.out.println("Nombre: "+persona1.getNombre());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Dni: "+persona1.getDni());
        
        
    }
    
}
