/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author antonio.gimenez
 */
public class Agenda {
    private ArrayList<Contacto> listaContactos;   //=new ArrayList();
    private int contadorID;
   
    public Agenda(){
       this.listaContactos=new ArrayList();
       this.contadorID=1;
    }
    
    public void addContacto(String nombre, String email, String telefono){
        listaContactos.add(new Contacto(contadorID,nombre,email,telefono));
        contadorID++;
    }
    
    public void listarAgenda(){
        System.out.println("=============================");
        for (Contacto listaContacto : listaContactos) {
            System.out.println(listaContacto.aCadena());
        }
        System.out.println("=============================");
    }
    
    public void modificarContacto(int id){
       
       Contacto contacto=null;
       
       for (int i = 0; i < this.listaContactos.size(); i++) {
           if (listaContactos.get(i).getId()==id){
               //Acabo de encontrar el contacto con dicho id
               contacto=listaContactos.get(i);
               break;  //una vez encontrado, salgo del for
           }
        }
       
        if (contacto==null)
            System.out.println("ERROR: contacto no encontrado");
        else
            modificarContacto(contacto);
       
   }
   
   public void modificarContacto(String nombre){
     
       Contacto contacto=null;
       
       for (int i = 0; i < this.listaContactos.size(); i++) {
           if (listaContactos.get(i).getNombre().equalsIgnoreCase(nombre)){
               //Acabo de encontrar el contacto con dicho nombre
               contacto=listaContactos.get(i);
               break;  //una vez encontrado, salgo del for

               
           }
        }
        if (contacto==null)
            System.out.println("ERROR: contacto no encontrado");
        else
            modificarContacto(contacto);
       
   }
   
   
   private void modificarContacto(Contacto contacto){
        Scanner entrada=new Scanner(System.in);
        String nombre,email,tlf;
       
        System.out.println("=========== MODIFICANDO EL SIGUIENTE CONTACTO =================");
        System.out.println(contacto.aCadena());

        //se puede preguntar por cada cosa
        System.out.print("\nIntroduce el campo a modificar(nombre/email/tlf):");
        String campo=entrada.nextLine();

        if (campo.equalsIgnoreCase("nombre")) {

            System.out.print("Introduce el nuevo nombre:");
            nombre=entrada.nextLine();
            contacto.setNombre(nombre);

        }else if (campo.equalsIgnoreCase("email")) {

            System.out.print("Introduce el nuevo email:");
            email=entrada.nextLine();
            contacto.setEmail(email);

        }else if (campo.equalsIgnoreCase("tlf")) {
            System.out.print("Introduce el nuevo telefono:");
            tlf=entrada.nextLine();
            contacto.setTelefono(tlf);
        }
       
       
   }
    
    public ArrayList<Contacto> buscarContacto(String expresion){
       //Aquí programamos la buscado de nombres usand una expresión regular
       //usando comodines
       //    Ju —> Juan / Julio / Juanjo
       //    P —> Paco / Pedro / Perico
       
       ArrayList<Contacto> listaCoincidencias=new ArrayList();
       
       expresion=expresion.toLowerCase();
      
       for (int i = 0; i < listaContactos.size(); i++) {
           if (listaContactos.get(i).getNombre().toLowerCase().startsWith(expresion)){
               //El contacto actual comienza por la expresion
               listaCoincidencias.add(listaContactos.get(i));
           }
       }
       return listaCoincidencias;
       
   }
}
