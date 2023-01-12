/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

import ejemplo0.*;

/**
 *
 * @author antonio.gimenez
 */
public class Persona {
    private String nombre;  //ATRIBUTOS DE LA CLASE
    private int edad;       //ATRIBUTOS DE LA CLASE
    private String dni;     //ATRIBUTOS DE LA CLASE
    private double altura;
    private double peso;
    private double IMC;
    
    //CONSTRUCTOR POR DEFECTO O VACIO
    public Persona(){
        
    }
    //CONSTRUCTOR CON TODOS LOS PARAMETROS
    public Persona(String nombre, int edad, String dni, double altura, double peso){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
        this.altura=altura;
        this.peso = peso;
        
        //calculo el imc
        this.IMC = this.calcularIMC();
        
    }
    
    public Persona(Persona persona){//la llamada no es necesario que este creado en el main
        this.nombre=persona.getNombre();
        this.edad=persona.getEdad();
        this.dni=persona.getDni();
        this.altura=persona.getAltura();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;       //  UTILIZO EL THIS PARA REFERIRME AL ATRIBUTO DE LA CLASE
    }
    
    public void setEdad(int edad) {
        //Compruebo que la edad es correcta
        if (edad<=0){
            System.out.println("Error, edad neegativa");
        } else {
            this.edad = edad;
        }
        
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        this.IMC = this.calcularIMC();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.IMC = this.calcularIMC();
    }
    
    public double getIMC() {
        return IMC;
    }
    
    //*********** METODOS **********//
    
    
    //Metodo para imprimir datos 
    public void imprimirDatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Dni: "+this.dni);
        System.out.println("Altura: "+this.altura);
        System.out.println("Peso: "+this.peso);
        System.out.printf("IMC:%.2f\n",this.IMC);
    }
    
    //Metodo privaADO PARA CALCULAR EL IMC
    private double calcularIMC(){
        //Calculo IMC
        double IMC = this.peso / (this.altura*this.altura);
        
        return IMC;
    }
}
