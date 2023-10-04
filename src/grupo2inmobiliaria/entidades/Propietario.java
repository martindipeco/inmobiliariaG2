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
public class Propietario {
    
    private int id_propietario;
    private String apellido;
    private String nombre;
    private int cuit;
    private String domicilio;
    private int telefono;
    private String mail;
    
    //Necesitaremos contructor vacìo, completo sin id y completo full
    public Propietario(){     
    }
    
    public Propietario(String apellido, String nombre, int cuit, String domicilio, int telefono, String mail){
        this.apellido = apellido;
        this.nombre = nombre;
        this.cuit = cuit;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.mail = mail;
    }
    
    public Propietario(int id_propietario, String apellido, String nombre, int cuit, String domicilio, int telefono, String mail){
        this.id_propietario = id_propietario;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cuit = cuit;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.mail = mail;
    }
    
    //getters y setters
    public int getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(int id_propietario) {
        this.id_propietario = id_propietario;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    //toString
    @Override
    public String toString() {
        return "Propietario{" + "id_propietario=" + id_propietario + ", apellido=" + apellido + ", nombre=" + nombre + ", cuit=" + cuit + ", domicilio=" + domicilio + ", telefono=" + telefono + ", mail=" + mail + '}';
    }
    
}
