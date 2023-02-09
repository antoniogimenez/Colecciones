/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio11;

import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        Factura factura1 = new Factura("B1023102");
        factura1.añadirLinea("RF002", "Agua", 2, 2);
        
        System.out.println("******** AÑADIENDO PRODUCTO ********");
        System.out.println("Dime tu referencia del producto: ");
        String refProducto = s.nextLine();
        System.out.println("Dime la descripcion del producto: ");
        String descripcion = s.nextLine();
        System.out.println("Dime la cantidad: ");
        int cantidad = Integer.parseInt(s.nextLine());
        System.out.println("Dime el precio por unidad: ");
        double precioUnidad = Double.parseDouble(s.nextLine());
        factura1.añadirLinea(refProducto, descripcion, cantidad, precioUnidad);
        
        factura1.imprimirFactura();
        
    }
    
}
