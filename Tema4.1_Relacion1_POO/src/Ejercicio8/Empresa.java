/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author antonio.gimenez
 */
public class Empresa {
    private String CIF;
    private String nombre;
    private String localidad;
    
    public Empresa(String CIF, String nombre,String localidad){
        this.CIF = CIF;
        this.nombre = nombre;
        this.localidad = localidad;
    }
    
    public void imprimirEmpresa(){
        System.out.println("     DATOS DE LA EMPRESA    ");
        System.out.println("============================");
        System.out.println(CIF+"  "+nombre+"  "+localidad);
        System.out.println("============================");

    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
}
