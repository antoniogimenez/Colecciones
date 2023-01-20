/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author antonio.gimenez
 */
public class Persona {
    private String nombre;
    private String email;
    public static int contadorPersonas = 0;
    
    public Persona(String nombre, String email){
        this.email = email;
        this.nombre = nombre;
        Persona.contadorPersonas++;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String mostrar_datos(){
        String dato;
        
        dato = String.format("%s - %s",this.nombre, this.email);
        return dato;
    }
}
