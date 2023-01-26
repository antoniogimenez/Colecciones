/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo4_arraylist;

import java.util.ArrayList;

/**
 *
 * @author antonio.gimenez
 */
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> nombres = new ArrayList();
        
        //añadimos elementos
        nombres.add("Paco");
        nombres.add("Alicia");
        nombres.add("Simon");
        
        //System.out.println("Nombres: "+nombres);
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        
        //nuevo bucle foreach
        for (String item: nombres){
            System.out.println(item);
        }
        
        ArrayList<Integer> numeros = new ArrayList();
        
        //añadimos elementos
        numeros.add(12);
        numeros.add(15);
        numeros.add(18);
        numeros.add(18);
        
        //System.out.println("Nombres: "+nombres);
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        
        
    }
    
}
