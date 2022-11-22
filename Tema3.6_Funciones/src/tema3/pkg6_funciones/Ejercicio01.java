/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.pkg6_funciones;

import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio01 {
    public static boolean esPar(int num) {
        boolean par=false;
        if(num%2==0){
            par = true;
        }
        return par;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        int num;
        System.out.println("Dime un numero: ");
        num = Integer.parseInt(s.nextLine());
        
        if(esPar(num)){
            System.out.println("El numero "+num+" es par");
        } else {
            System.out.println("El numero "+num+" es impar");
        }
    }
    
}
