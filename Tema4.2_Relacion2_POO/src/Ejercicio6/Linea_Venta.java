/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author antonio.gimenez
 */
public class Linea_Venta {
    private Producto p;
    private int cantidad;
    
    public Linea_Venta(Producto p,int cantidad){
        this.p =p;
        this.cantidad = cantidad;
    }
    
    public double calcularImporte(){
        double importe = this.cantidad * this.p.getPrecioUnitario();
        return importe;
    }
    
    public void imprimirLinea(){
        System.out.println(this.cantidad+"  "+this.p.getDescripcion()+"  "+this.p.getPrecioUnitario()+"  "+calcularImporte());
    }

    public Producto getP() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
