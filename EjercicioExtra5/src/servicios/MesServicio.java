package servicios;

import entidades.Meses;
import java.util.Random;
import java.util.Scanner;

public class MesServicio {

    Scanner leer = new Scanner(System.in);
    Random r = new Random();
    String adivinar;
    int op = 3;
    int mesec;

    public void adivinar(Meses m1) {

        mesec = ((int) (Math.random() * 12));
        m1.setMesSecreto(m1.getMes()[mesec]);
        System.out.println("Ingrese el nombre de un mes en minusculas");

        do {
            adivinar = leer.next().toLowerCase();
            op--;
            if (adivinar.equals(m1.getMesSecreto())) {
                System.out.println("Usted ha adivinado. Felicidades");
            } else {
                if (op == 0) {
                    System.out.println("Usted ha perdido");
                    break;
                }
                System.out.println("Mes incorrecto. Le quedan: " + op + " intentos.");
            }

        } while (op != 0 && !adivinar.equals(m1.getMesSecreto()));

    }

}
