/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;



/**
 *
 * @author PC
 */
public class Asignatura {

    private String nombre;
    private int creditos;
    private Carrera carrera;
    private Docente docente;

    public void establecer_nombre(String nom_asig) {
        nombre = nom_asig;

    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_creditos(int cred_asig) {
        creditos = cred_asig;

    }

    public int obtener_creditos() {
        return creditos;
    }

    public void establecer_carrera(Carrera nom_carrera) {
        carrera = nom_carrera;

    }

    public Carrera obtener_carrera() {
        return carrera;
    }
    public void establecer_docente(Docente nom_docente) {
        docente = nom_docente;

    }

    public Docente obtener_docente() {
        return docente;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s - (%d creditos ) de la carrera %s. Docente: %s"
                  ,obtener_nombre(),obtener_creditos(),obtener_carrera(),obtener_docente()
        );
        return cadena;
    }
}
