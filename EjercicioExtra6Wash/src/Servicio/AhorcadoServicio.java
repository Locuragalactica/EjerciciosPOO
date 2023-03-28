package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado ah = new Ahorcado();
    char[][] ABCGeneral = new char[26][2];
    char[] secret;
    public Ahorcado crearJuego() {
        char[] ABC = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for(int i = 0;i<ABC.length;i++){
            ABCGeneral[i][0] = ABC[i];
            ABCGeneral[i][1] = '0';
        }
       
        System.out.print("Ingrese la palabra a buscar: ");
        ah.setPalabra(leer.next().toUpperCase());
        secret = new char[ah.getPalabra().length];
        for(int i=0; i<ah.getPalabra().length; i++){
            secret[i] = '_';
        }
        System.out.print("Ingrese la cantidad máxima de intentos: ");
        ah.setMaxIntentos(leer.nextInt());
        ah.setEncontradas(0);
        System.out.println("Juego creado exitosamente!");
        return ah;
    }

    public void longitud() {
        System.out.println("La longitud de la palabra a buscar es: " + ah.getPalabra().length);
    }
    boolean state1;
    boolean state2;
    public boolean buscar(char letra) {
        boolean encontrado = false;
        state1 = false;
        state2 = false;
        for (int j = 0; j < ah.getPalabra().length; j++) {
            if (ah.getPalabra()[j] == letra) {
                state1 = true;  //Letra este dentro de la palabra
            }
        }
        for (int i = 0; i < 26; i++) {
            if (letra == ABCGeneral[i][0] && '0' == ABCGeneral[i][1]) {
                ABCGeneral[i][1] = '1';
                state2 = true; //No se haya vuelto a ingresar
                break;
            }
        }
        if (state1 && state2) {
            for (int i = 0; i < ah.getPalabra().length; i++) {
                if (ah.getPalabra()[i] == letra) {
                    encontrado = true;
                    ah.setEncontradas(ah.getEncontradas() + 1);
                    secret[i] = letra;
                }
            }
        }
        if ((!encontrado && state2) || (!state1 && !encontrado)){
            ah.setMaxIntentos(ah.getMaxIntentos() - 1);
        }

        return encontrado;
        
    }

    public void encontradas(char letra) {
        int faltantes = ah.getPalabra().length - ah.getEncontradas();
        System.out.println("Número de letras (encontradas, faltantes): (" + ah.getEncontradas() + "," + faltantes + ")");
        intentos();
    }

    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + ah.getMaxIntentos());
    }

    public void juego() {
        System.out.println("¡Bienvenido al juego del Ahorcado!");
        System.out.println("----------------------------------");

        crearJuego();
        boolean terminado = false;

        while (!terminado) {
            System.out.print("Ingrese una letra: ");
            String letraIngresada = leer.next().toUpperCase();

            if (letraIngresada.length() != 1) {
                System.out.println("Debe ingresar una sola letra.");
                continue;
            }

            boolean letraEncontrada = buscar(letraIngresada.charAt(0));
            for (int i = 0; i < ah.getPalabra().length; i++) {
                if(i==ah.getPalabra().length-1){
                    System.out.print(secret[i]);
                }else{
                    System.out.print(" "+secret[i]+" ");
                }
            }
            System.out.println("");
            if (state2 == true) {
                if (!letraEncontrada) {
                    System.out.println("Mensaje: La letra no pertenece a la palabra.");
                    encontradas(letraIngresada.charAt(0));
                    if (ah.getMaxIntentos() == 0) {
                        System.out.println("Mensaje: Lo sentimos, no hay más oportunidades.");
                        System.out.println("La palabra era: " + Arrays.toString(ah.getPalabra()));
                        terminado = true;
                    }
                } else {
                    System.out.println("Mensaje: La letra pertenece a la palabra.");
                    encontradas(letraIngresada.charAt(0));
                    if (ah.getEncontradas() == ah.getPalabra().length) {
                        System.out.println("¡Felicidades, has ganado!");
                        terminado = true;
                    }
                }

            } else {
                System.out.println("Esta letra ya fue validada.");
                encontradas(letraIngresada.charAt(0));
                if (ah.getMaxIntentos() == 0) {
                    System.out.println("Mensaje: Lo sentimos, no hay más oportunidades.");
                    System.out.println("La palabra era: " + Arrays.toString(ah.getPalabra()));
                    terminado = true;
                }
            }
        }
    }
}
