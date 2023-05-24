package cl.javamastery64.tutorials.theory.string;

/**
 * Declaración de variables
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */
public class StringTheory {
    public static void main(String[] args) {
        String nombre = "Emmanuel";
        String nombreDos = "Emmanuel \"String\"";
        String nombreCompleto = nombre + nombreDos;
        String nombreString = new String("EMMANUEL".toLowerCase());

        System.out.println("nombre = " + nombre);
        System.out.println("nombreDos = " + nombreDos);
        System.out.println("nombreCompleto = " + nombreCompleto);
        System.out.println("nombreString = " + nombreString);
        System.out.println("==  :   " + nombre == nombreString);
        System.out.println("equalsIgnoreCase:  "+nombre.equalsIgnoreCase(nombreString));
        System.out.println("equals:  "+nombre.equals(nombreString));

    }
}
