package cl.javamastery64.tutorials.theory;

/**
 * Declaración de variables PRIMITVOS  BYTE
 * Entero mas pequeño que esxiste. Rango  -128 y 127
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */
public class PrimitivosByte {
    public static void main(String[] args) {
        byte numeroByte = 12;
        byte numeroByte1 = 121;

        System.out.println("Tipo primitivo: Byte");
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("numeroByte1 = " + numeroByte1);
        System.out.println("Byte.BYTES tipo byte corresponde en byte a  = " + Byte.BYTES );
        System.out.println("Byte.SIZE tipo byte corresponde en bites  = " + Byte.SIZE );
        System.out.println("Byte.MAX_VALUE valor máximo byte a  = " + Byte.MAX_VALUE );
        System.out.println("Byte.MAX_VALUE valor mínimo byte a  = " + Byte.MIN_VALUE );
        System.out.println("numeroByte1 = " + Byte.toUnsignedInt(numeroByte1));
        System.out.println("Byte.compare(numeroByte, numeroByte1):  "+Byte.compare(numeroByte, numeroByte1));

        String byteStr = Byte.toString(numeroByte);
        System.out.println("Byte.toString(numeroByte):  "+Byte.toString(numeroByte));
        System.out.println("byteStr = " + byteStr);

        int byteInt = Byte.decode(byteStr);
        System.out.println("byteInt = " + byteInt);

    }
}
