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
    
    private int idContrato;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private int precioAlquiler;
    private String estado;
    private Inmueble inmueble;
    private Inquilino inquilino;
    
    //constructores
    public Alquiler() {
    }

    public Alquiler(LocalDate fechaIni, LocalDate fechaFin, int precioAlquiler, String estado, Inmueble inmueble, Inquilino inquilino) {
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.precioAlquiler = precioAlquiler;
        this.estado = estado;
        this.inmueble = inmueble;
        this.inquilino = inquilino;
    }

    public Alquiler(int idContrato, LocalDate fechaIni, LocalDate fechaFin, int precioAlquiler, String estado, Inmueble inmueble, Inquilino inquilino) {
        this.idContrato = idContrato;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.precioAlquiler = precioAlquiler;
        this.estado = estado;
        this.inmueble = inmueble;
        this.inquilino = inquilino;
    }
    
    //getters y setters
    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }
    
    //toString
    @Override
    public String toString() {
        return "Alquiler{" + "idContrato=" + idContrato + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", precioAlquiler=" + precioAlquiler + ", estado=" + estado + ", inmueble=" + inmueble + ", inquilino=" + inquilino + '}';
    }
    
}
