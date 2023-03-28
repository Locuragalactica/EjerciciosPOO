package ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        /*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
         */
        Scanner leer = new Scanner(System.in);
        int anio, anio2, mes, dia;
        System.out.println("Ingrese un numero de año: ");
        anio = leer.nextInt() - (1900);
        System.out.println("Ingrese un numero de mes: ");
        mes = leer.nextInt() - 1;
        System.out.println("Ingrese un numero de dia: ");
        dia = leer.nextInt();

        Date fecha = new Date(anio, mes, dia);
        Date fechaActual = new Date();

        System.out.println("La fecha que usted ingreso es: " + fecha);

        System.out.println("La fecha actual es: " + fechaActual);

        anio2 = fechaActual.getYear();

        if (anio < anio2) {

            System.out.println("La fecha actual es: " + (anio2 - anio) + " años posterior a la fecha introducida");

        } else {
            System.out.println("La fecha intrudicida es: " + (anio - anio2) + " años posterior a la fecha actual");
        }
    }
}
