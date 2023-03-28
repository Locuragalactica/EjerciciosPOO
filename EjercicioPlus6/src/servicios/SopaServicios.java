package servicios;

import entidades.Sopa;
import java.util.Arrays;
import java.util.Scanner;

public class SopaServicios {

    boolean enc;
    int contal = 0;
    Scanner leer = new Scanner(System.in);
    String[] pps = {"perro", "bolsa", "nafta", "raton", "vuelo", "libro", "noche", "placa", "primo", "banjo", "limon", "torre", "guiro", "silla", "vodka", "panza", "rombo", "lapiz", "ronda", "raula"};

    int h = -1, l = 0;
    int cont = 0;
    String palr;

    public void palabrasPreestablecidas(Sopa s1) {
        for (int i = 0; i < 10; i++) {
            h++;
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    h++;
                }
                s1.getSopal()[i][j] = pps[h].substring(l, l + 1);
                l++;
                if (l == 5) {
                    l = 0;
                }
            }
        }

    }

    public void ingresarPalabra(Sopa s1) {
        do {
            System.out.println("Ingrese una palabra de 5 letras para buscar en la sopa de letras: ");
            s1.setPalabra(leer.next());
        } while (s1.getPalabra().length() != 5);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j += 5) {
                if (s1.getPalabra().substring(0, 1).equalsIgnoreCase(s1.getSopal()[i][j])) {
                    cont = 0;

                    for (int k = 0; k < 5; k++) {
                        if (s1.getPalabra().substring(k, k + 1).equalsIgnoreCase(s1.getSopal()[i][j + k])) {
                            cont++;
                            if (cont == 5) {
                                System.out.println("Su palabra se encuentra en la sopa de letras, su ubicación principal es: " + i + "." + j);
                                enc = true;
                                contal++;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (!enc) {
            System.out.println("Su palabra no se encuentra en la sopa de letras.");
        }

    }

    public void imprimirSopa(Sopa s1) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + s1.getSopal()[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void reemplazarPalabra(Sopa s1) {
        String[] pps2 = new String[20];
        do {
            System.out.println("Ingrese una palabra de la sopa de letras a cambiar : ");
            s1.setPalabra(leer.next());
        } while (s1.getPalabra().length() != 5);

        do {
            System.out.println("Ingrese la nueva palabra a cambiar: ");
            palr = leer.next();
        } while (palr.length() != 5);

        for (int i = 0; i < pps2.length; i++) {
            if (pps[i].equals(s1.getPalabra())) {
                pps2[i] = palr;
            } else {
                pps2[i] = pps[i];
            }
        }
        palabrasCambiadas(s1, pps2);
    }

    public void palabrasCambiadas(Sopa s1, String[] pps2) {
        h = -1;
        for (int i = 0; i < 10; i++) {
            h++;
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    h++;
                }
                s1.getSopal()[i][j] = pps2[h].substring(l, l + 1);
                l++;
                if (l == 5) {
                    l = 0;
                }
            }
        }

    }

    public void imprimirSopaInvertida(Sopa s1) {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.print(" " + s1.getSopal()[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
