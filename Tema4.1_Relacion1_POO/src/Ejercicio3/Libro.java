/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author antonio.gimenez
 */
public class Libro {
    private String isbn;
    private String autor;
    private String titulo;
    private int año;
    
    public Libro(String titulo, String autor, int año){
        this.autor = autor;
        this.año = año;
        this.titulo = titulo;
        this.isbn = null; //PUEDE HABER LIBROS QUE NO TENGAN ISBN POR ESO HEMOS PUESTO NULL
    }
    
    public Libro(String titulo, String autor, int año, String isbn){
        this.autor = autor;
        this.año = año;
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public String getIsbn() {
        String isbnNulo;
        if(this.isbn == null){
            isbnNulo = String.format("***[%s] No tiene Isbn***", this.titulo);
            //System.out.println("***["+this.titulo+"] No tiene Isbn***");   ESTO ESTA MAL
            return isbnNulo;
        } else {
            return isbn;
        }
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public String citaBibliografica(){
        String cita;
        
        cita = String.format("%s, (%d), %s",this.autor,this.año,this.titulo);
        return cita;
    }
}
