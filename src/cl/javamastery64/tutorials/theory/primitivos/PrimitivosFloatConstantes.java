package cl.javamastery64.tutorials.theory.primitivos;

/**
 * Declaración de variables PRIMITVOS float Constantes
 *  punto flotante Grande, corresponde a los números reales .
 *  Rango  -1.4E-45f a 3.4028235E38f
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */
public class PrimitivosFloatConstantes {
    public static void main(String[] args) {

        float numeroFloat = 3.4028235E38f;
        float numeroFloat1 = -1.4E-45f;
        var numeroFloa2 = -9223372036854775.808f;
        float numeroFloat3 = -1.5E4f;
        float numeroFloat4 = -1.5E10f;

        //short numeroLong2 = 92233720368547758079;

        System.out.println("Tipo primitivo: Float");
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("numeroFloat1 = " + numeroFloat1);
        System.out.println("Float.BYTES tipo float corresponde en byte a  = " + Float.BYTES );
        System.out.println("Float.SIZE tipo float corresponde en bites  = " + Float.SIZE );
        System.out.println("Float.NEGATIVE_INFINITY = " + Float.NEGATIVE_INFINITY );
        System.out.println("Float.MAX_VALUE valor máximo byte a  = " + Float.MAX_VALUE );
        System.out.println("Float.MAX_VALUE valor mínimo byte a  = " + Float.MIN_VALUE );

        System.out.println("numeroFloa2 = " + numeroFloa2);
        System.out.println("numeroFloat3 = " + numeroFloat3);
        System.out.println("numeroFloat4 = " + numeroFloat4);
    }
}
