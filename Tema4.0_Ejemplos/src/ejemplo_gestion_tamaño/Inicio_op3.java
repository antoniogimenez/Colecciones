/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_gestion_tamaño;

import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Inicio_op3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        Grupo miClase = new Grupo("DAW1");
        
        miClase.addAlumno(new Alumno("Mortadelo", 20));
        miClase.addAlumno(new Alumno("Filemon", 18));
        miClase.addAlumno(new Alumno("Carpanta", 30));
        
        miClase.listarGrupo();
        
        System.out.println("");
        System.out.println("Introduce ID: ");
        int id = Integer.parseInt(s.nextLine());
        
        Alumno alu=miClase.buscarAlumno(id);
        
        if(alu!=null){
            alu.imprimirDetalles();
        }
        else{
            System.out.println("Alumno no encontrado");
        }
    }
    
}
