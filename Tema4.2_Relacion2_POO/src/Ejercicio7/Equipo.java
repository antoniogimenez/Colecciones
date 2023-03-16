/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

import java.util.ArrayList;

/**
 *
 * @author antonio.gimenez
 */
public class Equipo {
    private int id;
    private String nombre;
    private ArrayList<Jugador> plantilla;
    private int puntos;
    private static int contador=1;
    
    public Equipo(String nombre){
        this.nombre = nombre;
        this.id = contador;
        this.contador++;
        this.plantilla = new ArrayList();
        this.puntos = 0;
    }
    
    public void fichar(Jugador j){
        if(plantilla.size()<Campeonato.getMaxPlantilla()){
            j.setFichado(true);
            this.plantilla.add(j);
            System.out.println("jugador añadido correctamente...");
        }else{
            System.out.println("ERROR -> equipo esta completo");
        }
        //en el main tengo que comprobar si es fichado o no
    }
    
    public void añadirVictoria(){
        puntos = puntos + 3;
    }
    
    public void añadirEmpate(){
        puntos = puntos + 1;
    }
    @Override
    public String toString(){
        String datos;
        datos = String.format("%d  %s [%d jugadores]\n",this.id,this.nombre,this.plantilla.size());
        
        return datos;
    }
    
    public void imprimirPlantilla(){
        for (Jugador jugador : plantilla) {
            System.out.println(jugador);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> plantilla) {
        this.plantilla = plantilla;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Equipo.contador = contador;
    }
    
}
