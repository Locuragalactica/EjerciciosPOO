package Servicio;

import Entidad.Fecha;
import java.util.Scanner;

public class FechaServicio {

    int anioU, mesU, diaU;
    Scanner leer = new Scanner(System.in);
    boolean invalida = true;

    public void ingresarFecha(Fecha f1) {
        do {
            System.out.print("Ingrese dia(DD): ");
            diaU = leer.nextInt();
            System.out.print("Ingrese mes(MM) : ");
            f1.setMes(leer.nextInt());
            System.out.print("Ingrese año (AAAA): ");
            anioU = leer.nextInt();
            if (fechaValida(f1) == false) {
                System.out.println("Fecha inválida, ingrese una nueva fecha.");
                f1.setMes(1);
            } else {
                f1.setDia(diaU);
            }
        } while (!fechaValida(f1));
    }

    public boolean fechaValida(Fecha f1) {
        if (diaU <= 0 || diaU > 31) {
            invalida = false;
        } else if (f1.getMes() == 2 && diaU > 29) {
            invalida = false;
        } else if (diaU >= 29 && bisciesto(f1) == false && f1.getMes() == 2) {
            invalida = false;
        } else if (verificarMes(f1).equals(" 30 dias.") && diaU > 30) {
            invalida = false;
        }
        return invalida;
    }

    public void verificarAnio(Fecha f1, int anioU) {
        if (anioU <= 2021 && anioU >= 1900) {
            f1.setAnio(anioU);
        } else {
            f1.setAnio(1900);
        }
    }

    public String verificarMes(Fecha f1) {
        String rtaMes = "";        
        switch (f1.getMes()) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                rtaMes = " 31 dias.";
                break;
            case 2:
                if (bisciesto(f1)) {
                    rtaMes = " 29 dias.";
                } else {
                    rtaMes = " 28 dias.";
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                rtaMes = " 30 dias.";
                break;            
        }
        return rtaMes;
    }

    public boolean bisciesto(Fecha f1) {
        boolean bisciesto = false;
        if (f1.getAnio() % 100 == 0) {
            if (f1.getAnio() % 400 == 0) {
                bisciesto = true;
            }
        } else if (f1.getAnio() % 4 == 0) {
            bisciesto = true;
        }
        return bisciesto;
    }

    public void diaAnterior(Fecha f1) {
        if (f1.getDia() > 1 && f1.getDia() <= 31) {
            diaU = (f1.getDia() - 1);
            mesU = f1.getMes();
            anioU = f1.getAnio();
        } else if (verificarMes(f1).equals(" 31 dias.")) {
            switch (f1.getMes()) {
                case 1:
                    diaU = 31;
                    mesU = 12;
                    anioU = f1.getAnio() - 1;
                    break;
                case 3:
                    if (bisciesto(f1)) {
                        diaU = 29;
                    } else {
                        diaU = 28;
                    }
                    mesU = 2;
                    anioU = f1.getAnio();
                    break;
                case 8:
                    diaU = 31;
                    mesU = 7;
                    anioU = f1.getAnio();
                    break;
                default:                    
                    diaU = 30;
                    mesU = f1.getMes() - 1;
                    anioU = f1.getAnio();
            }
        } else {
            diaU = 31;
            mesU = f1.getMes() - 1;
            anioU = f1.getAnio();
        }
        System.out.println("El día anterior es: " + diaU + "/" + mesU + "/" + anioU);
    }

    public void diaPosterior(Fecha f1) {
        if ((f1.getDia() >= 1 && f1.getDia() < 30 && f1.getMes() != 2) || (verificarMes(f1).equals(" 31 dias.") && f1.getDia() == 30)) {
            diaU = (f1.getDia() + 1);
            mesU = f1.getMes();
            anioU = f1.getAnio();
        } else if (f1.getDia() == 31 && f1.getMes() == 12) {
            diaU = 1;
            mesU = 1;
            anioU = f1.getAnio() + 1;
        } else {
            diaU = 1;
            mesU = f1.getMes() + 1;
            anioU = f1.getAnio();
        }
        System.out.println("El día posterior es: " + diaU + "/" + mesU + "/" + anioU);
    }

    public void menu(Fecha f1) {
        String opc;
        do {
            ingresarFecha(f1);
            verificarAnio(f1, anioU);
            System.out.println("El mes ingresado tiene " + verificarMes(f1));
            diaAnterior(f1);
            diaPosterior(f1);
            if (bisciesto(f1)) {
                System.out.println("El año es bisciesto.");
            } else {
                System.out.println("El año no es bisciesto.");
            }
            System.out.println("Desea ingresar una nueva fecha para analizar(S) ? ");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("S"));
    }
}
