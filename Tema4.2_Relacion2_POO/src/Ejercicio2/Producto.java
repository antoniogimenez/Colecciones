/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author antonio.gimenez
 */
public class Producto {
    private String ref;
    private String descripcion;
    private double precioUnitario;
    
    public Producto(String ref, String descripcion, double precioUnitario){
        this.ref = ref;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }
    
    public String aCadena(){
        String datos;
        datos = String.format("%s   %s    %f",ref,descripcion,precioUnitario);
        return datos;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
}
