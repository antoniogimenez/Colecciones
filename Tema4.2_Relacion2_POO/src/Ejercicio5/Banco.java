/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author antonio.gimenez
 */
public class Banco {
    private String nombre;
    private ArrayList<Cuenta_Corriente> listaCuentas;
    private ArrayList<Cliente> listaClientes;
    
    public Banco(String nombre){
        this.nombre = nombre;
        this.listaCuentas = new ArrayList();
        this.listaClientes = new ArrayList();
    }
    
    public void nuevoCliente(String dni,String nombre, String apellido, String email){
        Cliente c = new Cliente(dni,nombre,apellido,email);
        listaClientes.add(c);
    }
    
    public void nuevaCuenta(Cliente c, double saldoIncial){
        Cuenta_Corriente cuenta = new Cuenta_Corriente(c,saldoIncial);
        listaCuentas.add(cuenta);
    }
    
    public Cliente buscarCliente(String dni){
        for (Cliente listaCliente : listaClientes) {
            if(listaCliente.getDNI().equalsIgnoreCase(dni)){
                return listaCliente;
            }
        }
        return null;
    }
    
    public Cuenta_Corriente buscarCuenta(int numero){
        for (Cuenta_Corriente listaCuenta : listaCuentas) {
            if(listaCuenta.getNumero() == numero){
                return listaCuenta;
            }
        }
        return null;
    }
    
    public ArrayList<Cuenta_Corriente> getCuentas(Cliente c){
        ArrayList<Cuenta_Corriente> cuentasCliente = new ArrayList();
        for (Cuenta_Corriente listaCuenta : listaCuentas) {
            if(listaCuenta.getTitular() == c){
                cuentasCliente.add(listaCuenta);
            }
        }
        return cuentasCliente;
    }
    
    public void listarCuentas(){
        for (Cuenta_Corriente listaCuenta : listaCuentas) {
            System.out.println(listaCuenta.aCadena());
        }
    }
    
    public void listarClientes(){
        for (Cliente listaCliente : listaClientes) {
            System.out.println(listaCliente.aCadena());
        }
    }
    

}
