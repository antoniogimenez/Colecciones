/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        BD_Empresa laEmpresa = new BD_Empresa();
        ArrayList<Empresa> lista;
        
        Empresa e = new Empresa("B12345678","Nike Inc","Oregon(USA)");
        laEmpresa.addEmpresa(e);
        Empresa e1 = new Empresa("B00044562","Apple Inc","California(USA)");
        laEmpresa.addEmpresa(e1);
        Empresa e2 = new Empresa("B11111111","Nitro S.L","Murcia(SPA)");
        laEmpresa.addEmpresa(e2);
        int opcion = 0;
        
        
        do{
            System.out.println("***Menu de Empresas***");
            System.out.println("1. Añadir Empresa");
            System.out.println("2. Listar Empresas");
            System.out.println("3. Buscar Empresas por CIF");
            System.out.println("4. Buscar Empresas por Nombre");
            System.out.println("5. Salir");
            
            do{
                System.out.println("Dime que opcion quieres ejecutar: ");
                opcion = Integer.parseInt(s.nextLine());
            }while(opcion<1 || opcion>6);
            
            switch (opcion){
                case 1:
                    String CIF,nombre,localidad;
                    System.out.println("Dime el CIF: ");
                    CIF = s.nextLine();
                    System.out.println("Dime el nombre: ");
                    nombre = s.nextLine();
                    System.out.println("Dime la localidad: ");
                    localidad = s.nextLine();
                    Empresa e3 = new Empresa(CIF,nombre,localidad);
                    laEmpresa.addEmpresa(e);
                    break;
                case 2:
                    for (Empresa empresa : lista) {
                        empresa.imprimirEmpresa();
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
            }
            
        }while(opcion != 5);
        
    }
    
}
