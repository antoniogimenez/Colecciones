/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int opcion;
        String ref;
        int cantidad =0;
        Ferreteria miferre = new Ferreteria("Ferreteria Antonio S.L");
        miferre.nuevoProducto("Pilas alcalina",2,20);
        miferre.nuevoProducto("Destornillador",5,20);
        miferre.nuevoProducto("Sartén",35,20);
        miferre.nuevoProducto("Bombilla",5,5);
        
        do{
            System.out.printf("== %s - TPV ==\n",miferre.getNombre());
            System.out.println("1. Nueva venta");
            System.out.println("2. Listado de ventas");
            System.out.println("3. Gestion de almacen");
            System.out.println("4. Salir");
            System.out.println("-----------------------------");
            System.out.println("Dime tu opcion >");
            opcion = Integer.parseInt(s.nextLine());
            
            switch (opcion){
                case 1:
                    miferre.listarProductos();
                    Venta v = miferre.nuevaVenta();
                    
                    do{
                        System.out.println("Dime la referencia >");
                        ref = s.nextLine();
                        if(ref.equals("")){
                            break;
                        }else{
                            Producto p4 = miferre.buscar(ref);
                            if(p4!=null){
                                System.out.println("Dime la cantidad >");
                                cantidad = Integer.parseInt(s.nextLine());
                                if(p4.getUnidades()<cantidad){
                                    System.out.println("Stock Insuficiente...");
                                    System.out.println("Introduce un stock valido:");
                                    cantidad = Integer.parseInt(s.nextLine());
                                }
                            }
                            
                            v.addLinea(p4, cantidad);
                        }
                    }while(!ref.equals(""));
                    v.imprimirVenta();
                    break;
                case 2:
                    miferre.listarVentas();
                    break;
                case 3:
                    submenu(miferre);
                    break;
                case 4:
                    System.out.println("Saliendo....");
                    break;
                    
                    
            }
        }while(opcion!=4);



    }
    
    private static void submenu(Ferreteria f){
        Scanner s=new Scanner(System.in);
        int opcion;
        String ref, descripcion;
        int cantidad;
        double precio;
        do{
            
            System.out.printf("== %s - TPV ==\n",f.getNombre());
            f.listarProductos();
            System.out.println("1. Nuevo Producto");
            System.out.println("2. Añadir Stock");
            System.out.println("3. Volver");
            System.out.println("-----------------------------");
            do{
                System.out.println("Dime tu opcion >");
                opcion = Integer.parseInt(s.nextLine());
            }while(opcion<1 || opcion>3);
            
            switch (opcion){
                case 1:
                    System.out.println("Dime la descripcion >");
                    descripcion = s.nextLine();
                    System.out.println("Dime el precio >");
                    precio = Double.parseDouble(s.nextLine());
                    System.out.println("Dime la cantidad >");
                    cantidad = Integer.parseInt(s.nextLine());
                    f.nuevoProducto(descripcion, precio, cantidad);
                    break;
                case 2:
                    System.out.println("Dime la ref >");
                    ref = s.nextLine();
                    System.out.println("Dime la cantidad >");
                    cantidad = Integer.parseInt(s.nextLine());
                    if(f.añadirStock(ref, cantidad)){
                        f.listarProductos();
                    } else {
                        System.out.println("Referencia no encontrada..");
                    }
                    break;
                case 3:
                    System.out.println("Volviendo...");
                    break;
                    
            }
        }while(opcion!=3);
    }
    
}
