package entidades;

import java.util.Scanner;

public class Libro {

    Scanner leer = new Scanner(System.in);
    public int ISBN;
    public String titulo;
    public String autor;
    public int nropaginas;

    public Libro(int ISBN, String titulo, String autor, int nropaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nropaginas = nropaginas;

    }

    public Libro() {
    }

    @Override
    public String toString() {
        return "Titulo del libro: " + titulo
                + "\nAutor: " + autor
                + "\nN° Paginas: " + nropaginas
                + "\nISBN: " + ISBN;
    }

}
