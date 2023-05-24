package cl.javamastery64.tutorials.theory.primitivos;

import javax.swing.*;

/**
 * Declaración de variables PRIMITVOS
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */
public class SistemasNumericosJOptionPane {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero:");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch ( NumberFormatException e) {
            System.out.println("e.getMessage(); = " + e.getMessage());
            System.out.println("Exception");
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        String resultadoDecimal = "numeroDecimal = binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoDecimal);

        int numeroBinario = 0b111110100;
        String resultadoBinario =
                "numeroBinario de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println(resultadoBinario);

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHexadecimal = "numeroDecimal Hexadeciaml = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println(resultadoHexadecimal);

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoDecimal;
        mensaje += "\n" + resultadoBinario;
        mensaje += "\n" + resultadoHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
