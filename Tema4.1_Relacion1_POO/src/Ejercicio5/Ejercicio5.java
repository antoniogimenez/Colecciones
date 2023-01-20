/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Casa []listaCasa = new Casa [50];
        int opcion =0;
        
        listaCasa[Casa.contadorCasa] = new Casa("Antonio",90,90,120000);
        listaCasa[Casa.contadorCasa] = new Casa("Pedro",90,50,150000);
        listaCasa[Casa.contadorCasa] = new Casa("Juan",90,0,100000);
        
        do{
            

            System.out.println("===========================");
            System.out.println("         MENU CASAS        ");
            System.out.println("===========================");
            System.out.println("1.Añadir casa");
            System.out.println("2. Listar casas");
            System.out.println("3. Cambiar Propietario");
            System.out.println("4. Salir");

            do {
                System.out.println("Elige una opcion: ");
                opcion = Integer.parseInt(s.nextLine());
            } while(opcion>4 || opcion<1);

            switch (opcion){
                case 1: 
                    System.out.println("=== ALTA DE NUEVA CASA ===");
                    System.out.println("Nuevo Propietario: ");
                    String propietario = s.nextLine();
                    System.out.println("Superficie Planta 1: ");
                    int superficiePlanta1 = Integer.parseInt(s.nextLine());
                    System.out.println("Superficie Planta 2: ");
                    int superficiePlanta2 = Integer.parseInt(s.nextLine());
                    System.out.println("Precio de Venta: ");
                    int precioVenta = Integer.parseInt(s.nextLine());
                    listaCasa[Casa.contadorCasa] = new Casa(propietario,superficiePlanta1,superficiePlanta2,precioVenta);
                    break;
                case 2:
                    System.out.println("==== LISTADO DE CASAS ====");
                    for (int i = 0; i < Casa.contadorCasa; i++) {
                        System.out.print("CASA "+(i+1)+"-->");
                        listaCasa[i].imprimirDatos();
                    }
                    break;
                case 3:
                    for (int i = 0; i < Casa.contadorCasa; i++) {
                        System.out.print("CASA "+(i+1)+"-->");
                        listaCasa[i].imprimirDatos();
                    }
                    System.out.println("Dime que propietario quieres cambiar: ");
                    int posicion = Integer.parseInt(s.nextLine());
                    System.out.println("Dime el nombre: ");
                    propietario = s.nextLine();
                    listaCasa[posicion-1].setPropietario(propietario);
            }
        
        }while (opcion!=4);


        
    }
    
}
