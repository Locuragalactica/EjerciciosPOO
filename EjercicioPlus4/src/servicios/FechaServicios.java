package servicios;

import entidades.Fecha;
import java.util.Scanner;

public class FechaServicios {

    Scanner leer = new Scanner(System.in);

    public void ingresarFecha(Fecha f1) {
        System.out.println("Ingrese el año de su fecha");
        f1.setAnio(leer.nextInt());
        System.out.println("Ingrese el mes de su fecha con numeros");
        f1.setMes(leer.nextInt());
        System.out.println("Ingrese el día de su fecha");
        f1.setDia(leer.nextInt());

    }

    /*
     Verificar que el año ingresado por el usuario este entre 1900 y 2021, caso contrario, el año
tomara el valor por defecto.
     */
    public void verificarFecha(Fecha f1) {
        if (f1.getAnio() < 1900 && f1.getAnio() > 2021) {
            System.out.println("Su año ingresado no quedo establecido");
            f1.setAnio(1900);
            f1.setMes(1);
            f1.setDia(1);
        }
    }

    /*
    Conocer la cantidad de días totales que tiene el mes elegido por el usuario. EJ: USTED
INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
     */
    public void cantidadDias(Fecha f1) {
        switch (f1.getMes()) {
            case 1:
                System.out.println("Usted eligio enero. Su mes tiene 31 dias");
                break;
            case 2:
                System.out.println("Usted eligio febrero. Su mes tiene 28 dias");
                break;
            case 3:
                System.out.println("Usted eligio marzo. Su mes tiene 31 dias");
                break;
            case 4:
                System.out.println("Usted eligio abril. Su mes tiene 30 dias");
                break;
            case 5:
                System.out.println("Usted eligio mayo. Su mes tiene 31 dias");
                break;
            case 6:
                System.out.println("Usted eligio junio. Su mes tiene 30 dias");
                break;
            case 7:
                System.out.println("Usted eligio julio. Su mes tiene 31 dias");
                break;
            case 8:
                System.out.println("Usted eligio agosto. Su mes tiene 31 dias");
                break;
            case 9:
                System.out.println("Usted eligio sepotiembre. Su mes tiene 30 dias");
                break;
            case 10:
                System.out.println("Usted eligio octubre. Su mes tiene 31 dias");
                break;
            case 11:
                System.out.println("Usted eligio noviembre. Su mes tiene 30 dias");
                break;
            case 12:
                System.out.println("Usted eligio diciembre. Su mes tiene 31 dias");
                break;
        }

    }

    /*
        Mostrar día anterior a la fecha ingresada (Hay que considerar que sucede con inicio de
cada mes)
     */
    public void mostrarAnterior(Fecha f1) {
        System.out.println("Su fecha ingresada es: " + f1.getDia() + "/" + f1.getMes() + "/" + f1.getAnio());

        System.out.println("La fecha anterior a su dia es: ");
    }

    /*
     Mostrar día posterior a la fecha ingresada (Hay que considerar que sucede con fin de cada
mes)
     */
    public void mostrarPosterior(Fecha f1) {

    }

    /*
     Crear un método para verificar si el año ingresado es bisiesto
     */
    public void verificarBiciesto(Fecha f1) {

    }
}
