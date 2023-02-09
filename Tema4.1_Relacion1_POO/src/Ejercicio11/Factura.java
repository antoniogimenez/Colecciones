/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Factura {
    private String cif;
    private LocalDate fechaFactura;
    private ArrayList<LineaFactura> lineas;
    private int IVA;
    
    public Factura(String cif){
        this.cif = cif;
        this.fechaFactura = fechaFactura.now();
        lineas = new ArrayList();
        this.IVA = 21;
    }
    
    public void añadirLinea(String refProducto, String descripcion, int cantidad, double precioUnitario){
        lineas.add(new LineaFactura(refProducto,descripcion,cantidad,precioUnitario));
    }
    
    public void imprimirFactura(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("=================================================");
        System.out.println("                     FACTURA                     ");
        System.out.println("CIF:   "+cif);
        System.out.println("Fecha: "+fechaFactura.format(dtf));
        System.out.println("");
        System.out.println("CANT    DESCRIPCION   PRECIO U    IMPORTE");
        System.out.println("-------------------------------------------------");
        for (LineaFactura linea : lineas) {
            linea.imprimirLinea();
        }
        System.out.println("");
        System.out.println("                          Subtotal: "+getSubtotal());
        System.out.println("                          IVA 21:   "+getIVAsubtotal());
        System.out.println("                          TOTAL:    "+getTotal());
        System.out.println("=================================================");

    }
    private double getSubtotal(){
        double subtotal=0;
        for (LineaFactura linea : lineas) {
            subtotal=subtotal+linea.getImporteLinea();
        }
        
        return subtotal;
    }
    
    private double getIVAsubtotal(){
        double impuestos = (this.getSubtotal()*this.IVA)/100;
        return impuestos;
    }
    
    private double getTotal(){
        return this.getSubtotal()+this.getIVAsubtotal();
    }
}
