package servicios;

import entidades.Libro;
import java.util.Scanner;

public class ServicioLibro {

    public Libro cargarlibro() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el titulo de su libro");
        String titulo = leer.next();
        System.out.println("Ingrese el autor de su libro");
        String autor = leer.next();
        System.out.println("Ingrese el nro de paginas de su libro");
        int nropaginas = leer.nextInt();
        System.out.println("Ingrese el ISBN de su libro");
        int ISBN = leer.nextInt();

        return new Libro(ISBN, titulo, autor, nropaginas);
    }

}
