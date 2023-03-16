/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author antonio.gimenez
 */
public class Partido {
    private int id;
    private Equipo eLocal;
    private Equipo eVisitante;
    private int golesLocal;
    private int golesVisitante;
    private static int contador=1;
    
    public Partido(Equipo Local, Equipo Visitante){
        this.eLocal = Local;
        this.eVisitante = Visitante;
        this.id = contador;
        contador++;
        this.golesLocal = 0;
        this.golesVisitante = 0;
    }
    
    private void jugarPartido(){
        this.golesLocal = (int) (Math.random()*10);
        this.golesVisitante = (int) (Math.random()*10);
        
        if(this.golesLocal>this.golesVisitante){
            eLocal.añadirVictoria();
        }else if(this.golesLocal<this.golesVisitante){
            eVisitante.añadirVictoria();
        } else if(this.golesLocal==this.golesVisitante){
            eLocal.añadirEmpate();
            eVisitante.añadirEmpate();
        }
    }
    @Override
    public String toString(){
        String datos;
        datos = String.format("%s %d - %d %s",this.eLocal.getNombre(),this.golesLocal,this.golesVisitante,this.eVisitante.getNombre());
        return datos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Equipo geteLocal() {
        return eLocal;
    }

    public void seteLocal(Equipo eLocal) {
        this.eLocal = eLocal;
    }

    public Equipo geteVisitante() {
        return eVisitante;
    }

    public void seteVisitante(Equipo eVisitante) {
        this.eVisitante = eVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Partido.contador = contador;
    }
    
    
}
