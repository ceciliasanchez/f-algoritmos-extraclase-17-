/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;
import academico.Universidad;
import academico.Asignatura;

/**
 *
 * @author PC
 */
public class Estudiante {

    private String nombres;
    private String apellidos;
    private Asignatura asignatura_1;
    private Asignatura asignatura_2;
    private Universidad universidad;
    
    public void establecer_nombres(String nom_e) {
        nombres = nom_e;

    }

    public String obtener_nombres() {
        return nombres;
    }
    public void establecer_apellidos(String ape_e) {
        apellidos = ape_e;

    }

    public String obtener_apellidos() {
        return apellidos;
    }
    
    public void establecer_asignatura_1(Asignatura asig_1) {
        asignatura_1 = asig_1;

    }

    public Asignatura obtener_asignatura_1() {
        return asignatura_1;
    }
    public void establecer_asignatura_2(Asignatura asig_2) {
        asignatura_2 = asig_2;

    }

    public Asignatura obtener_asignatura_2() {
        return asignatura_2;
    }
    public void establecer_universidad(Universidad uni) {
        universidad = uni;

    }

    public Universidad obtener_universidad() {
        return universidad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format(
                "Datos del Estudiante \n"
                        + "Nombres: %s \n"
                        + "Apellidos: %s \n"
                        + "Universidad: %s \n"
                        + "Tiene las siguientes asignaturas: \n"
                        + "Asignatura 1: %s \n "
                        + "Asignatura 2: %s \n",obtener_nombres(),obtener_apellidos(),obtener_universidad(),obtener_asignatura_1(),obtener_asignatura_2());
        return cadena;
        
    }
        
    
}
