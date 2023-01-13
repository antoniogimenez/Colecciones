/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author antonio.gimenez
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bicicleta miBicicleta = new Bicicleta("Antonio");
        Bicicleta tuBicicleta = new Bicicleta("Messi");
        
        miBicicleta.pedalear();
        miBicicleta.pedalear();
        miBicicleta.cambiarPiñon(2);
        
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        tuBicicleta.cambiarPiñon(6);
        
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        tuBicicleta.cambiarPiñon(5);
        miBicicleta.mostrarVelocidad();
        tuBicicleta.mostrarVelocidad();
        
        System.out.println(miBicicleta.getPropietario()+" --> "+miBicicleta.obtenerVelocidad()+"km/h");
        System.out.println(tuBicicleta.getPropietario()+" --> "+tuBicicleta.obtenerVelocidad()+"km/h");
    }
    
}
