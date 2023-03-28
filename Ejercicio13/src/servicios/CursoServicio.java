package servicios;

import entidades.Curso;
import java.util.Scanner;

public class CursoServicio {

    String[] curso = new String[5];
    Scanner leer = new Scanner(System.in);

    /*
    método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
     */
    public void cargarAlumnos(Curso c1) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno:" + (i + 1));
            curso[i] = leer.next();
            System.out.println("Ingerese el Apellido del alumno: " + (i + 1));
            curso[i] = curso[i].concat(" " + leer.next());
        }
        System.out.println("Su curso esta compuesto por: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("{" + curso[i] + "}");
        }
        System.out.println("");

    }

    /*
    Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
     */
    public void crearCurso(Curso c1) {
        System.out.println("Ingrese el nombre del Curso: ");
        c1.setNombreCurso(leer.next());
        do {
            System.out.println("Ingrese el turno del Curso: M(Mañana)/T(Tarde)");
            c1.setTurno(leer.next().toLowerCase());
        } while ((!c1.getTurno().equals("t")) && (!c1.getTurno().equalsIgnoreCase("m")));

        System.out.println("Ingrese la cantidad de horas por día: ");
        c1.setCantidadHorasPorDia(leer.nextInt());

        System.out.println("Ingrese la cantidad de dias por semana: ");
        c1.setCantidadDiasPorSemana(leer.nextInt());

        System.out.println("Ingrese el precio por hora: ");
        c1.setPrecioPorHora(leer.nextInt());

        System.out.println("Ingrese el nombre de los alumnos:");
        cargarAlumnos(c1);

    }

    /*
    Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
     */
    public void calcularGanaciaSemanal(Curso c1) {
        float ganancia;
        ganancia = (c1.getCantidadHorasPorDia()) * (c1.getCantidadDiasPorSemana()) * (c1.getPrecioPorHora()) * 5;
        System.out.println("La ganacia de su curso es de: $" + ganancia);
    }

}

/*

 */
