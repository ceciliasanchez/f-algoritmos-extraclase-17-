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
public class Asignatura {
    private String asignatura;
    private int creditos;
    
  
     
     public void establecer_creditos(int cred){
       creditos = cred;
     }
     
     public int obtener_creditos(){
         return creditos;
     }

}
