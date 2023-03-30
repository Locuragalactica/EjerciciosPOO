package ejercicioespecial3;

import java.util.Scanner;

public class EjercicioEspecial3 {

    public static void main(String[] args) {
        /*
        Programa para codificar o decodificar un texto utilizando el método de cifrado de César. Supondremos que el texto solo contiene letras mayúsculas o minúsculas. La letras serán las correspondientes al alfabeto inglés (26 caracteres, excluimos la ñ y Ñ).
En este método de cifrado cada letra del texto se sustituye por otra letra que se encuentra N posiciones adelante en el alfabeto. Se considera que el alfabeto es circular, es decir, la letra siguiente a la ‘z’ es la ‘a’.
Por ejemplo, si N es 3, la ‘a’ se transformaría en ‘d’, la ‘b’ en ‘e’, la ‘c’ en ‘f’, etc.
Ejemplo de cifrado César: si el texto es “casa” y N = 3 el texto cifrado es “fdvd”

Para descifrar un texto se realiza la operación contraria. Se calcula la letra que está N posiciones por detrás en el alfabeto. Como el alfabeto es circular, la letra anterior a la ‘a’ es la ‘z’.

El programa pedirá por teclado un texto, a continuación el valor de N y si queremos codificar o decodificar el texto. Finalmente se mostrará el texto resultante.
         */
        Scanner leer = new Scanner(System.in);
        String palabra;
        String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        System.out.println("Ingrese una frase a codificar");
        palabra = leer.next();
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        int rta;
        String rta2 = "";

        do {
            System.out.println("Menu");
            System.out.println("1- Ingresar Palabra ");
            System.out.println("2- Codificar ");
            System.out.println("3- Decodificar");
            System.out.println("4- Salir");

            rta = leer.nextInt();
            if (rta == 4) {
                System.out.println("¿Esta seguro que desea salir? S/N");
                rta2 = leer.next();
                if (rta2.equals("s")) {
                    break;
                }
            }

            switch (rta) {
                case 1:
                    System.out.println("Ingrese una frase a codificar");
                    palabra = leer.next();
                    System.out.println("Ingrese un numero: ");
                    num = leer.nextInt();
                    rta = 5;
                    break;
                case 2:
                    codificar(palabra, num, abc);
                    rta = 5;
                    break;
                case 3:
                    deCodificar(palabra, num, abc);
                    rta = 5;
                    break;
            }

        } while (rta > 4 || rta < 1 || !rta2.equals("s"));

    }

    public static void codificar(String palabra, int num, String[] abc) {
        String pn, pn1 = "";
        for (int i = 0; i < palabra.length(); i++) {
            pn = palabra.substring(i, i + 1);

            for (int j = 0; j < abc.length; j++) {
                if (pn.equalsIgnoreCase(abc[j])) {
                    if ((j + num) > 26) {
                        pn1 = pn1.concat(abc[(j + num) - 26]);
                    } else {
                        pn1 = pn1.concat(abc[(j + num)]);
                    }
                }
            }
        }
        System.out.println(pn1);

    }

    public static void deCodificar(String palabra, int num, String[] abc) {
        String pn, pn1 = "";
        for (int i = 0; i < palabra.length(); i++) {
            pn = palabra.substring(i, i + 1);

            for (int j = 0; j < abc.length; j++) {
                if (pn.equalsIgnoreCase(abc[j])) {
                    if ((j - num) < 0) {
                        pn1 = pn1.concat(abc[(j - num) + 26]);
                    } else {
                        pn1 = pn1.concat(abc[(j - num)]);
                    }
                }
            }
        }
        System.out.println(pn1);

    }

}
