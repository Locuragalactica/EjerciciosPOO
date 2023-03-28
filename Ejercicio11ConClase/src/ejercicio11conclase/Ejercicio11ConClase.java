package ejercicio11conclase;

import entidades.Fecha;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio11ConClase {

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
        Fecha d1 = new Fecha();

        System.out.println("Ingrese un dia");
        d1.setDia(leer.nextInt());
        System.out.println("Ingrese un mes");
        d1.setMes(leer.nextInt() - 1);
        System.out.println("Ingrese un año");
        d1.setAnio(leer.nextInt() - 1900);
        Date d2 = new Date(d1.getAnio(), d1.getMes(), d1.getDia());
        Date hoy = new Date();

        System.out.println("Su fecha ingresada es: " + d2);

        System.out.println("La fecha actual es: " + hoy);

        System.out.println("La diferencia de años entre la fecha de hoy y la ingresada es de: " + (hoy.getYear() - d1.getAnio()));

    }

}
