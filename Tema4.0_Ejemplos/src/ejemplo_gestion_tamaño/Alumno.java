/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_gestion_tamaño;

/**
 *
 * @author antonio.gimenez
 */
public class Alumno {
    private String nombre;
    private int id;
    private int edad;
    
    public Alumno(String nombre, int edad){
        this.id = (int)(Math.random()*1000);
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void imprimirDetalles(){
        System.out.println("ID: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
    public String toCadena(){
        String datos;
        
        datos = String.format("ID:%d  %s  %d", id, nombre, edad);
        return datos;
    }
    
    
}
