package cl.javamastery64.tutorials.theory;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Declaración de variables PRIMITVOS
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */
public class SistemasNumericosTerminalScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            //numeroDecimal = Integer.parseInt(numeroStr);
            numeroDecimal = scanner.nextInt();
        } catch ( InputMismatchException e) {  // Exception || NumberFormatException  || InputMismatchException
            System.out.println("e.getMessage()  " + e.getMessage());
            System.out.println("Exception");
            System.out.println("Error, debe ingresar un número");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        String resultadoDecimal = "numeroDecimal = binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        int numeroBinario = 0b111110100;
        String resultadoBinario =
                "numeroBinario de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        int numeroOctal = 0764;

        String resultadoHexadecimal = "numeroDecimal Hexadeciaml = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        int numeroHex = 0x1f4;
                String mensaje = resultadoDecimal;
        mensaje += "\n" + resultadoBinario;
        mensaje += "\n" + resultadoHexadecimal;

        System.out.println();
        System.out.println("RESPUESTA TERMINAL");
        System.out.println("mensaje = " + mensaje);
        System.out.println(mensaje);
    }
}
