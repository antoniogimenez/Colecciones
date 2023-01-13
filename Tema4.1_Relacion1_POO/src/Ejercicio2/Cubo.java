/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author antonio.gimenez
 */
public class Cubo {
    private final int capacidadMax;
    private int contenido;
    
    public Cubo(int capacidad){
        this.capacidadMax = capacidad;
        this.contenido = 0;
    }
    
    public void llenar(){
        this.contenido = this.capacidadMax;
        
    }
    
    public void vaciar(){
        this.contenido = 0;
    }
    
    public void rellenar(int litros){
        if((this.contenido+litros)>this.capacidadMax){
            System.out.println("Imposible rellenar. Se desborda");
        } else{
            this.contenido = this.contenido + litros;
        }
    }
    
    public void pintar() {
        for (int i = 0; i < this.capacidadMax; i++) {
            System.out.println("#      #");
        }
        System.out.println("########");
    }
    
}
