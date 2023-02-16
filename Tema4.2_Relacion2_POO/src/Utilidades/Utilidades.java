/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.util.ArrayList;

/**
 *
 * @author antonio.gimenez
 */
public class Utilidades {
    private static ArrayList<String> listaCodigos=new ArrayList();
    
    public static String generarCodigoLibro(){
        String codigo;
        char c1;
        char c2;
        int n1,n2,n3;
        do{
            c1=(char)((int)(Math.random()*26 +65));
            c2=(char)((int)(Math.random()*26 +65));
            n1 = (int) (Math.random()*10);
            n2 = (int) (Math.random()*10);
            n3 = (int) (Math.random()*10);
            
            StringBuilder sb = new StringBuilder();
            sb.append(c1);
            sb.append(c2);
            sb.append(n1);
            sb.append(n2);
            sb.append(n3);
            
            codigo = sb.toString();


        }while(codigoUsado(codigo) == true);
        
        listaCodigos.add(codigo);
        return codigo;
    }
    
    private static boolean codigoUsado(String codigo){
        for (int i = 0; i < listaCodigos.size(); i++) {
            if(listaCodigos.get(i).equals(codigo)){
                return true;
            }
        }
        return false;
    }
}
