/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

import java.util.ArrayList;

/**
 *
 * @author antonio.gimenez
 */
public class BD_Empresa {
    private ArrayList<Empresa> listaEmpresa;
    
    public BD_Empresa(){
        this.listaEmpresa = new ArrayList();
    }
    
    public void addEmpresa(Empresa e){
        listaEmpresa.add(e);
    }
    
    public Empresa buscarCIF(String CIF){
        Empresa e = null;
        for (int i = 0; i < listaEmpresa.size(); i++) {
            if(listaEmpresa.get(i).getCIF() == CIF){
                e = listaEmpresa.get(i);
            }
        }
        return e;
    }
    
    public ArrayList<Empresa> buscarNombre(String nombre){
        ArrayList<Empresa> listaCoincidencias = new ArrayList();
        
        nombre = nombre.toLowerCase();
        
        for (int i = 0; i < listaEmpresa.size(); i++) {
            if(listaEmpresa.get(i).getNombre().contains(nombre)){
                listaCoincidencias.add(listaEmpresa.get(i));
            }
        }
        return listaCoincidencias;
    }
}
