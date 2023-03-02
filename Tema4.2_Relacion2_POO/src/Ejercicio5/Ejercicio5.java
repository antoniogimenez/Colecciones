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
        Banco banco = new Banco("CajaLorca");
        banco.nuevoCliente("0000A", "Mortadelo", "Sanchez", "mortadelo@gmail.com");
        banco.nuevoCliente("0000B", "Fiolemon", "Sanchez", "filemon@gmail.com");
        
        Cliente c_0000A = banco.buscarCliente("0000A");
        banco.nuevaCuenta(c_0000A,1000);
        banco.nuevaCuenta(c_0000A,5000);

        int opcion;
        do{
            System.out.println("Dime la opcion que quieres ejecutar: ");
            opcion = Integer.parseInt(s.nextLine());
        }while (opcion!=5);
    }
    
}
