/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Puesto p = new Puesto("impresora HP sala 1");
        Gestor g = new Gestor();
        int opcion;
        String problema;
        int codigo;
        
        do{
            System.out.println("============================================");
            System.out.println("               GESINTIC                     ");
            System.out.println("============================================");
            g.listarIncidencias();
            System.out.println("1. Nueva Incidencia");
            System.out.println("2. Resolver Incidencia");
            System.out.println("3. Detalles Incidencia");
            System.out.println("4. Nuevo puesto");
            System.out.println("5. Salir");
            
            System.out.println("Dime la opcion a ejecutar: ");
            opcion = Integer.parseInt(s.nextLine());
            
            switch (opcion) {
                case 1:
                    System.out.print("Dime el codigo del puesto: ");
                    codigo = Integer.parseInt(s.nextLine());
                    System.out.print("Dime el problema: ");                                        
                    problema = s.nextLine();
                    //g.addIncidencia();
                    break;
                case 2:
                    System.out.println("Dime el codigo de la Incidencia: ");
                    codigo = Integer.parseInt(s.nextLine());
                    //.detalleIncidencia
                default:
                    throw new AssertionError();
            }

        }while(opcion!=5);
    }
    
}
