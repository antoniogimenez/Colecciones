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
public class Bd_Campeonato {
    private static ArrayList<Jugador> listaJugadores=new ArrayList();
    private static ArrayList<Equipo> listaEquipos = new ArrayList();
    private static ArrayList<Partido> listaPartidos = new ArrayList();
    
    public static void addJugador(Jugador j){
        listaJugadores.add(j);
    }
    
    public static void addEquipo(Equipo e){
        listaEquipos.add(e);
    }
    
    public static void addPartido(Partido p){
        listaPartidos.add(p);
    }
    
    public static void listarJugadores(){
        for (Jugador listaJugador : listaJugadores) {
            System.out.println(listaJugador);
        }
    }
    
    public static void listarEquipos(){
        for (Equipo listaEquipo : listaEquipos) {
            System.out.println(listaEquipo);
        }
    }
    
    public static void listarPartidos(){
        for (Partido listaPartido : listaPartidos) {
            System.out.println(listaPartido);
        }
    }
    
    public static Jugador obtenerJugadores(int dorsal){
        for (Jugador listaJugador : listaJugadores) {
            if(listaJugador.getDorsal()==dorsal){
                return listaJugador;
            }
        }
        return null;
    }
    
    public static Equipo obtenerEquipo(int id){
        for (Equipo listaEquipo : listaEquipos) {
            if(listaEquipo.getId()==id){
                return listaEquipo;
            }
        }
        return null;
    }
    
    public static Partido obtenerPartido(int id){
       for (Partido listaPartido : listaPartidos) {
            if(listaPartido.getId()==id){
                return listaPartido;
            }
        }
        return null;
    }
    
    public static boolean dorsaLibre(int dorsal){
        for (Jugador jugador : listaJugadores) {
            if(jugador.getDorsal()==dorsal){
                
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public static void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        Bd_Campeonato.listaJugadores = listaJugadores;
    }

    public static ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public static void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        Bd_Campeonato.listaEquipos = listaEquipos;
    }

    public static ArrayList<Partido> getListaPartidos() {
        return listaPartidos;
    }

    public static void setListaPartidos(ArrayList<Partido> listaPartidos) {
        Bd_Campeonato.listaPartidos = listaPartidos;
    }
    
}
