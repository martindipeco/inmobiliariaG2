/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo2inmobiliaria.entidades;

/**
 *
 * @author marti
 */
public class Garante {
    
    private int id_garante;
    private String apellido;
    private String nombre;
    private int cuit;
    
    //constructores
    public Garante() {
    }

    public Garante(String apellido, String nombre, int cuit) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public Garante(int id_garante, String apellido, String nombre, int cuit) {
        this.id_garante = id_garante;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cuit = cuit;
    }
    
    //getters & setters

    public int getId_garante() {
        return id_garante;
    }

    public void setId_garante(int id_garante) {
        this.id_garante = id_garante;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
    
    //toString

    @Override
    public String toString() {
        return "Garante{" + "id_garante=" + id_garante + ", apellido=" + apellido + ", nombre=" + nombre + ", cuit=" + cuit + '}';
    }
    
    
}
