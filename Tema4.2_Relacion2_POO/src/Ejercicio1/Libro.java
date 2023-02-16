/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author antonio.gimenez
 */
import Utilidades.Utilidades;
public class Libro {
    private String codigo;
    private String titulo;
    private Autor autor;
    private int año;
    private boolean prestado;
    
    public Libro(String titulo, Autor autor, int año){
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.codigo = Utilidades.generarCodigoLibro();
        this.prestado = false;
    }
    
    public void imprimir(){
        if(this.prestado == true){
            System.out.println(this.prestado+"   "+this.codigo+" - "+this.titulo+" ("+this.año+") - "+this.autor);
        }
        else{
            System.out.println(this.prestado+"   "+this.codigo+" - "+this.titulo+" ("+this.año+") - "+this.autor);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
}
