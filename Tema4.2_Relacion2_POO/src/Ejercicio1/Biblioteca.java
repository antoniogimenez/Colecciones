/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author antonio.gimenez
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> listaLibros;
    private ArrayList<Autor> listaAutores;
    
    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.listaAutores = new ArrayList();
        this.listaLibros = new ArrayList();
    }
    
    public void addLibro(String titulo, int codAutor, int año){
        Libro l1;
        Autor autor = buscarAutor(codAutor);
        if(autor != null){
            l1 = new Libro(titulo,autor,año);
            listaLibros.add(l1);
        }
        else{
            System.out.println("Error. Autor no encontrado");
        }
    }
    
    public void addAutor(String nombre, String apellido1, String apellido2, String email){
        Autor autor = new Autor(nombre,apellido1,apellido2,email);
        listaAutores.add(autor);
    }
    
    public boolean prestarLibro(String codigo){
        for (Libro listaLibro : listaLibros) {
            if(listaLibro.getCodigo().equals(codigo)){
                return true;
            }
        }
        return false;
    }
    
    public boolean devolverLibro(String codigo){
        for (Libro listaLibro : listaLibros) {
            if(listaLibro.getCodigo().equals(codigo)){
                listaLibro.setPrestado(false);
                return true;
            }
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Autor> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(ArrayList<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }
    
}
