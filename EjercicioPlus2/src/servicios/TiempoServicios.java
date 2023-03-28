package servicios;

import java.util.Scanner;
import entidades.Tiempo;

public class TiempoServicios {

    Scanner leer = new Scanner(System.in);
    int hs, min, seg;
    String rta;
    int[] time;

    public void ingresarHora(Tiempo t1) {

        do {
            System.out.println("Ingrese los segundos:  ");
            t1.setSeg(leer.nextInt());
            System.out.println("Ingrese los minutos:  ");
            t1.setMin(leer.nextInt());
            System.out.println("Ingrese las horas:  ");
            t1.setHs(leer.nextInt());
            seg = t1.getSeg();
            min = t1.getMin();
            hs = t1.getHs();
            int[] time = {t1.getHs(), t1.getMin(), t1.getSeg()};

        } while (seg > 60 || seg < 00 || min > 60 || min < 00 || hs > 24 || hs < 00);
    }

    public void imprimirHora(Tiempo t1) {
        System.out.println("Su hora ingresada es: " + t1.getHs() + ":" + t1.getMin() + ":" + t1.getSeg());
    }

    public void pasoTiempo(Tiempo t1) {
        System.out.println("Desea ver el avance de su hora hasta las 00:00");
        System.out.println("S/N");
        do {
            rta = leer.next().toLowerCase();
            if (rta.equals("n")) {
                break;
            } else if (rta.equals("s")) {
                imprimirHora(t1);
                System.out.println("La hora avanzara hasta las 23:59:59");

                for (int i = hs; i < 23; i++) {
                    hs += 1;

                    if (min == 59) {
                        min = -1;
                    }
                    for (int j = min; j < 59; j++) {
                        min += 1;
                        if (seg == 59) {
                            seg = -1;
                        }
                        for (int k = seg; k < 59; k++) {
                            seg += 1;
                            System.out.print(hs + ":" + min + ":" + seg);
                            System.out.println(" ");
                        }

                    }
                }

            }
        } while ((!rta.equals("s")) && (!rta.equals("n")));

    }

}
