package cl.javamastery64.tutorials.theory;

/**
 * Declaración de variables PRIMITVOS double
 *  punto flotante MUY Grande, corresponde a los números reales .
 *  Rango  4.9E-324 a 1.7976931348623157E308
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */
public class PrimitivosFDouble {
    static double doubleStatic;
    public static void main(String[] args) {

        double numeroFDouble = 3.4028235E38;
        double numeroFDouble1 = -1.4E-45;
        var numeroFDouble2 = -9223372036854775.808;
        double numeroFDouble3 = -1.5E4;
        double numeroFDouble4 = -1.5E10;

        //short numeroLong2 = 92233720368547758079;

        System.out.println("Tipo primitivo: Float");
        System.out.println("numeroFDouble = " + numeroFDouble);
        System.out.println("numeroFDoubl1 = " + numeroFDouble1);
        System.out.println("Double.BYTES tipo float corresponde en byte a  = " + Double.BYTES );
        System.out.println("Double.SIZE tipo float corresponde en bites  = " + Double.SIZE );
        System.out.println("Double.MAX_VALUE valor máximo byte a  = " + Double.MAX_VALUE );
        System.out.println("Double.MAX_VALUE valor mínimo byte a  = " + Double.MIN_VALUE );

        System.out.println("numeroFDouble2 = " + numeroFDouble2);
        System.out.println("numeroFDouble3 = " + numeroFDouble3);
        System.out.println("numeroFDouble4 = " + numeroFDouble4);

        var varDouble = 3342345345.3453455d;
        //var varDouble = 3345d;
        System.out.println("varDouble = " + varDouble);
        System.out.println();
        System.out.println("doubleStatic =  " +doubleStatic);

    }
}
