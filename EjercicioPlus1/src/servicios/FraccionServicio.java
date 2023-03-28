package servicios;

import entidades.Fraccion;
import java.util.Scanner;

public class FraccionServicio {

    int mcm, v1, v2, v3;
    Scanner leer = new Scanner(System.in);

    public void ingresoFracciones(Fraccion f1) {
        System.out.println("Ingrese los valores de la primera fraccion");
        System.out.println("Numerador 1 ");
        f1.setNumerador1(leer.nextInt());
        System.out.println("Denominador 1");
        f1.setDenominador1(leer.nextInt());
        System.out.println("Numerador 2 ");
        f1.setNumerador2(leer.nextInt());
        System.out.println("Denominador 2");
        f1.setDenominador2(leer.nextInt());

        System.out.println("Su primera fraccion es: " + f1.getNumerador1() + "/" + f1.getDenominador1());
        System.out.println("Su segunda fraccion es: " + f1.getNumerador2() + "/" + f1.getDenominador2());
    }

    public void sumar(Fraccion f1) {
        mcm = f1.getDenominador1() * f1.getDenominador2();
        v1 = (mcm / f1.getDenominador1()) * f1.getNumerador1();
        v2 = (mcm / f1.getDenominador2()) * f1.getNumerador2();
        v3 = v1 + v2;
        System.out.println("El resultado de la suma de sus fracciones es de: " + v3 + "/" + mcm);
        simplificador(f1);
        System.out.println("El resultado de la suma de sus simplificada es de: " + v3 + "/" + mcm);
    }

    public void restar(Fraccion f1) {
        mcm = f1.getDenominador1() * f1.getDenominador2();
        v1 = (mcm / f1.getDenominador1()) * f1.getNumerador1();
        v2 = (mcm / f1.getDenominador2()) * f1.getNumerador2();
        v3 = v1 - v2;
        System.out.println("El resultado de la resta de sus fracciones es de: " + v3 + "/" + mcm);
        simplificador(f1);
        System.out.println("El resultado de la resta simplificada es de: " + v3 + "/" + mcm);
    }

    public void multiplicar(Fraccion f1) {

        v3 = f1.getNumerador1() * f1.getNumerador2();
        mcm = f1.getDenominador1() * f1.getDenominador2();
        System.out.println("El resultado de la multiplicacion de sus fracciones es de: " + v3 + "/" + mcm);
        simplificador(f1);
        System.out.println("El resultado de la multiplicacion simplificada es de: " + v3 + "/" + mcm);

    }

    public void dividir(Fraccion f1) {
        v3 = f1.getNumerador1() * f1.getDenominador2();
        mcm = f1.getDenominador1() * f1.getNumerador2();
        System.out.println("El resultado de la division de sus fracciones es de: " + v3 + "/" + mcm);
        simplificador(f1);
        System.out.println("El resultado de la divison simplificada es de: " + v3 + "/" + mcm);

    }

    public void simplificador(Fraccion f1) {
        do {
            if (v3 % mcm == 0) {
                v3 /= mcm;
                mcm /= mcm;
            } else if (v3 % 2 == 0 && mcm % 2 == 0) {
                v3 /= 2;
                mcm /= 2;
            } else if (v3 % 3 == 0 && mcm % 3 == 0) {
                v3 /= 3;
                mcm /= 3;
            } else if (v3 % 5 == 0 && mcm % 5 == 0) {
                v3 /= 5;
                mcm /= 5;
            } else if (v3 % 7 == 0 && mcm % 7 == 0) {
                v3 /= 7;
                mcm /= 57;
            } else if (v3 % 11 == 0 && mcm % 11 == 0) {
                v3 /= 11;
                mcm /= 11;
            }
        } while (v3 % 2 == 0 && mcm % 2 == 0 || v3 % 3 == 0 && mcm % 3 == 0 || v3 % 11 == 0 && mcm % 11 == 0);

    }

}
