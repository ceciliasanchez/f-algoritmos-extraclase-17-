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
public class Carrera {

    private String nombre;
    private String modalidad;
    
    
    public void establecer_nombre(String nom_carrera){
        nombre = nom_carrera;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
     public void establecer_modalidad(String mod){
        modalidad = mod;
    }
    
    public String obtener_modalidad(){
        return modalidad;
    }
    @Override
     public String toString(){
         String cadena = String.format("%s - modalidad (%s)",obtener_nombre(),obtener_modalidad());
         return cadena;
     }
}
