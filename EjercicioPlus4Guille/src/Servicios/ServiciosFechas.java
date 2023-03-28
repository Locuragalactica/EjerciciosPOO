/*
enero31 febrero28 marzo31 abril30 mayo31 junio30 julio31 agosto31 septiembre30 octubre31 noviembre30 diciembre31
 */
package Servicios;

import Entidad.Fechas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author checho
 */
public class ServiciosFechas {

    Scanner leer = new Scanner(System.in);
    Fechas fc = new Fechas();
    ArrayList meses = new ArrayList();
    ArrayList<Integer> dias = new ArrayList();
    int año, mes, dia;

    public void ingreso() {
        lista();
        System.out.println("Ingrese un año de 1900 al 2023: ");
        año = leer.nextInt();
        if (año % 4 == 0) {
            dias.set(1, 29);
        }
        do {

            System.out.println("Ingrese un mes: ");
            mes = leer.nextInt() - 1;
            if (mes > 11) {
                System.out.println("error. ese mes no existe. por favor vuelva a intentar");
            }

        } while (mes > 11);
        do {
            System.out.println("Ingrese un dia : ");
            dia = leer.nextInt();
            if (dias.get(mes) < dia) {
                System.out.println("error ingrese un dia menor a " + dias.get(mes));
            }
        } while (dias.get(mes) < dia);

        verificarAño();
        bisiesto();
        mostrarDia();
    }

    public void verificarAño() {
        fc.setMes(mes);
        fc.setDia(dia);
        if (año >= 1900 && año <= 2023) {
            fc.setAño(año);

        } else {
            System.out.println("El año ingresado esta fuera de rango.");

        }
    }

    public void lista() {
        meses.add("enero");
        meses.add("febrero");
        meses.add("marzo");
        meses.add("abril");
        meses.add("mayo");
        meses.add("junio");
        meses.add("julio");
        meses.add("agosto");
        meses.add("septiembre");
        meses.add("octubre");
        meses.add("noviembre");
        meses.add("diciembre");
        dias.add(31);
        dias.add(28);
        dias.add(31);
        dias.add(30);
        dias.add(31);
        dias.add(30);
        dias.add(31);
        dias.add(31);
        dias.add(30);
        dias.add(31);
        dias.add(30);
        dias.add(31);
    }

    public void bisiesto() {
        if (año % 4 == 0) {
            System.out.println("El año " + fc.getAño() + " es bisiesto");
        } else {
            System.out.println("El año " + fc.getAño() + " no es bisiesto");
        }
    }

    public void mostrarDia() {
        //dia posterior
        int a = fc.getAño();
        int m = fc.getMes();
        int d = fc.getDia() + 1;
        if (d > dias.get(mes)) {
            m += 1;
            d = 1;
        }
        if (m > 11) {
            m = 0;
            a += 1;
        }
        System.out.println("el dia posterior ala fecha ingresada es " + d + "/" + meses.get(m) + "/" + a);
        //dia anterior
        if (fc.getDia() == 1) {
            if (fc.getMes() == 0) {
                fc.setAño(año - 1);
                fc.setMes(11);
                fc.setDia(dias.get(mes));
            } else {
                mes -= 1;
                fc.setMes(mes);
                fc.setDia(dias.get(mes));
            }
        } else {
            fc.setDia(dia - 1);
        }
        System.out.println("un dia anterior ala fecha ingresada seria: " + fc.getDia() + "/" + meses.get(fc.getMes()) + "/" + fc.getAño());
    }
}
