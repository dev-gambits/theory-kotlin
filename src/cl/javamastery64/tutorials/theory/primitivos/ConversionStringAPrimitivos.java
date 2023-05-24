package cl.javamastery64.tutorials.theory.primitivos;

/**
 * Conversion de tipos
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */
public class ConversionStringAPrimitivos {
    public static void main(String[] args) {
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);

        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43321e-8";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true"; // TRUE or true or True is Equals, Idem False
        boolean losgicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("losgicoBoolean = " + losgicoBoolean);
    }
}
