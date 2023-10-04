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
public class Inmueble {
    
    private int id_inmueble;
    private String calle;
    private int altura;
    private char tipo;
    private float superficie;
    private float precio;
    private char zona;
    private boolean disponible;
    
    private Propietario propietario;
    
    //constructores

    public Inmueble() {
    }

    public Inmueble(String calle, int altura, char tipo, float superficie, float precio, char zona, boolean disponible, Propietario propietario) {
        this.calle = calle;
        this.altura = altura;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
        this.zona = zona;
        this.disponible = disponible;
        this.propietario = propietario;
    }

    public Inmueble(int id_inmueble, String calle, int altura, char tipo, float superficie, float precio, char zona, boolean disponible, Propietario propietario) {
        this.id_inmueble = id_inmueble;
        this.calle = calle;
        this.altura = altura;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
        this.zona = zona;
        this.disponible = disponible;
        this.propietario = propietario;
    }
    
    //getters y setters

    public int getId_inmueble() {
        return id_inmueble;
    }

    public void setId_inmueble(int id_inmueble) {
        this.id_inmueble = id_inmueble;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public char getZona() {
        return zona;
    }

    public void setZona(char zona) {
        this.zona = zona;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
    //toString

    @Override
    public String toString() {
        return "Inmueble{" + "id_inmueble=" + id_inmueble + ", calle=" + calle + ", altura=" + altura + ", tipo=" + tipo + ", superficie=" + superficie + ", precio=" + precio + ", zona=" + zona + ", disponible=" + disponible + ", propietario=" + propietario + '}';
    }
    
    
}
