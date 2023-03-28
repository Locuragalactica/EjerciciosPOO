package servicios;

import entidades.Auto;
import java.util.Date;
import java.util.Scanner;

public class AutoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int dia, mes, anio;
    Date hoy = new Date();

    public void cargarFicha(Auto a1) {

        System.out.println("Ingrese el nombre del dueño del auto");
        a1.setDueño(leer.next());
        do {
            System.out.println("Ingrese el dia de vencimiento del carnet");
            dia = leer.nextInt();
        } while (dia > 31 || dia < 1);

        do {
            System.out.println("Ingrese el mes de vencimiento del carnet");
            mes = (leer.nextInt() - 1);
        } while (mes > 12 || mes < 1);

        System.out.println("Ingrese el año de vencimiento del carnet");
        anio = (leer.nextInt() - 1900);

        Date fecha = new Date(anio, mes, dia);
        a1.setFechavenc(fecha);
        if (a1.getFechavenc().before(hoy)) {
            System.out.println("Su carnet esta vencido, Renuevelo");
        } else {
            System.out.println("Su carnet aun esta vigente");
        }

        System.out.println("Ingrese el color del vehiculo");
        a1.setColorauto(leer.next());
        System.out.println("Ingrese el modelo del auto");
        a1.setColorauto(leer.next());
        System.out.println("Ingrese los kilometros del motor");
        a1.setKM(leer.nextInt());
        System.out.println("Ingrese la cantidad de Services que le realizo");
        a1.setCantServ(leer.nextInt());

    }

    public void mostrarFicha(Auto a1) {
        System.out.println("El titular del vehiculo es: " + a1.getDueño());
        System.out.println("La fecha de vencimiento del carnet es: " + a1.getFechavenc());
        System.out.println("El color del auto es: " + a1.getColorauto());
        System.out.println("El modelo del auto es: " + a1.getColorauto());
        System.out.println("La cantidad de kilometros del motor es de: " + a1.getKM());
        System.out.println("La cantidad de Services que tiene realizado es de: " + a1.getCantServ());
    }

    public void modificarTitularidad(Auto a1) {
        System.out.println("Ingrese el nombre del nuevo titular");
        a1.setDueño(leer.next());
    }

    public void ingresarTrayecto(Auto a1) {
        int kms;
        System.out.println("Ingrese la cantidad de kilometros recorridos");
        kms = leer.nextInt();

        a1.setKM(a1.getKM() + kms);
    }

    public void necesidadService(Auto a1) {
        System.out.println("Su auto tiene: " + a1.getKM() + "kms y le realizo: " + a1.getCantServ() + " Services.");
        if ((a1.getKM() / a1.getCantServ()) > 10000) {
            System.out.println("Es necesario realizarle un service a su auto.");
        } else {
            System.out.println("Todavia no es necesario realizar un service a su auto.");
        }
    }

}
