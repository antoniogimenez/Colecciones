/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author antonio.gimenez
 */
public class Campeonato {
    private static int maxPlantilla=2;
    private String nombre;
    private int totalEquipos=4;
    
    public Campeonato(String nombre){
        this.nombre = nombre;
    }
    
    //es boolean
    public boolean altaJugador(String nombre, int dorsal){
        if(Bd_Campeonato.dorsaLibre(dorsal)){
            Jugador j = new Jugador(nombre,dorsal);
            Bd_Campeonato.addJugador(j);
            return true;
        }else{
            System.out.println("  >Error el dorsal ya está ocupado");
            return false;
        }
    }
    
    public void altaEquipo(String nombre){
        if(Bd_Campeonato.getListaEquipos().size() < this.totalEquipos){
            Equipo e = new Equipo(nombre);
            Bd_Campeonato.addEquipo(e);
        }else{
            System.out.println("  >Error al crear Equipo");
        }
    }

    public static int getMaxPlantilla() {
        return maxPlantilla;
    }

    public static void setMaxPlantilla(int maxPlantilla) {
        Campeonato.maxPlantilla = maxPlantilla;
    }
    
    
}
