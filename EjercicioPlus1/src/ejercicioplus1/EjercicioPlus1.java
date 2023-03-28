package ejercicioplus1;

import entidades.Fraccion;
import java.util.Scanner;
import servicios.FraccionServicio;

public class EjercicioPlus1 {

    public static void main(String[] args) {

        /*
        
        Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
         */
        Fraccion f1 = new Fraccion();

        FraccionServicio fs = new FraccionServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int rta;
        String rta2 = "";

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

        do {
            System.out.println("Menu de Cuenta");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Ingresar Nuevas Fracciones");
            System.out.println("6- Salir");
            rta = leer.nextInt();
            if (rta == 6) {
                System.out.println("¿Esta seguro que desea salir? S/N");
                rta2 = leer.next();
                if (rta2.equals("s")) {
                    break;
                }
            }
            switch (rta) {
                case 1:
                    fs.sumar(f1);
                    rta = 6;
                    break;
                case 2:
                    fs.restar(f1);
                    rta = 6;
                    break;
                case 3:
                    fs.multiplicar(f1);
                    rta = 6;
                    break;
                case 4:
                    fs.dividir(f1);
                    rta = 6;
                    break;
                case 5:
                    fs.ingresoFracciones(f1);
                    rta = 6;
                    break;
            }

        } while (rta > 5 || rta < 1 || !rta2.equals("s"));

    }

}
