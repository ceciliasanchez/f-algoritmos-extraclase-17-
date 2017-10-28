/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_deportes;

/**
 *
 * @author PC
 */
public class Jugador {

    private String nombre;
    private String posicion;
    private int edad;

   

    public void establecer_nombre(String nom_jugador) {
        nombre = nom_jugador;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_posicion(String p) {
        posicion = p;
    }

    public String obtener_posicion() {
        return posicion;
    }

    public void establecer_edad(int e_jugador) {
        edad = e_jugador;

    }

    public int obtener_edad() {
        return edad;
    }
     public Jugador(String nom_jugador, String p, int e_jugador) {
        nombre = nom_jugador;
        posicion = p;
        edad = e_jugador;
    }

    @Override
    public String toString() {
        String cadena = String.format(" %s - %s - %s años \n", obtener_nombre(), obtener_posicion(), obtener_edad());
        return cadena;
    }

}
