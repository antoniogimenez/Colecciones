/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author antonio.gimenez
 */
public class Bd_Productos {
    private ArrayList<Producto> bd;
    private static int ultProducto;
    
    public Bd_Productos(){
        this.bd = new ArrayList();
        ultProducto=1;
    }
    
    public void add(String descripcion, double precio){
        String nuevaRef = String.format("REF%d",ultProducto);
        ultProducto++;
        
        Producto p = new Producto(nuevaRef,descripcion,precio);
        bd.add(p);
    }
    
    public Producto buscar(String ref){
        Producto p = null;
        for (Producto producto : bd) {
            if(producto.getRef().equalsIgnoreCase(ref)){
                p = producto;
            }
        }
        return p;
    }
    
    public void listarProductos(){
        System.out.println("***PRODUCTOS***");
        for (Producto producto : bd) {
            System.out.println(producto.aCadena());
        }
    }
    
    
    
}
