/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import academico.Asignatura;
import academico.Carrera;
import academico.Docente;
import academico.Universidad;
import estudiante.Estudiante;
import general.Pais;

/**
 *
 * @author PC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pais p1 = new Pais();
        Pais p2 = new Pais();
        Pais p3 = new Pais();
        Pais p4 = new Pais();
 

        p1.establecer_nombre("Ecuador");
        p2.establecer_nombre("Colombia");
        p3.establecer_nombre("Perú");
        p4.establecer_nombre("Venezuela");
        
        
        Universidad u1 = new Universidad();
        Universidad u2 = new Universidad();

        u1.establecer_nombre("Universidad Técnica Particular de Loja");
        u1.establecer_siglas("UTPL");
        u1.establecer_pais(p1);
        u2.establecer_nombre("Universidad Técnica Equinoccial");
        u2.establecer_siglas("UTE");
        u2.establecer_pais(p1);

        Docente d1 = new Docente();
        Docente d2 = new Docente();
        Docente d3 = new Docente();
        Docente d4 = new Docente();

        d1.establecer_nombres("Mario");
        d1.establecer_apellidos("Alcivar");
        d1.establecer_pais(p2);
        d2.establecer_nombres("María");
        d2.establecer_apellidos("Ruíz");
        d2.establecer_pais(p3);
        d3.establecer_nombres("Luis");
        d3.establecer_apellidos("Armijos");
        d3.establecer_pais(p4);
        d4.establecer_nombres("María");
        d4.establecer_apellidos("Ruíz");
        d4.establecer_pais(p3);

        Carrera c1 = new Carrera();
        Carrera c2 = new Carrera();
        Carrera c3 = new Carrera();
        Carrera c4 = new Carrera();

        c1.establecer_nombre("Sistemas");
        c1.establecer_modalidad("presencial");
        c2.establecer_nombre("Sistemas");
        c2.establecer_modalidad("presencial");
        c3.establecer_nombre("Ingenieria Química");
        c3.establecer_modalidad("distancia");
        c4.establecer_nombre("Ingeniería Química");
        c4.establecer_modalidad("distancia");

        Asignatura a1 = new Asignatura();
        Asignatura a2 = new Asignatura();
        Asignatura a3 = new Asignatura();
        Asignatura a4 = new Asignatura();

        a1.establecer_nombre("Matematicas");
        a1.establecer_creditos(10);
        a1.establecer_carrera(c1);
        a1.establecer_docente(d1);
        a2.establecer_nombre("Fisica");
        a2.establecer_creditos(8);
        a2.establecer_carrera(c2);
        a2.establecer_docente(d2);
        a3.establecer_nombre("Biologia");
        a3.establecer_creditos(9);
        a3.establecer_carrera(c3);
        a3.establecer_docente(d3);
        a4.establecer_nombre("Fisica");
        a4.establecer_creditos(7);
        a4.establecer_carrera(c4);
        a4.establecer_docente(d4);

        

        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante();

        e1.establecer_nombres("Luis V");
        e1.establecer_apellidos("Perez J");
        e1.establecer_asignatura_1(a1);
        e1.establecer_asignatura_2(a2);
        e1.establecer_universidad(u1);
        
        
        e2.establecer_nombres("Ana");
        e2.establecer_apellidos("Lima J");
        e2.establecer_asignatura_1(a3);
        e2.establecer_asignatura_2(a4);
        e2.establecer_universidad(u2);
        
        System.out.println("****** Caso 1 ******\n");
        System.out.println(e1);
        System.out.println("****** Caso 2 ******\n");
        System.out.println(e2);
    }

}
