package servicios;

import entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);
    String palad;
    String letra;
    String[] verificacion = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
     */
    public void crearJuego(Ahorcado a1) {

        System.out.println("Ingrese la palabra a adivinar: ");
        palad = leer.next();
        System.out.println("Ingrese la cantidad de intentos: ");
        a1.setJugadas(leer.nextInt());
        String[] pal2 = new String[palad.length()];

        for (int i = 0; i < palad.length(); i++) {
            pal2[i] = palad.substring(i, i + 1);
        }
        a1.setPalabra(pal2);
        a1.setLetenc(0);
    }

    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
     */
    public void longitud(Ahorcado a1) {
        System.out.println("La palabra que debe encontrar tiene: " + a1.getPalabra().length + " letras. ");
        for (String palabra : a1.getPalabra()) {
            System.out.print(" _ ");
        }
        System.out.println(" ");
    }

    /*
    Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
     */
    public void buscar(Ahorcado a1) {

        if (encontradas(a1)) {
            System.out.println("Su letra esta en la palabra");
        } else {
            System.out.println("Su letra no esta en la palabra");
            a1.setJugadas(a1.getJugadas() - 1);
        }
    }

    /*
    Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
     */
    public boolean encontradas(Ahorcado a1) {
        boolean pertenece = false;
        for (String palabra : a1.getPalabra()) {
            if (palabra.equals(letra)) {
                a1.setLetenc(a1.getLetenc() + 1);
                pertenece = true;
            }
        }

        System.out.println("El numero de letras encontras es de: " + a1.getLetenc() + "/" + a1.getPalabra().length);
        return pertenece;
    }

    /*
    Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
     */
    public void intentos(Ahorcado a1) {
        System.out.println("La cantidad de oportudidades que le quedan es de: " + a1.getJugadas());
    }

    /*
    Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
     */
    public void juego(Ahorcado a1) {
        crearJuego(a1);

        do {
            longitud(a1);
            System.out.println("");
            System.out.println("Ingrese una letra: ");
            letra = leer.next();
            buscar(a1);
            intentos(a1);
            System.out.println("-----------------------------------");

        } while (a1.getJugadas() != 0 && a1.getLetenc() != a1.getPalabra().length);
    }
}
