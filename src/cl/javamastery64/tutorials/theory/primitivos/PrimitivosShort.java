package cl.javamastery64.tutorials.theory.primitivos;

/**
 * Declaración de variables PRIMITVOS SHORT
 *  Entero pequeño . Rango  -32768 a 32767
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */
public class PrimitivosShort {
    public static void main(String[] args) {

        short numeroShort = 32767;
        short numeroShort1 = -32768;
        //short numeroByte2 = 32769;

        System.out.println("Tipo primitivo: SHORT");
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("numeroShort1 = " + numeroShort1);
        System.out.println("Short.BYTES tipo byte corresponde en byte a  = " + Short.BYTES );
        System.out.println("Short.SIZE tipo byte corresponde en bites  = " + Short.SIZE );
        System.out.println("Short.MAX_VALUE valor máximo byte a  = " + Short.MAX_VALUE );
        System.out.println("Short.MAX_VALUE valor mínimo byte a  = " + Short.MIN_VALUE );
    }
}
