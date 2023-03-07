/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author antonio.gimenez
 */
public class Producto {
    private String ref;
    private String descripcion;
    private double  precioUnitario;
    private int unidades;
    private static int contador=101;
    
    public Producto(String descripcion, double precio, int unidades){
        this.ref = "REF"+contador;
        this.descripcion = descripcion;
        this.precioUnitario = precio;
        this.unidades = unidades;        
        this.contador++;
    }
    
    @Override
    public String toString(){
        if(unidades <= 10){
            return String.format("\033[31m[%d] - %s - %f - %d",ref,descripcion,precioUnitario,unidades);
        }else{
            return String.format("[%d] - %s - %f - %d",ref,descripcion,precioUnitario,unidades);
        }
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

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Producto.contador = contador;
    }
    
}
