/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author antonio.gimenez
 */
public class Bicicleta {
    private int piñonActual;
    private int revoluciones;


    public Bicicleta(){
        this.piñonActual = 3;
        this.revoluciones=0;
    }

    public int getPiñonActual() {
        return piñonActual;
    }

    public void setPiñonActual(int piñonActual) {
        this.piñonActual = piñonActual;
    }

    public int getRevoluciones() {
        return revoluciones;
    }

    public void setRevoluciones(int revoluciones) {
        this.revoluciones = revoluciones;
    }
    
    public void imprimirDatos(){
        System.out.println("Piñon: "+this.piñonActual);
        System.out.println("Revoluciones: "+this.revoluciones);
    }
    
    public void pedalear(){
        if(this.revoluciones==0){
            this.revoluciones=1;
        } else{
            this.revoluciones = this.revoluciones * 2;
        }
    }
    
    public void frenar(){
        if(this.revoluciones==1){
            this.revoluciones = 0;
        } else{
            this.revoluciones = this.revoluciones / 2;
        }
    }
    
    public void cambiarPiñon(int piñon){
        if(piñon >=0 && piñon <=6){
            this.piñonActual = piñon;
        } else {
            System.out.println("Error en el piñon");
        }
    }
    
    
}