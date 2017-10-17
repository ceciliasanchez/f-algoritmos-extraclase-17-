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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Docente caso1 = new Docente();
        Docente caso2 = new Docente();
        Asignatura asignatura = new Asignatura();
        Titulo titulo = new Titulo();

        System.out.println("Caso 1:");

        caso1.establecer_nombres("Luis V");
        System.out.println("Nombres:" + caso1.obtener_nombres());

        caso1.establecer_apellidos("Pérez J");
        System.out.println("Apellidos:" + caso1.obtener_apellidos());
        System.out.println("Tiene a su cargo las asignaturas:");

        caso1.establecer_asignatura_1("Matemáticas");
        asignatura.establecer_creditos(8);
        System.out.println("  Asignatura 1: " + caso1.obtener_asignatura1() + " con número de créditos " + asignatura.obtener_creditos());

        caso1.establecer_asignatura_2("Física");
        asignatura.establecer_creditos(6);
        System.out.println("  Asignatura 2: " + caso1.obtener_asignatura2() + " con número créditos " + asignatura.obtener_creditos());

        System.out.println("El docente tiene los siguientes títulos académicos");
        caso1.establecer_titulo_tercer_nivel("Licenciado de Matemáticas");
        titulo.establecer_nombre_universidad("Universidad Politécnica");
        System.out.println("  Título Tercer Nivel: " + caso1.obtener_titulo_tercer_nivel() + " - " + titulo.obtener_nombre_universidad());

        caso1.establecer_titulo_cuarto_nivel("Magister en Docencia Matemática");
        titulo.establecer_nombre_universidad("Universidad Valenciana");
        System.out.println("  Titulo Cuarto Nivel: " + caso1.obtener_titulo_cuarto_nivel() + " - " + titulo.obtener_nombre_universidad());

        System.out.println("\n");

        System.out.println("Caso 2:");
        caso2.establecer_nombres("Ana M");
        System.out.println("Nombres:" + caso2.obtener_nombres());

        caso2.establecer_apellidos("Velez P");
        System.out.println("Apellidos:" + caso2.obtener_apellidos());
        System.out.println("Tiene a su cargo las asignaturas:");

        caso2.establecer_asignatura_1("Sociales");
        asignatura.establecer_creditos(9);
        System.out.println("  Asignatura 1: " + caso2.obtener_asignatura1() + " con número de créditos " + asignatura.obtener_creditos());

        caso2.establecer_asignatura_2("Literatura");
        asignatura.establecer_creditos(10);
        System.out.println("  Asignatura 2: " + caso2.obtener_asignatura2() + " con múmero de créditos " + asignatura.obtener_creditos());
        System.out.println("El docente tiene los siguientes títulos académicos");
        caso2.establecer_titulo_tercer_nivel("Licenciado en Ciencias Sociales ");
        titulo.establecer_nombre_universidad("Universidad Salesiana");
        System.out.println("  Título Tercer Nivel: " + caso2.obtener_titulo_tercer_nivel() + " - " + titulo.obtener_nombre_universidad());

        caso2.establecer_titulo_cuarto_nivel("Magister en Docencia Social ");
        titulo.establecer_nombre_universidad("Universidad Cataluña");
        System.out.println("  Titulo Cuarto Nivel: " + caso2.obtener_titulo_cuarto_nivel() + " - " + titulo.obtener_nombre_universidad());
    }

}
