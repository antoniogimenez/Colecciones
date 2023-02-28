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
    private String nombre;
    private ArrayList<Incidencia> listaIncidencias;
    private ArrayList<Puesto> listaPuestos;
    
    public Gestor(String nombre){
        this.nombre = nombre;
        this.listaIncidencias = new ArrayList();
        this.listaPuestos = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Incidencia> getListaIncidencias() {
        return listaIncidencias;
    }

    public void setListaIncidencias(ArrayList<Incidencia> listaIncidencias) {
        this.listaIncidencias = listaIncidencias;
    }

    public ArrayList<Puesto> getListaPuestos() {
        return listaPuestos;
    }

    public void setListaPuestos(ArrayList<Puesto> listaPuestos) {
        this.listaPuestos = listaPuestos;
    }
    
    public void addPuesto(String descripcion, int codigo){
        Puesto p = new Puesto(descripcion,codigo);
        listaPuestos.add(p);
    }
    
    public void addIncidencia(Puesto p,String problema, LocalDate fecha){
        Incidencia i = new Incidencia(p,problema,fecha);
        listaIncidencias.add(i);
    }
    
    public void listarIncidencias(){
        for (Incidencia listaIncidencia : listaIncidencias) {
            System.out.println(listaIncidencia.toCadena());
        }
    }
    
    public void listarPuestos(){
        for (Puesto listaPuesto : listaPuestos) {
            System.out.println(listaPuesto.toCadena());
        }
    }
    
    //buscarIncidencia por codigo y devuelve una incidencia
    public Incidencia buscarIncidencia(int codigo){
        for (Incidencia listaIncidencia : listaIncidencias) {
            if(listaIncidencia.getCodIncidencia() == codigo){
                return listaIncidencia;
            }
        }
        return null;
    }
    public Puesto buscarPuesto(int codigo){
        for (Puesto listaPuesto : listaPuestos) {
            if(listaPuesto.getCodigo()==codigo){
                return listaPuesto;
            }
        }
        return null;
    }
    
    public void resolverIncidencia(Incidencia i, String resu, LocalDate fecharesu){
        i.resuelve(resu, fecharesu);
    }
}
