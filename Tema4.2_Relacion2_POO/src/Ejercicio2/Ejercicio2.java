/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Bd_Productos mibd=new Bd_Productos();
        mibd.add("Leche Puleva",1.2);
        mibd.add("Chocolate",2);
        mibd.add("Pan",0.75);
        mibd.add("Agua 1.5L",1.5);
        
        Factura factura1 = new Factura("B12345678","2022-01",LocalDate.now());
        
        int opcion;
        do{
            System.out.println("Menu Factura");
            System.out.println("*********************");
            System.out.println("1. Añadir Linea");
            System.out.println("2. Imprimir factura");
            System.out.println("3. Listar productos");
            System.out.println("4. Añadir producto");
            System.out.println("5. Salir");
            do{
                System.out.println("Elige una opcion: ");
                opcion = Integer.parseInt(s.nextLine());
            }while(opcion <= 1 || opcion >= 6);
            
            switch (opcion){
                
            }
            
            
            
        }while(opcion!=5);

    }
    
}
