package cl.javamastery64.tutorials.theory;

/**
 * Declaración de variables PRIMITVOS long
 *  Entero Grande . Rango  -9223372036854775808l a 9223372036854775807l
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */
public class PrimitivosLong {
    public static void main(String[] args) {

        long numeroLong = 9223372036854775807l;
        long numeroLong1 = -9223372036854775808l;
        var numeroLong2 = -9223372036854775808l;

        //short numeroLong2 = 92233720368547758079;

        System.out.println("Tipo primitivo: Long");
        System.out.println("numeroILong = " + numeroLong);
        System.out.println("numeroLong1 = " + numeroLong1);
        System.out.println("Long.BYTES tipo long corresponde en byte a  = " + Long.BYTES );
        System.out.println("Long.SIZE tipo long corresponde en bites  = " + Long.SIZE );
        System.out.println("Long.MAX_VALUE valor máximo byte a  = " + Long.MAX_VALUE );
        System.out.println("Long.MAX_VALUE valor mínimo byte a  = " + Long.MIN_VALUE );
    }
}
