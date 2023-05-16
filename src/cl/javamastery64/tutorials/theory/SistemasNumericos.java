package cl.javamastery64.tutorials.theory;

/**
 * Sistemas numericos
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */
public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numeroDecimal = binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("numeroBinario = " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);


        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println("numeroDecimal Hexadeciaml = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);




    }
}
