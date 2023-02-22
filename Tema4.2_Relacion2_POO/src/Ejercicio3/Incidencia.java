/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.time.LocalDate;

/**
 *
 * @author antonio.gimenez
 */
enum TipoEstado{
    PENDIENTE,RESUELTA;
}
public class Incidencia {
    private static int codIncidencia = 1001;
    private LocalDate fechaIncidencia;
    private String problema;
    private LocalDate fechaResolucion;
    private String resolucion;
    private TipoEstado estado;
    private Puesto puesto;
    
    public Incidencia(String problema,Puesto puesto,LocalDate fechaIncidencia, TipoEstado estado){
        this.problema= problema;
        this.puesto = puesto;
        this.fechaIncidencia = fechaIncidencia;
        this.estado = TipoEstado.PENDIENTE;
        this.resolucion = null;
        Incidencia.codIncidencia++;
    }
    
    public void resuelve(String descripResolucion, LocalDate fechaResolucion){
        
    }
    
    public void detalleIncidencia(){
        System.out.println("INCIDENCIA");
        System.out.println("==============================");
        System.out.println("CODIGO: "+getCodIncidencia());
        System.out.println("PUESTO: "+getPuesto());
        System.out.println("------------------------");
        System.out.println("DESCRIPCION: "+getProblema());
        System.out.println("FECHA INCIDENCIA: "+getFechaIncidencia());
        System.out.println("-------------------------");
        System.out.println("RESOLUCION: "+getResolucion());
        System.out.println("FECHA RESOLUCION: "+getFechaResolucion());
        System.out.println("===============================");
    }
    
    public String toString(){
        String datos;
        datos = String.format("[%s] - %d - %s - %s",estado,codIncidencia,problema,fechaIncidencia);
        return datos;
    }

    public static int getCodIncidencia() {
        return codIncidencia;
    }

    public static void setCodIncidencia(int codIncidencia) {
        Incidencia.codIncidencia = codIncidencia;
    }

    public LocalDate getFechaIncidencia() {
        return fechaIncidencia;
    }

    public void setFechaIncidencia(LocalDate fechaIncidencia) {
        this.fechaIncidencia = fechaIncidencia;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public LocalDate getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDate fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public TipoEstado getEstado() {
        return estado;
    }

    public void setEstado(TipoEstado estado) {
        this.estado = estado;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    
}
