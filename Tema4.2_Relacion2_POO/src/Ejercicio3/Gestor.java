/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author antonio.gimenez
 */
public class Gestor {
    private ArrayList<Incidencia> listaIncidencias;
    private ArrayList<Puesto> listaPuestos;
    
    public Gestor(){
        this.listaIncidencias = new ArrayList();
        this.listaPuestos = new ArrayList();
    }
    
    public void addPuesto(Puesto p){
        listaPuestos.add(p);
    }
    
    public void addIncidencia(Puesto p,String problema, LocalDate fecha, TipoEstado estado){
        Incidencia i = new Incidencia(problema,p,fecha,estado);
        listaIncidencias.add(i);
    }
    
    public void listarIncidencias(){
        for (Incidencia listaIncidencia : listaIncidencias) {
            listaIncidencia.toString();
        }
    }
    
    public void listarPuestos(){
        for (Puesto listaPuesto : listaPuestos) {
            listaPuesto.toString();
        }
    }
    
    //buscarIncidencia por codigo y devuelve una incidencia
    
    //metodo para resolver una incidencia
}
