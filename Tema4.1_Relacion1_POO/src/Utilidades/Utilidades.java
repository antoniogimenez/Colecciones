/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author antonio.gimenez
 */
public class Utilidades {
    
    public static boolean checkEmail(String email){
        boolean emailCorrecto=false;
        for (int i = 0; i < email.length(); i++) {
            if(email.contains("@") && email.contains(".com")){
                emailCorrecto = true;
            }
        }
        
        return emailCorrecto;
    }
    
}
