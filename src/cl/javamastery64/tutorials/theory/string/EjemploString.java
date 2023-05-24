package cl.javamastery64.tutorials.theory.string;

/**
 * Declaración de variables
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */
public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        System.out.println("curso = " + curso);
        System.out.println("curso2 = " + curso2);

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        String curso3 = "Programación Java";
        System.out.println("Programación Java :   " + curso3);

        esIgual = curso == curso3;
        System.out.println("curso == curso3 :   " + esIgual);
    }
}
