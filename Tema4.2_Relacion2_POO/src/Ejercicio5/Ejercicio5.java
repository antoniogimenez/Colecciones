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
        
        String dni, nombre, apellido, email;
        int opcion;
        do{
            System.out.println("");
            System.out.println("MENU PRINCIPAL");
            System.out.println("****************");
            System.out.println("1. Nuevo cliente");
            System.out.println("2. Seleccionar cliente");
            System.out.println("3. Listar Todas Cuentas");
            System.out.println("4. Listar Todos los Clientes");
            System.out.println("5. Salir");
            
            System.out.println("Elige opcion > ");
            opcion = Integer.parseInt(s.nextLine());
            
            switch(opcion){
                case 1:
                    System.out.println("Dime el DNI del nuevo cliente>");
                    dni = s.nextLine();
                    System.out.println("Dime el nombre");
                    nombre = s.nextLine();
                    System.out.println("Dime el apellido");
                    apellido = s.nextLine();
                    System.out.println("Dime el email>");
                    email = s.nextLine();
                    banco.nuevoCliente(dni, nombre, apellido, email);
                    break;
                case 2:
                    submenu(banco);
                    break;
                case 3:
                    banco.listarCuentas();
                    break;
                case 4:
                    banco.listarClientes();
                    break;
                case 5:
                    System.out.println("Saliendo....");
                    break;
            }
        }while (opcion!=5);
    }
    
    private static void submenu(Banco b){
        Scanner s = new Scanner (System.in);
        int opcion;
        
        do{
            int numero, numero2;
            double saldo;
            String dni;
            System.out.println("");
            System.out.println("MENU CLIENTE");
            System.out.println("****************");
            System.out.println("Cuenta        Saldo");
            b.listarCuentas();
            System.out.println("1. Nueva cuenta");
            System.out.println("2. Ingresar");
            System.out.println("3. Reintegro");
            System.out.println("4. Transferencia");
            System.out.println("5. Volver");
            
            System.out.println("Elige opcion > ");
            opcion = Integer.parseInt(s.nextLine());
            
            switch(opcion){
                case 1:
                    System.out.println("Dime el DNI del nuevo cliente>");
                    dni = s.nextLine();
                    Cliente c = b.buscarCliente(dni);
                    System.out.println("Dime el saldo inicial>");
                    saldo = Double.parseDouble(s.nextLine());
                    b.nuevaCuenta(c,saldo);
                    break;
                case 2:
                    System.out.println("Dime el numero de cuenta >");
                    numero = Integer.parseInt(s.nextLine());
                    Cuenta_Corriente cc = b.buscarCuenta(numero);
                    System.out.println("Dime el saldo a ingresar >");
                    saldo = Double.parseDouble(s.nextLine());
                    cc.ingreso(saldo);
                    break;
                case 3:
                    System.out.println("Dime el numero de cuenta >");
                    numero = Integer.parseInt(s.nextLine());
                    Cuenta_Corriente cc1 = b.buscarCuenta(numero);
                    System.out.println("Dime el saldo a retirar >");
                    saldo = Double.parseDouble(s.nextLine());
                    cc1.reintegro(saldo);
                    break;
                case 4:
                    System.out.println("Dime el numero de tu cuenta >");
                    numero = Integer.parseInt(s.nextLine());
                    Cuenta_Corriente ccc = b.buscarCuenta(numero);
                    System.out.println("Dime el numero de cuenta destinatario >");
                    numero2 = Integer.parseInt(s.nextLine());
                    Cuenta_Corriente cDestino = b.buscarCuenta(numero);
                    System.out.println("Dime el saldo a ingresar >");
                    saldo = Double.parseDouble(s.nextLine());
                    ccc.transferencia(cDestino,saldo);
                    break;
                case 5:
                    System.out.println("Volviendo....");
                    break;
            }
        }while (opcion!=5);
    }
    
}
