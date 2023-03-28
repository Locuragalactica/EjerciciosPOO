package ejercicio8;

import entidades.Cadena;
import java.util.Scanner;
import servicios.CadenaService;

public class Ejercicio8 {

    public static void main(String[] args) {
        /*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada. ✔
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".✔
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. ✔
d) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario. ✔
e) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante. ✔
f) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.✔
g) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no. ✔
         */

        CadenaService cad = new CadenaService();
        Cadena c1 = new Cadena();

        Scanner leer = new Scanner(System.in);

        String pal, rta2;
        boolean exit = false;
        int rta;
        System.out.println("Ingrese una frase o palabra");
        pal = leer.nextLine();
        c1.setFrase(pal);
        c1.setLonge(pal.length());

        do {
            do {
                System.out.println("Ingrese su opción de menu");
                System.out.println("Menú.\n"
                        + "1- Mostrar Vocales.\n"
                        + "2- Invertir Frase.\n"
                        + "3- Veces Repetido.\n"
                        + "4- Comparar Longitud.\n"
                        + "5- Unir Frase.\n"
                        + "6- Reemplazar Caracter.\n"
                        + "7- Caracter Contenido. \n"
                        + "8- Salir.");

                rta = leer.nextInt();
            } while (rta < 1 || rta > 8);

            if (rta == 8) {

                do {
                    System.out.println("¿Esta seguro que desea salir S/N");
                    rta2 = leer.next();

                    if (rta2.equalsIgnoreCase("S")) {
                        exit = true;
                        break;
                    }
                } while (!rta2.equalsIgnoreCase("S") && !rta2.equalsIgnoreCase("N"));

            }

            switch (rta) {
                case 1:
                    cad.mostrarVocales(pal);
                    break;
                case 2:
                    cad.invertirFrase(pal);
                    break;
                case 3:
                    cad.vecesRepetido(pal);
                    break;
                case 4:
                    cad.compararLongitud(pal);
                    break;
                case 5:
                    cad.unirFrases(pal);
                    break;
                case 6:
                    cad.reemplazar(pal);
                    break;
                case 7:

                    cad.contiene(pal);
                    break;
            }

        } while (exit != true);

    }

}
