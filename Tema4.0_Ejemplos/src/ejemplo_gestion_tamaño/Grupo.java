/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_gestion_tamaño;

import java.util.ArrayList;

/**
 *
 * @author antonio.gimenez
 */
public class Grupo {
    private String nombre;
    private ArrayList<Alumno> lista;
    
    private final int MAX_ALUMNOS;

    public Grupo(String nombre){
        this.nombre = nombre;
        this.lista = new ArrayList(); 
        MAX_ALUMNOS=30;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Alumno> lista) {
        this.lista = lista;
    }
    
    public void addAlumno(Alumno a){
        if(lista.size()<MAX_ALUMNOS){
            lista.add(a);
        }
        else{
            System.out.println("No puedo añadir mas alumnos");
        }
    }
    
    public Alumno buscarAlumno(int id){
        Alumno alu=null;
        
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId()==id){
                return lista.get(i);
            }
        }
        return alu;
    }
    
    public void listarGrupo(){
        Alumno alu;
        System.out.println("Grupo: "+this.nombre);
        System.out.println("=====================");
        for (int i = 0; i < lista.size(); i++) {
            alu = lista.get(i);
            System.out.println(alu.toCadena());
        }
    }
    
}
