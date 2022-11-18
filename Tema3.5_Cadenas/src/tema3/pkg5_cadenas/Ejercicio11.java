/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3.pkg5_cadenas;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char carcaterMayus, caracter;
        String cadena = "me gusta el jamon";
        String resultado=" ";
        System.out.println("La frase inicial es;"+cadena);
        
        //PONGO EN MAYUS EL PRIMERO
        caracter = cadena.charAt(0);
        carcaterMayus = Character.toUpperCase(caracter);
        resultado = resultado + carcaterMayus;
        
        for (int i = 1; i < cadena.length(); i++) {
            if(cadena.charAt(i-1)==' '){
                caracter = cadena.charAt(i);
                carcaterMayus = Character.toUpperCase(caracter);
                resultado = resultado + carcaterMayus;
            }else {
                caracter = cadena.charAt(i);
                carcaterMayus = caracter;
                resultado = resultado + carcaterMayus;
            }
        }
        System.out.println(resultado);
        
//        //Saco las iniciales de la frase en minusculas
//        char iniciales;
//        //Meto el primer caracter
//        iniciales =iniciales +cadena.charAt(0);
//        
//        for (int i = 1; i < cadena.length(); i++) {
//            if (cadena.charAt(i-1)==' '){
//                //El caracter anterior es un espacio
//                //añado el caracter actual
//                iniciales=iniciales+cadena.charAt(i);
//            }
//            
//        }
//        
//        System.out.println(iniciales);
    }
    
}
