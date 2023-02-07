/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author antonio.gimenez
 */
enum TipoCambio{
    MANUAL,AUTOMATICO;
}
enum TipoCombustible{
    DIESEL,GASOLINA;
}
public class Motor {
    private int caballos;
    private int km;
    private TipoCombustible combustible;
    private TipoCambio cambio;
    
    public Motor(int caballos, TipoCombustible combustible, TipoCambio cambio){
        this.caballos = caballos;
        this.combustible = combustible;
        this.cambio = cambio;
        this.km = 0;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }

    public TipoCambio getCambio() {
        return cambio;
    }

    public void setCambio(TipoCambio cambio) {
        this.cambio = cambio;
    }
    
}
