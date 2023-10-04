/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo2inmobiliaria.entidades;

import java.time.LocalDate;

/**
 *
 * @author marti
 */
public class Alquiler {
    
    private int id_alquiler;
    private Inquilino inquilino;
    private Inmueble inmueble;
    private Garante garante;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private float monto;
    private char estado;
    
    //constructores
    public Alquiler() {
    }

    public Alquiler(Inquilino inquilino, Inmueble inmueble, Garante garante, LocalDate fechaInicio, LocalDate fechaFin, float monto, char estado) {
        this.inquilino = inquilino;
        this.inmueble = inmueble;
        this.garante = garante;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.estado = estado;
    }

    public Alquiler(int id_alquiler, Inquilino inquilino, Inmueble inmueble, Garante garante, LocalDate fechaInicio, LocalDate fechaFin, float monto, char estado) {
        this.id_alquiler = id_alquiler;
        this.inquilino = inquilino;
        this.inmueble = inmueble;
        this.garante = garante;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.estado = estado;
    }
    
    //getters y setters 
    public int getId_alquiler() {
        return id_alquiler;
    }

    public void setId_alquiler(int id_alquiler) {
        this.id_alquiler = id_alquiler;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Garante getGarante() {
        return garante;
    }

    public void setGarante(Garante garante) {
        this.garante = garante;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    //toString
    @Override
    public String toString() {
        return "Alquiler{" + "id_alquiler=" + id_alquiler + ", inquilino=" + inquilino + ", inmueble=" + inmueble + ", garante=" + garante + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", monto=" + monto + ", estado=" + estado + '}';
    }
    
}
