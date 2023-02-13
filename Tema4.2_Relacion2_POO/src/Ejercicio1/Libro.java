/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author antonio.gimenez
 */
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
    }
}
