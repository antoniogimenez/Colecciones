/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author antonio.gimenez
 */
public class Cuenta_Corriente {
    private static int contador=1001;
    private int numero;
    private Cliente titular;
    private double saldo;
    
    public Cuenta_Corriente(Cliente c, double saldo){
        this.titular = c;
        this.saldo = saldo;
        this.numero = contador;
        this.contador++;
    }
    
    public void ingreso(double cantidad){
        this.saldo = saldo + cantidad;
    }
    
    public boolean reintegro(double cantidad){
        if(this.saldo > cantidad){
            this.saldo = saldo - cantidad;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transferencia(Cuenta_Corriente cuentaDestino, double cantidad){
        if(this.saldo > cantidad){
            cuentaDestino.ingreso(cantidad);
            this.saldo = saldo - cantidad;
            return true;
        } else{
            return false;
        }
    }
    
    public String aCadena(){
        String datos;
        datos = String.format("%d - %s - %f",numero,titular.getNombre(),saldo);
        return datos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
