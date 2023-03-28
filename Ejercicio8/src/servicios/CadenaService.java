package servicios;

import java.util.Scanner;

public class CadenaService {

    Scanner leer = new Scanner(System.in);
    int cont = 0;
    boolean conti = false;

    /*
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que 
tiene la frase ingresada.
     */
    public void mostrarVocales(String voc) {
        for (int i = 0; i < voc.length(); i++) {
            if (voc.substring(i, i + 1).equalsIgnoreCase("a") || voc.substring(i, i + 1).equalsIgnoreCase("e") || voc.substring(i, i + 1).equalsIgnoreCase("i") || voc.substring(i, i + 1).equalsIgnoreCase("o") || voc.substring(i, i + 1).equalsIgnoreCase("u")) {
                cont++;
            }
        }
        System.out.println("Su frase o palabra tiene: " + cont + " vocales.");
    }

    /*
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     */
    public void invertirFrase(String pal) {
        String varpal = "";
        System.out.println("Su frase o palabra es: " + pal);

        for (int i = (pal.length()); i > -1; i--) {
            if (i == pal.length()) {
                varpal = varpal.concat(pal.substring(pal.length(), pal.length()));
            } else {
                varpal = varpal.concat(pal.substring(i, i + 1));
            }
        }
        System.out.println("Su frase invertida es: " + varpal);
    }

    /*
 Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */
    public void vecesRepetido(String pal) {
        String car;
        int cont = 0;
        System.out.println("Ingrese un caracter para buscar en su frase:");
        car = leer.nextLine();

        for (int i = 0; i < pal.length(); i++) {
            if (pal.substring(i, i + 1).equals(car)) {
                cont++;
            }
        }
        System.out.println("Su caracter: '" + car + "' se repite: " + cont + " veces en su frase.");
    }

    /*
d) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
     */
    public void compararLongitud(String pal) {
        System.out.println("Ingrese una nueva frase o palabra");
        String pal2 = leer.nextLine();
        if (pal.length() < pal2.length()) {
            System.out.println("Su primer frase es mas corta que la segunda");
        } else if (pal.length() == pal2.length()) {
            System.out.println("Sus dos frases son iguales");
        } else if (pal.length() < pal2.length()) {
            System.out.println("Su primer frase es mas larga que la segunda");
        }
    }

    /*
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
     */
    public void unirFrases(String pal) {
        System.out.println("Ingrese una nueva frase o palabra");
        String pal2 = leer.nextLine();
        System.out.println("Sus dos frases concatenadas son: " + pal.concat(pal2));
    }

    /*
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
     */
    public void reemplazar(String pal) {
        String car, nuevfras = "";
        System.out.println("Ingrese un caracter para cambiar en su frase. El mismo sera intercambiado por #");
        car = leer.nextLine();

        for (int i = 0; i < pal.length(); i++) {
            if (pal.substring(i, i + 1).equals(car)) {
                nuevfras = nuevfras.concat("#");
            } else {
                nuevfras = nuevfras.concat(pal.substring(i, i + 1));
            }

        }
        System.out.println("Su caracter elegido es: '" + car + "'.\n"
                + "Su frase reemplazada es: " + nuevfras);
    }

    /*
 Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
    public void contiene(String pal) {
        String car;

        System.out.println("Ingrese un caracter para buscar en su frase:");
        car = leer.nextLine();

        for (int i = 0; i < pal.length(); i++) {
            if (pal.substring(i, i + 1).equals(car)) {
                conti = true;
                System.out.println("Su caracter: '" + car + "' se encuentra en la frase.");
                break;
            }
        }
        System.out.println("Su caracter: '" + car + "' no se encuentra en la frase.");

    }

}
