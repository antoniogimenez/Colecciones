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
public class Venta {
    private int numero;
    private int contador=1;
    private ArrayList<Linea_Venta> lineas;
    private final int IVA=21;
    private double importeTotal;
    
    public Venta(){
        this.numero = contador;
        this.lineas = new ArrayList();
        this.contador++;
    }
    
    public void addLinea(Producto p, int cantidad){
        Linea_Venta linea = new Linea_Venta(p,cantidad);
        lineas.add(linea);
    }
    
    public void imprimirVenta(){
        System.out.println("===========================================");
        System.out.println("    VENTA NUMERO: "+this.numero);
        System.out.println("CANT   DESCRIPCION   PRECIO U   IMPORTE");
        System.out.println("--------------------------------------------");
        for (Linea_Venta linea : lineas) {
            System.out.println(linea);
        }
        System.out.println("                        Subtotal: "+calcularSubtotal());
        System.out.println("                        IVA 21:   "+calcularIva());
        System.out.println("                        TOTAL:    "+calcularImpTotal());
        System.out.println("============================================");
    }
    
    @Override
    public String toString(){
        return String.format("%d - %f [%d lineas de venta]",numero,calcularImpTotal(),lineas.size());
    }
    
    private double calcularSubtotal(){
        double subtotal= 0;
        for (Linea_Venta linea : lineas) {
            subtotal = subtotal + linea.calcularImporte();
        }
        return subtotal;
    }
    
    private double calcularIva(){
        double conIva;
        conIva = calcularSubtotal()*IVA/100;
        return conIva;
    }
    
    private double calcularImpTotal(){
        importeTotal = calcularSubtotal()+calcularImpTotal();
        return importeTotal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public ArrayList<Linea_Venta> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<Linea_Venta> lineas) {
        this.lineas = lineas;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }
    
}
