package cl.javamastery64.tutorials.theory;

/**
 * Declaración de variables PRIMITVOS  boolean
 * TRUE or FALSE
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */
public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean booleanBooleano = false;
        boolean booleanBooleano1 = true;

        System.out.println("Tipo primitivo: boolean");
        System.out.println("booleanBooleano = " + booleanBooleano);
        System.out.println("booleanBooleano1 = " + booleanBooleano1);
        System.out.println("Boolean.FALSE.booleanValue()  = " + Boolean.FALSE.booleanValue() );
        System.out.println("Boolean.TRUE.booleanValue()  = " + Boolean.TRUE.booleanValue() );
        System.out.println("Boolean.getBoolean(\"HOLA\"))  = " + Boolean.getBoolean("HOLA") );

        double d = 98765.43e-3;
        System.out.println("d = " + d);
        float f = 1.2345e2f;
        System.out.println("f = " + f);
        booleanBooleano1 = d == f;
        System.out.println("booleanBooleano1 = " + booleanBooleano1);


    }
}
