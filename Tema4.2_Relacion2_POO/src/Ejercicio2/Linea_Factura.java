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
        this.importeLinea = p.getPrecioUnitario()*this.cantidad;
    }
    
    public void imprimirLinea(){
        System.out.println(producto.getRef()+"   "+producto.getDescripcion()+"    "
                +this.cantidad+"       "+producto.getPrecioUnitario()+"     "+this.importeLinea);
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporteLinea() {
        return importeLinea;
    }

    public void setImporteLinea(double importeLinea) {
        this.importeLinea = importeLinea;
    }
    
}
