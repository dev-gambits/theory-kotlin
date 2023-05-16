package cl.javamastery64.tutorials.theory;

/**
 * Conversion de tipos  de Primitivos a String
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */
public class ConversionPrimitivosAString {
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

        String numeroOtroStr = Integer.toString(numeroInt);
        System.out.println("numeroOtroStr Integer.toString(numeroInt) = " + numeroOtroStr);

        numeroOtroStr = String.valueOf(numeroInt);
        System.out.println("numeroOtroStr String.valueOf(numeroInt) = " + numeroOtroStr);
        numeroOtroStr = String.valueOf(numeroInt+10);
        System.out.println("numeroOtroStr String.valueOf(numeroInt) = " + numeroOtroStr);
        numeroOtroStr = String.valueOf(numeroOtroStr+10);
        System.out.println("numeroOtroStr String.valueOf(numeroInt) = " + numeroOtroStr); // Concatena


        double otroRealDouble = 123456.7674;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);


        otroRealStr =String.valueOf(otroRealDouble);
        otroRealStr =String.valueOf(1.234584);
        System.out.println("otroRealStr = " + otroRealStr);

        // boolean


    }
}
