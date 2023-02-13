/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Utilidades {
    private static ArrayList<String> listaCodigos = new ArrayList();
    public static String generarCodigoLibro(){
            
    String codigo;
        
        char letra1, letra2;
        int numero1, numero2, numero3;
        
        do{
            letra1 = (char)(int)(Math.random() * 65 + 90);
            letra2 = (char)(int)(Math.random() * 65 + 90);
            numero1 = (int)(Math.random() * 10);
            numero2 = (int)(Math.random() * 10);
            numero3 = (int)(Math.random() * 10);
            
            StringBuilder sb=new StringBuilder();
            sb.append(letra1);
            sb.append(letra2);
            sb.append(numero1);
            sb.append(numero2);
            sb.append(numero3);
            codigo=sb.toString();

        }while(comprobarCodigo(codigo)==true);
        
        listaCodigos.add(codigo); 
        return codigo;
    }
    
    private static boolean comprobarCodigo(String codigo){
        for (String listaCodigo : listaCodigos) {
            if(listaCodigo.equals(codigo)){
                return true;
            }
        }
        return false;
    }
    
}
