package Servicio;

import Entidad.SopaLetra;
import java.util.Arrays;
import java.util.Scanner;

public class SopaLetraServicio {

    Scanner leer = new Scanner(System.in);
    //Creo el objeto
    SopaLetra s1 = new SopaLetra();
    String[] palabraEstablecida = {"paleta", "perro", "salon", "jugar", "playa", "fogones", "gusto", "pollo", "pantera", "jaula"};
    String[] halladas = new String[10];
    String aleatorias = "askhysfjkdlsifuyfndklsaskhysfjkdlsifuyfndklsaskhysaskhysfjkdlsifuyfndklsaskhysfjkdlsifuyfndklsaskhys";
    String palabra;
    int contL = 0;
    int posc;
    int contP = 0;
    String rta;
    String opc;

    public void llenarSopaLetra(SopaLetra s1) {
        for (int i = 0; i < 10; i++) {
            posc = (int) (Math.random() * (10 - palabraEstablecida[i].length()));
            contL = 0;
            for (int j = posc; j < posc + palabraEstablecida[i].length(); j++) {
                s1.getSopa()[i][j] = palabraEstablecida[i].substring(contL, contL + 1);
                contL++;
            }
            for (int k = 0; k < 10; k++) {
                if (s1.getSopa()[i][k] == null) {
                    s1.getSopa()[i][k] = aleatorias.substring(contP, contP + 1);
                    contP++;
                }
            }
        }
        contP = 0;
        Arrays.fill(halladas, (String) "vacio");
    }

    public void mostrarMatriz(SopaLetra s1) {
        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 9; j++) {
                System.out.print(s1.getSopa()[i][j] + " ");
            }
            System.out.println(s1.getSopa()[i][j] + " ");
        }
    }

    public boolean ingresarPalabra(SopaLetra s1) {
        boolean nunca = true;
        System.out.print("Ingrese una palabra que este en la sopa de letra: ");
        palabra = leer.next();
        while(verificar(s1, palabra)) {
            System.out.print("La palabra ya fue encontrada.");
            System.out.print("Ingrese una palabra que este en la sopa de letra: ");
            palabra = leer.next();
        }
        s1.setPalabra(palabra);
        for (int k = 0; k < 10; k++) {
            if (s1.getPalabra().equals(palabraEstablecida[k])) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < palabra.length(); j++) {
                        if (s1.getPalabra().substring(0, 1).equalsIgnoreCase(s1.getSopa()[i][j])) {
                            int x = i;
                            int y = j;
                            if (verificarPalabra(s1, x, y)) {
                                if (rta.equalsIgnoreCase("A")) {
                                    contP++;
                                    System.out.println("La palabra se encuentra en la posición (" + x + "," + y + "). Encontradas:(" + contP + "/10)");
                                    nunca = false;
                                    halladas[i] = palabra;
                                    break;
                                } else if (opc.equalsIgnoreCase("A")) {
                                    reemplazar(s1, x, y);
                                    nunca = false;
                                }
                            }
                        }

                    }
                }
                break;
            }

        }
        return nunca;
    }

    public boolean verificar(SopaLetra s1, String palabra) {
        boolean repetida = false;
        for (int i = 0; i < s1.getSopa().length; i++) {
            if (halladas[i].equals(palabra)) {
                repetida = true;
            }
        }
        return repetida;
    }

    public boolean verificarPalabra(SopaLetra s1, int x, int y) {
        boolean esta = true;
        for (int i = 0; i < palabra.length(); i++) {
            if (!s1.getPalabra().substring(i, i + 1).equalsIgnoreCase(s1.getSopa()[x][y + i])) {
                esta = false;
                break;
            }
        }
        return esta;
    }

    public void reemplazar(SopaLetra s1, int x, int y) {
        System.out.print("Ingrese la palabra que usará para reemplazar (" + palabra + "): ");
        String reemplazo = leer.next();
        palabraEstablecida[x]= reemplazo;
        for (int i = 0; i < reemplazo.length(); i++) {
            s1.getSopa()[x][y + i] = reemplazo.substring(i, i + 1);
        }
    }

    public void matrizTraspuesta(SopaLetra s1) {
        String[][] Mt = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Mt[i][j] = s1.getSopa()[j][i];
            }
        }
        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 9; j++) {
                System.out.print(Mt[i][j] + " ");
            }
            System.out.println(Mt[i][j] + " ");
        }
    }

    public void menu() {
        int contPalabra = 0;
        llenarSopaLetra(s1);
        do {
            System.out.println("A) JUGAR A LA SOPA DE LETRA"
                    + "\nB) VER OPCIONES DE SOPA DE LETRA"
                    + "\nC) SALIR");
            rta = leer.next();
            switch(rta.toUpperCase()){
                case "A":
                    mostrarMatriz(s1);
                    do {
                        opc = "F";
                        if (ingresarPalabra(s1)) {
                            System.out.println("Lo siento la palabra no se encuentra en la sopa de letra");
                        } else {
                            contPalabra++;
                        }
                    } while (contPalabra != 10);
                    System.out.println("---------------------------------");
                    System.out.println("FELICIDADES GANASTE!");
                    System.out.println("---------------------------------");
                    break;
                case "B" :
                    do {
                        System.out.println("\nA) Ingrese una palabra contenida en la matriz y la reemplaza"
                                + "\nB) Muestre la matriz traspuesta"
                                + "\nC) Muestre la matriz"
                                + "\nD) Salir");
                        opc = leer.next();
                        switch (opc.toUpperCase()) {
                            case "A":
                                mostrarMatriz(s1);                                
                                ingresarPalabra(s1);
                                break;
                            case "B":
                                matrizTraspuesta(s1);
                                break;
                            case "C":
                                mostrarMatriz(s1);
                                break;
                            case "D":
                                System.out.println("volviendo a menu principal");
                        }
                    } while (!opc.equalsIgnoreCase("D"));
                    break;
                case "C":
                    System.out.println("Gracias por jugar, hasta la próxima");
            }
        }while(!rta.equalsIgnoreCase("C") && contPalabra!=10);
    }
}
