package cl.javamastery64.tutorials.theory;

/**
 * Declaración de variables var
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */
public class TipoDatoVar {
    public static void main(String[] args) {

        var numeroInt = 2147483647;
        var numeroInt1 = -2147483648;
        //short numeroByte2 = 32769;

        System.out.println("Tipo primitivo: int");
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("numeroInt1 = " + numeroInt1);
        System.out.println("Integer.BYTES tipo byte corresponde en byte a  = " + Integer.BYTES );
        System.out.println("Integer.SIZE tipo byte corresponde en bites  = " + Integer.SIZE );
        System.out.println("Integer.MAX_VALUE valor máximo byte a  = " + Integer.MAX_VALUE );
        System.out.println("Integer.MAX_VALUE valor mínimo byte a  = " + Integer.MIN_VALUE );
    }
}
