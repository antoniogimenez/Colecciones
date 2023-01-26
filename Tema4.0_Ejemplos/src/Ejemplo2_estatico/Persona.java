/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo2_estatico;

/**
 *
 * @author antonio.gimenez
 */
public class Persona {
    private String nombre;
    private int edad;
    private static int contadorPersonas = 0;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        Persona.contadorPersonas++; //es un atributo de clase y no del objeto
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }
    
    
}
