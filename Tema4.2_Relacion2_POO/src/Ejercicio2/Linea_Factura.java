/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author antonio.gimenez
 */
public class Linea_Factura {
    private Producto producto;
    private int cantidad;
    private double importeLinea;
    
    public Linea_Factura(Producto p, int cantidad){
        this.producto = p;
        this.cantidad = cantidad;
    }
    
    public void imprimirLinea(){
        System.out.println("");
    }
}
