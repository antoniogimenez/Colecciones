/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author antonio.gimenez
 */
public class Coche {
    private String marca;
    private String modelo;
    private Motor motor;
    private Rueda[] ruedas;
    
    public Coche(String marca, String modelo, int caballos,
            TipoCombustible combustible, TipoCambio cambio, int radio){
        this.marca = marca;
        this.modelo = modelo;
        //Me creo el motor en la clase coche
        this.motor = new Motor(caballos,combustible,cambio);
        //Mecreo las cuatro ruedas el array es de 5 elementos para acceder
        //rueda1->del.izq
        //...
        this.ruedas = new Rueda[5];
        this.ruedas[1]= new Rueda(radio);
        this.ruedas[2]= new Rueda(radio);
        this.ruedas[3]= new Rueda(radio);
        this.ruedas[4]= new Rueda(radio);
    }
    
    public void cambiarRueda(int numRueda){
        //resetea a 0 los km de la rueda
        if (numRueda >= 1 && numRueda <=4){ 
            this.ruedas[numRueda].setKm(0);
        }
        else{
            System.out.println("ERROR: rueda incorrecta");
        }
    }
    
    public void recorrer(int km){
        int kmActuales = this.motor.getKm();
        this.motor.setKm(kmActuales+km);
        
        for (int i = 1; i < ruedas.length; i++) {
            this.ruedas[i].setKm(this.ruedas[i].getKm()+km);
        }
    }
    
    public void imprimirFicha(){
        System.out.println("");
        System.out.println("Ficha del Coche");
        System.out.println("----------------------------------------------");
        System.out.println("Marca/Modelo: "+this.marca+" "+this.modelo);
        System.out.println("Motor (Caballos): "+this.motor.getCaballos());
        System.out.println("Combustible: "+this.motor.getCombustible());
        System.out.println("Cambio: "+this.motor.getCambio());
        System.out.println("km del motor: "+this.motor.getKm());
        System.out.println("Radio de las ruedas: "+this.ruedas[1].getRadio());
        //solo se pone una vgez porque son las cuatro iguales
        System.out.printf("Km de las ruedas: [%d]   [%d]   [%d]   [%d]\n",
                this.ruedas[1].getKm(),this.ruedas[2].getKm(),
                this.ruedas[3].getKm(),this.ruedas[4].getKm());
        System.out.println("----------------------------------------------");
        System.out.println("");
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }
    
}
