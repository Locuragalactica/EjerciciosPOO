package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    int anio, mes, dia, edad;

    /*
    Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
     */
    public void crearPersona(Persona p1) {

        System.out.println("Ingrese su nombre: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese su apellido: ");
        p1.setApellido(leer.next());

        System.out.println("Ingrese su año de nacimiento: ");
        anio = leer.nextInt() - (1900);
        System.out.println("Ingrese su mes de nacimiento: ");
        mes = leer.nextInt() - 1;
        System.out.println("Ingrese su dia de nacimiento: ");
        dia = leer.nextInt();
        Date nac = new Date(anio, mes, dia);

        p1.setFechaNacimiento(nac);
    }

    /*
    Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
     */
    public void calcularEdad(Persona p1) {
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        edad = (fechaActual.getYear()) - (p1.getFechaNacimiento().getYear());

        if (fechaActual.getMonth() > p1.getFechaNacimiento().getMonth() || fechaActual.getMonth() == p1.getFechaNacimiento().getMonth()) {

            if (fechaActual.getDay() > p1.getFechaNacimiento().getDay()) {
                System.out.println("La edad de: " + p1.getNombre() + " " + p1.getApellido() + " es de: " + edad);
            } else {
                System.out.println("La edad de: " + p1.getNombre() + " " + p1.getApellido() + " es de: " + (edad - 1));
            }

        } else {
            System.out.println("La edad de: " + p1.getNombre() + " " + p1.getApellido() + " es de: " + (edad - 1));
        }

    }

    public boolean menorQue(Persona p1, int edad2) {
        boolean men = true;
        if (edad2 < edad) {
            men = false;
        }

        return men;
    }

    public void mostrarPersona(Persona p1) {
        System.out.println("El nombre de la persona es: " + p1.getNombre() + ".\n"
                + "Su apellido es: " + p1.getApellido() + ".\n"
                + "Su fecha de nacimiento es: " + p1.getFechaNacimiento());

    }

}
