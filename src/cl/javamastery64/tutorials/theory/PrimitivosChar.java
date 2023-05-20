package cl.javamastery64.tutorials.theory;

/**
 * Declaración de variables PRIMITVOS  char
 * Characters , buscar el mapa de caracteres
 * Estudias UNICODE TABLE
 * @version 1.14 02-03-2016
 * @author Emmanuel Nieto
 */
public class PrimitivosChar {
    public static void main(String[] args) {
        char characterChar = 122;
        char characterChar1 = 121;
        char characterChar2 = 'F';
        char characterChar3 = '\u0040';
        char characterChar4 = 64;


        System.out.println("Tipo primitivo: char");
        System.out.println("characterChar = " + characterChar);
        System.out.println("characterChar1 = " + characterChar1);
        System.out.println("characterChar2 = " + characterChar2);
        System.out.println("characterChar3 = " + characterChar3);
        System.out.println("characterChar4 = " + characterChar4);
        System.out.println("Character.BYTES tipo byte corresponde en byte a  = " + Character.BYTES );
        System.out.println("Character.SIZE tipo byte corresponde en bites  = " + Character.SIZE );
        System.out.println("Character.MAX_VALUE valor máximo byte a  = " + Character.MAX_VALUE );
        System.out.println("Character.MAX_VALUE valor mínimo byte a  = " + Character.MIN_VALUE );

        if (characterChar3 == characterChar4) {
            System.out.println("Son iguales characterChar3 = characterChar3 " );
            System.out.println(characterChar3 == characterChar4);
        }

        char simbolo = '\u0041';
        char simbolo1 = 'A';
        char simbolo2 = 1;

        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo1 = " + simbolo1);
        System.out.println("simbolo2 = " + simbolo2);


        var simboloVar = '\u0041';
        var simboloVar1 = 'A';
        var simboloVar2 = 1;
        System.out.println("simbolo = " + simboloVar);
        System.out.println("simboloVar1 = " + simboloVar1);
        System.out.println("simboloVar2 = " + simboloVar2);

        char espacio = ' ';
        char espacioUnicode = '\u0020';
        System.out.println("espacio = " + espacio + characterChar4);
        System.out.println("espacioUnicode = " + espacioUnicode);

        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        System.out.println("re\btr\toc\nes\to = " + espacio + retroceso);
        System.out.println("retrocesoUnicode="+ simboloVar1 + retroceso+retroceso+retroceso+retroceso+retroceso+retroceso);
        System.out.println("retornoCarro = " + System.getProperty("line.separador") + retornoCarro);
        System.out.println("retornoCarro = " + System.lineSeparator() + retornoCarro);
        System.out.println("System.console() :  "+System.console());


        System.out.println("retornoCarro = " + System.lineSeparator() + retornoCarro);
        System.out.println("System.console() :  "+System.console());

    }
}

