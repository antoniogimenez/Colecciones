/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.pkg5_cadenas;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase = "Alicia tiene 35 años";
        System.out.println("La frase inicial es: "+frase);
        String palabra1 ="", palabra3;
        
        int posicion =0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)==' '){
                posicion = i;
                palabra1 = frase.substring(0,posicion);
                break;
            }
        }
        System.out.println("La primera palabra es:"+palabra1);
        
        
        
        //MOSTRAMOS LA PALABRA TRES
        int indiceSegundoBlanco=0, indiceTercerBlanco=0;
        
        int totalBlancosEncontrados=0;
        
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==' ') { 
                
                totalBlancosEncontrados++;
                if (totalBlancosEncontrados==2)
                    indiceSegundoBlanco=i;
                
                if (totalBlancosEncontrados==3)
                    indiceTercerBlanco=i;
                
                
            }
        }
        palabra3=frase.substring(indiceSegundoBlanco+1, indiceTercerBlanco);
        System.out.println("Tercera palabra:["+palabra3+"]");
    }
    
}
