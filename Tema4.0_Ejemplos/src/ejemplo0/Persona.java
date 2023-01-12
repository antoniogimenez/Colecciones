/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo0;

/**
 *
 * @author antonio.gimenez
 */
public class Persona {
    private String nombre;  //ATRIBUTOS DE LA CLASE
    private int edad;       //ATRIBUTOS DE LA CLASE
    private String dni;     //ATRIBUTOS DE LA CLASE
    
    //CONSTRUCTOR POR DEFECTO O VACIO
    public Persona(){
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;       //  UTILIZO EL THIS PARA REFERIRME AL ATRIBUTO DE LA CLASE
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
}
