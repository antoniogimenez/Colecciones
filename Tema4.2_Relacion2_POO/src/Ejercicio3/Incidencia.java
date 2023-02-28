/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    private int id;
    
    public Incidencia(Puesto puesto,String problema,LocalDate fechaIncidencia){
        this.problema= problema;
        this.puesto = puesto;
        this.fechaIncidencia = fechaIncidencia;
        this.estado = TipoEstado.PENDIENTE;
        this.resolucion = null;
        this.fechaResolucion = null;
        this.id = codIncidencia;
        Incidencia.codIncidencia++;
    }
    
    public void resuelve(String descripResolucion, LocalDate fechaResolucion){
        this.resolucion = descripResolucion;
        this.fechaResolucion = fechaResolucion;
        this.estado = TipoEstado.RESUELTA;
    }
    
    public void detalleIncidencia(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("INCIDENCIA");
        System.out.println("==============================");
        System.out.println("CODIGO: "+codIncidencia);
        System.out.println("PUESTO: "+puesto.getDescripcion());
        System.out.println("------------------------");
        System.out.println("DESCRIPCION: "+this.problema);
        System.out.println("FECHA INCIDENCIA: "+fechaIncidencia.format(dtf));
        System.out.println("-------------------------");
        if (this.resolucion == null){
            System.out.println("RESOLUCION: Sin resolver");
        } else{
            System.out.println("RESOLUCION: "+this.resolucion);
        }
        if(this.fechaResolucion == null){
            System.out.println("FECHA RESOLUCION: Sin resolver");
        }else{
            System.out.println("FECHA RESOLUCION: "+fechaResolucion.format(dtf));
        }
        System.out.println("===============================");
    }
    
    public String toCadena(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String datos;
        datos = String.format("[%s] - %d - %s - %s",estado,id,problema,fechaIncidencia.format(dtf));
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
