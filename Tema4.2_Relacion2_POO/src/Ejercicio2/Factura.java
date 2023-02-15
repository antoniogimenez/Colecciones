/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author antonio.gimenez
 */
public class Factura {
    private String cif;
    private String numero;
    private LocalDate fechaFactura;
    private ArrayList<Linea_Factura> lista;
    private static final int IVA=21;
    
    public Factura(String cif, String numero, LocalDate fechaFactura){
        this.cif = cif;
        this.numero = numero;
        this.fechaFactura = fechaFactura;
        this.lista = new ArrayList();
    }
    
    public void añadirLinea(Producto p, int cantidad){
        Linea_Factura linea = new Linea_Factura(p,cantidad);
        lista.add(linea);
    }
     public void imprimirFactura(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("=================================================");
        System.out.println("                     FACTURA                     ");
        System.out.println("CIF:   "+cif);
        System.out.println("Fecha: "+fechaFactura.format(dtf));
        System.out.println("Factura Num: "+numero);
        System.out.println("");
        System.out.println("CANT    DESCRIPCION   PRECIO U    IMPORTE");
        System.out.println("-------------------------------------------------");
        for (Linea_Factura linea : lista) {
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
        for (Linea_Factura linea : lista) {
            subtotal=subtotal+linea.getImporteLinea();
        }
        
        return subtotal;
    }
    
    private double getIVAsubtotal(){
        double impuestos = (this.getSubtotal()*IVA)/100;
        return impuestos;
    }
    
    private double getTotal(){
        double total = this.getIVAsubtotal()+this.getSubtotal();
        return total;
    }
}
