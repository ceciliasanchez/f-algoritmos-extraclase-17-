/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

import general.Pais;

/**
 *
 * @author PC
 */
public class Docente {

    private String nombres;
    private String apellidos;
    private Pais pais;
    
    public void establecer_nombres(String nom_docente){
        nombres = nom_docente;
    }
    public String obtener_nombres(){
        return nombres;
    }
    
    public void establecer_apellidos(String ape_docente){
        apellidos = ape_docente;
    }
    public String obtener_apellidos(){
        return apellidos;
    }
    
    public void establecer_pais(Pais p){
        pais = p;
    }
    public Pais obtener_pais(){
        return pais;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s %s - pais %s ",obtener_nombres(),obtener_apellidos(),obtener_pais());
   return cadena;
    }
    
}
