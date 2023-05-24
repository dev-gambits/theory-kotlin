package cl.javamastery64.tutorials.theory.primitivos;

import java.util.Locale;

/**
 * Declaración de variables
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */
public class HelloWorld {
    public static void main(String[] args) {

        // STRING
        String hello = "Hello World, Hello Java....";
        String hola = "Hello World, Hello Java....";
        System.out.println("hello = " + hello);
        System.out.println(hello);
        System.out.println(hello.toUpperCase());
        System.out.println(hello.toLowerCase());
        System.out.println();

        // Primitivo int
        System.out.println("Primitivo int");
        int number = 144;
        int number1 = 12;
        int result = number1 * number;
        System.out.println("result = " + result);
        System.out.println();

        //Integer tipo de dato de referencia
        System.out.println("Dato de referencia Integer");
        Integer numer = 1200;
        System.out.println("numero = " + numer);
        System.out.println("numero = " + numer.intValue());

        System.out.println();

        System.out.println("Booleanos ");
        boolean value = true;

        if (value) {
            System.out.println("numero = " + numer);
        }

        System.out.println("VAR");
        var number2 = 100000;
        var number3 = 234;
        var number4 = 234.88;
        var number5 = 234.88;
        var string1 = "234.88";


        String nombre;
        nombre = "Emmanuel".toUpperCase();

        if (number4 == 10 || number4 == 234.88) {
            nombre = "MAGDALENA".toLowerCase();
            nombre = "MAGDALENA".toUpperCase(Locale.ROOT);
        }

        System.out.println("nombre = " + nombre);
    }



}

