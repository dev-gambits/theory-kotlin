package cl.javamastery64.tutorials.theory.string;

/**
 * Declaración de variables
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */

public class EjemploStingInmutable {
    public static void main(String[] args) {
        String curso = "Programación en Java";
        String profesor = "Emmanuel Antonio Nieto Muñoz";
        System.out.println("curso = " + curso);
        System.out.println("profesor = " + profesor);

        curso.concat(profesor);
        System.out.println("curso = " + curso);

        String resultado = curso.concat(profesor);
        System.out.println("resultado = " + resultado);

        // <String>
        curso.transform(c -> {
            return c + " con " + profesor;
        });

        System.out.println("curso lambda= " + curso);

        /*
        String detalle = curso + " con el instructor Sr. " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 10;
        int numeroB = 6;
        System.out.println(detalle + numeroA + numeroB);
        System.out.println(detalle + (numeroA + numeroB));

        String detalle2 = null;
        detalle2 = curso.concat("".concat(profesor));
        System.out.println("detalle2 = " + detalle2);

        detalle2 = curso.concat("").concat(profesor);
        System.out.println("detalle2 = " + detalle2);

         */
    }
}
