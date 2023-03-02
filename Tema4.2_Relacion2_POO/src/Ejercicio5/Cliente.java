/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author antonio.gimenez
 */
public class Cliente {
    private String DNI;
    private String nombre;
    private String apellido;
    private String email;
    
    public Cliente(String dni,String nombre, String apellido, String email){
        this.DNI = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
    public String aCadena(){
        String datos;
        datos = String.format("%s - %s - %s - %s",DNI,nombre,apellido,email);
        return datos;
    }
    
    public void imprimirDetalles(){
        System.out.println("DETALLES CLIENTE");
        System.out.println("-----------------------");
        System.out.println("NOMBRE: "+this.nombre);
        System.out.println("APELLIDO: "+this.apellido);
        System.out.println("DNI: "+this.DNI);
        System.out.println("EMAIL: "+this.email);
        System.out.println("-----------------------");
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
