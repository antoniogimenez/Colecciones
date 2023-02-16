/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author antonio.gimenez
 */
public class Autor {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private  String email;
    
    public Autor(String nombre, String apellido1, String apellido2, String email){
        this.id = (int) (Math.random() * 1000);
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
    }
    public String getNombreCita(){
        String cita = "";
        
        cita = cita + apellido1;
        cita = cita + ", ";
        cita = cita + nombre.charAt(0);
        cita = cita + ".";
        if (apellido2 != null){
            cita = cita + apellido2.charAt(0);
            cita = cita +".";
        }
        return cita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
