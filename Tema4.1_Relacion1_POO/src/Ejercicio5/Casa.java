/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author antonio.gimenez
 */
public class Casa {

    private String propietario;
    private int superficiePlanta1;
    private int superficiePlanta2;
    private double precioVenta;
    public static int contadorCasa=0;
    
    public Casa(String propietario, int superficiePlanta1, int superficiePlanta2, double precioVenta){
        
        this.propietario = propietario;
        this.superficiePlanta1 = superficiePlanta1;
        this.superficiePlanta2 = superficiePlanta2;
        this.precioVenta = precioVenta;
        this.contadorCasa++;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getSuperficiePlanta1() {
        return superficiePlanta1;
    }

    public void setSuperficiePlanta1(int superficiePlanta1) {
        this.superficiePlanta1 = superficiePlanta1;
    }

    public int getSuperficiePlanta2() {
        return superficiePlanta2;
    }

    public void setSuperficiePlanta2(int superficiePlanta2) {
        this.superficiePlanta2 = superficiePlanta2;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    private int superficieTotal(){
        int superficieTotal = superficiePlanta1 + superficiePlanta2;
        return superficieTotal;
    }
    
    public void imprimirDatos(){
        System.out.println("  "+this.propietario+"  "+superficieTotal()+"  "+precioVenta);
    }
}
