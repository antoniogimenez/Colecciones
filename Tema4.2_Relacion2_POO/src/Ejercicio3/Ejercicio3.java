/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Gestor g = new Gestor("GESINTIC");
        g.addPuesto("PC sobremesa 11",11);
        g.addPuesto("PC portatil 12",12);
        g.addPuesto("Pizarra digital sala reuniones",40);
        g.addPuesto("PC sala de reuniones",41);
        g.addIncidencia(g.buscarPuesto(11),"Sin acceso a Internet", LocalDate.parse("10/03/2022",dtf));
        int opcion;
        String problema;
        
        do{
            int codigoP, codigo;
            String fecha;
            String descripcion;
            System.out.println("============================================");
            System.out.printf("               %s                     \n",g.getNombre());
            System.out.println("============================================");
            g.listarIncidencias();
            g.listarPuestos();
            System.out.println("----------------------------------");
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
                    codigoP = Integer.parseInt(s.nextLine());
                    System.out.print("Dime el problema: ");                                        
                    problema = s.nextLine();
                    System.out.println("Dime la fecha de la Incidencia: ");
                    fecha = s.nextLine();
                    g.addIncidencia(g.buscarPuesto(codigoP),problema,LocalDate.parse(fecha,dtf));
                    break;
                   
                case 2:
                    System.out.println("Dime el codigo de la Incidencia: ");
                    codigo = Integer.parseInt(s.nextLine());
                    Incidencia i2 = g.buscarIncidencia(codigo);
                    System.out.println("Dime como se ha resuelto: ");
                    descripcion = s.nextLine();
                    System.out.println("Dime la fecha de resolucion: ");
                    fecha = s.nextLine();
                    g.resolverIncidencia(i2, descripcion, LocalDate.parse(fecha,dtf));
                    break;
                    
                case 3:
                    System.out.println("Dime el codigo de la Incidencia: ");
                    codigo = Integer.parseInt(s.nextLine());
                    Incidencia i = g.buscarIncidencia(codigo);
                    if (i!=null) i.detalleIncidencia();
                    else System.out.println("ERROR: no existe la incidencia");
                    break;
                case 4:
                    System.out.println("Dime el puesto: ");
                    codigoP = Integer.parseInt(s.nextLine());
                    System.out.println("Dime la descripcion: ");
                    descripcion = s.nextLine();
                    g.addPuesto(descripcion,codigoP);
                    break;
                case 5:
                    System.out.println("Saliendo...");
            }

        }while(opcion!=5);
    }
    
}
