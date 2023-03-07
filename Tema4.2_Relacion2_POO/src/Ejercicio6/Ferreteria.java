/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import java.util.ArrayList;

/**
 *
 * @author antonio.gimenez
 */
public class Ferreteria {
    private String nombre;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Venta> listaVentas;

    public Ferreteria(String nombre){
        this.nombre = nombre;
        this.listaProductos = new ArrayList();
        this.listaVentas = new ArrayList();
    }
    
    public void nuevoProducto(String descripcion, double precio, int unidades){
        Producto p = new Producto(descripcion,precio,unidades);
        listaProductos.add(p);
    }
    
    public Venta nuevaVenta(){
        Venta v = new Venta();
        return v;
    }
    
    public boolean añadirStock(String ref, int unidades){
        for (Producto listaProducto : listaProductos) {
            if(listaProducto.getRef().equalsIgnoreCase(ref)){
                listaProducto.setUnidades(listaProducto.getUnidades() + unidades);
                return true;
            } 
        }
        return false;
    }
    
    public Producto buscar(String ref){
        for (Producto listaProducto : listaProductos) {
            if(listaProducto.getRef().equalsIgnoreCase(ref)){
                return listaProducto;
            } 
        }
        return null;
    }
    
    public void listarProductos(){
        System.out.println("== "+this.nombre+" - ALMACEN PRODUCTOS ==");
        System.out.println("REF   DESCRIPCION      PRECIO     UNIDADES");
        System.out.println("-------------------------------------------");
        for (Producto listaProducto : listaProductos) {
            System.out.println(listaProducto);
        }
        System.out.println("============================================");
    }
}
