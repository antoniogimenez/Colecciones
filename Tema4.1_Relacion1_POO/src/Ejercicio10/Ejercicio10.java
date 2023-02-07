/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        //Primer coche en codigo
        Coche cocheVolvo = new Coche("VOLVO", "XC60", 140,
                                        TipoCombustible.DIESEL,
                                        TipoCambio.AUTOMATICO, 19);
        cocheVolvo.imprimirFicha();
        cocheVolvo.recorrer(10000);
        cocheVolvo.cambiarRueda(3);
        cocheVolvo.imprimirFicha();
        //Segundo coche por teclado
        Coche cochePorsche = new Coche("PORSCHE", "911", 250,
                                        TipoCombustible.GASOLINA,
                                        TipoCambio.MANUAL, 22); 
        cochePorsche.imprimirFicha();
        cochePorsche.recorrer(500);
        cochePorsche.imprimirFicha();
        
        //Para destruir un coche
        cochePorsche = null;
        
    }
    
}
