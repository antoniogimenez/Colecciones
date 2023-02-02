/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Agenda agendaJuan = new Agenda();

        String nombre, email, tlfo;
        int id;
        ArrayList<Contacto> lista;

        agendaJuan.addContacto("Juan", "juan@gmail.com", "612345678");
        agendaJuan.addContacto("Alicia", "alicia@gmail.com", "123456789");
        agendaJuan.addContacto("Junajo", "juanjo@gmail.com", "123456789");
        agendaJuan.addContacto("Jaime", "jaime@gmail.com", "123456789");
        

        int opcion;

        do {
            System.out.println("");System.out.println("");    
            System.out.printf("\033[34m%14s\n", "AGENDA DE CONTACTOS");
            System.out.println("\033[34m¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("\033[34m1.  Añadir");
            System.out.println("\033[34m2.  Lista completa");
            System.out.println("\033[34m3.  Modificar");
            System.out.println("\033[34m4.  Buscar");
            System.out.println("\033[34m5.  Salir\033[30m");

            System.out.print("Elige una opción:");
            opcion = Integer.parseInt(s.nextLine());
            System.out.println("");

            switch (opcion) {
                case 1:
                    System.out.println("\nAñadiendo un contacto...");

                    //Pido los datos del contacto
                    System.out.print("Nombre:");
                    nombre = s.nextLine();
                    System.out.print("email:");
                    email = s.nextLine();
                    System.out.print("telefono:");
                    tlfo = s.nextLine();
                    //Los añado usando el método de la agenda
                    agendaJuan.addContacto(nombre, email, tlfo);
                    break;

                case 2:
                    agendaJuan.listarAgenda();
                    break;

                case 3:
                    System.out.println("1. Modificar por ID");
                    System.out.println("2. Modificar por NOMBRE");
                    System.out.print("Elige una opción:");
                    do {
                        opcion = Integer.parseInt(s.nextLine());
                    } while (opcion != 1 && opcion != 2);

                    if (opcion == 1) {
                        System.out.print("\nIntroduce el [id] del contacto a modificar:");
                        id = Integer.parseInt(s.nextLine());
                        agendaJuan.modificarContacto(id);

                    }else{
                        System.out.print("\nIntroduce el [nombre] del contacto a modificar:");
                        nombre = s.nextLine();
                        agendaJuan.modificarContacto(nombre);
                        
                    }
                    break;

                case 4:
                    System.out.print("\nIntroduce comiendo del nombre: ");
                    String comienzo = s.nextLine();
                    lista=agendaJuan.buscarContacto(comienzo);
                    System.out.println("======== LISTA DE CONTACTOS POR LETRA =========");
                    System.out.println("ID       NOMBRE         EMAIL         TELEFONO");
                    for (Contacto contacto : lista) {
                        System.out.println(contacto.aCadena());
                    }
                    break;

                case 5:
                    break;
                default:
                    System.out.println("Opción no valida");
            }

        } while (opcion != 5);
    }
    }
    

