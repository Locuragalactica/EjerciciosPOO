package ejercicio1.grupo.entidad;

import java.util.Scanner;

public class Libro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public int ISBN;
    public int paginas;
    public String titulo;
    public String autor;

    public Libro() {
    }

    public Libro(int ISBN, int paginas, String titulo, String autor) {
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.titulo = titulo;
        this.autor = autor;
    }

    public void cargarlibro() {
        System.out.println("Ingrese el titulo del Libro");
        titulo = leer.next();
        System.out.println("Ingrese el autor del Libro");
        autor = leer.next();
        System.out.println("Ingrese la cantidad de paginas del Libro");
        paginas = leer.nextInt();
        System.out.println("Ingrese el ISBN del Libro");
        ISBN = leer.nextInt();
    }

    public void mostrarlibro() {
        System.out.println("Su libro es: " + titulo + "\n"
                + "Su autor es: " + autor + "\n"
                + "La cantidad de páginas: " + paginas + "\n"
                + "Su ISBN es: " + ISBN);
    }
}
