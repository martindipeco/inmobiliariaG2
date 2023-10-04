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
public class Inquilino {
    
    private int id_inquilino;
    private String apellido;
    private String nombre;
    private String domicilio;
    private int telefono;
    private String mail;
    private int cuit;
    private String empresa;
    
    //constructores
    public Inquilino() {
    }

    public Inquilino(String apellido, String nombre, String domicilio, int telefono, String mail, int cuit, String empresa) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.mail = mail;
        this.cuit = cuit;
        this.empresa = empresa;
    }

    public Inquilino(int id_inquilino, String apellido, String nombre, String domicilio, int telefono, String mail, int cuit, String empresa) {
        this.id_inquilino = id_inquilino;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.mail = mail;
        this.cuit = cuit;
        this.empresa = empresa;
    }
    
    //getters & setters
    public int getId_inquilino() {
        return id_inquilino;
    }

    public void setId_inquilino(int id_inquilino) {
        this.id_inquilino = id_inquilino;
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

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    //toString
    @Override
    public String toString() {
        return "Inquilino{" + "id_inquilino=" + id_inquilino + ", apellido=" + apellido + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", mail=" + mail + ", cuit=" + cuit + ", empresa=" + empresa + '}';
    }
    
}
