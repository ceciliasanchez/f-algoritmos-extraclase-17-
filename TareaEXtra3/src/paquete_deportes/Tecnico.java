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
public class Tecnico {

    private String nombre;
    private String funcion;
    private int edad;

    public Tecnico(String nom_tecnico, String fun_t, int e_tecnico) {
        nombre = nom_tecnico;
        funcion = fun_t;
        edad = e_tecnico;
    }

    public void establecer_nombre(String nom_tecnico) {
        nombre = nom_tecnico;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_funcion(String fun_t) {
        funcion = fun_t;
    }

    public String obtener_funcion() {
        return funcion;
    }

    public void establecer_edad(int e_tecnico) {
        edad = e_tecnico;

    }

    public int obtener_edad() {
        return edad;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s - %s -%s años \n", obtener_nombre(), obtener_funcion(), obtener_edad());
        return cadena;
    }

}
