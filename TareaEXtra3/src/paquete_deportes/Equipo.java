/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_deportes;

import java.util.Arrays;

/**
 *
 * @author PC
 */
public class Equipo {

    private String nombre;
    private String siglas;
    private int anio_fundacion;
    private Jugador[] jugadores;
    private Tecnico[] tecnicos;
    
   

    public void establecer_nombre(String nom_equipo) {
        nombre = nom_equipo;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_siglas(String siglas_e) {
        siglas = siglas_e;
    }

    public String obtener_siglas() {
        return siglas;
    }

    public void establecer_anio_fundacion(int anio) {
        anio_fundacion = anio;

    }

    public int obtener_anio_fundacion() {
        return anio_fundacion;
    }

    public void establecer_jugadores(Jugador[] j) {
        jugadores = j;
    }

    public Jugador[] obtener_jugadores() {
        return jugadores;
    }

    public void establecer_tecnicos(Tecnico[] t) {
        tecnicos = t;
    }

    public Tecnico[] obtener_tecnicos() {
        return tecnicos;
    }
    
     public double obtener_promedio_edad_tecnicos() {
        int suma = 0;
        double prome = 0;
        for (int i = 0; i < tecnicos.length; i++) {
            suma += tecnicos[i].obtener_edad();
        }
        prome = suma / tecnicos.length;
        return prome;
    }

    public double obtener_promedio_edad_jugadores() {
        int suma=0;
        double prome=0;
        for (int i = 0; i < jugadores.length; i++) {
            suma += jugadores[i].obtener_edad();
        }
        prome = suma/jugadores.length;
        return prome;
    }
     public Equipo(){
        
    }

    public Equipo(Jugador[] e_jugadores, Tecnico[] e_tecnicos) {
       
        jugadores = e_jugadores;
        tecnicos = e_tecnicos;

    }

   

    @Override
    public String toString() {
        String cadena = String.format("Reparto:\n"
                + "Equipo: %s\n"
                + "Sus tecnicos son:\n"
                + "%s\n"
                + "Sus jugadores son:\n"
                + "%s\n"
                + "Promedio edad de:\n"
                + "Técnicos:%s años \n"
                + "Jugadores:%s años ", obtener_nombre(),Arrays.toString(obtener_tecnicos()), Arrays.toString(obtener_jugadores()),
                obtener_promedio_edad_tecnicos(), obtener_promedio_edad_jugadores());

        return cadena;
    }

}
