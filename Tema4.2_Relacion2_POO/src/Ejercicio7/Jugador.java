/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author antonio.gimenez
 */
public class Jugador {
    private String nombre;
    private int dorsal;
    private boolean fichado;
    
    public Jugador(String nombre, int dorsal){
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.fichado = false;
    }
    
    @Override
    public String toString(){
        String datos;
        if(fichado){
            datos = String.format("%d  %s\\033[031m  FICHADO\033[031m\n",this.nombre,this.dorsal);
        }else{
            datos = String.format("%d  %s\\033[032m  LIBRE\033[032m\n",this.nombre,this.dorsal);
        }
        return datos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public boolean isFichado() {
        return fichado;
    }

    public void setFichado(boolean fichado) {
        this.fichado = fichado;
    }
    
}
