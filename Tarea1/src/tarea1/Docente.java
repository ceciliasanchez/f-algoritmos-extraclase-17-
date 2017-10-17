/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author PC
 */
public class Docente {

    private String nombres;
    private String apellidos;
    private String titulo_tercer_nivel;
    private String titulo_cuarto_nivel;
    private String asignatura_1;
    private String asignatura_2;

    public void establecer_nombres(String nom) {
        nombres = nom;
    }

    public void establecer_apellidos(String ape) {
        apellidos = ape;

    }

    public void establecer_titulo_tercer_nivel(String titulo_tercer) {
        titulo_tercer_nivel = titulo_tercer;
    }

    public void establecer_titulo_cuarto_nivel(String cuarto_nivel) {
        titulo_cuarto_nivel = cuarto_nivel;
    }

    public void establecer_asignatura_1(String asig1) {
        asignatura_1 = asig1;

    }

    public void establecer_asignatura_2(String asig2) {
        asignatura_2 = asig2;

    }

    public String obtener_nombres() {
        return nombres;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public String obtener_titulo_tercer_nivel() {
        return titulo_tercer_nivel;
    }

    public String obtener_titulo_cuarto_nivel() {
        return titulo_cuarto_nivel;
    }
    public String obtener_asignatura1() {
        return asignatura_1;
    }
    public String obtener_asignatura2() {
        return asignatura_2;
    }

  
}
