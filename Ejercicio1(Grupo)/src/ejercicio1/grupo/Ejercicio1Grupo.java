package ejercicio1.grupo;

import ejercicio1.grupo.entidad.Libro;
import java.util.Scanner;

public class Ejercicio1Grupo {

    public static void main(String[] args) {
        /*
        Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
        Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
        constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
        luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
        numero de páginas.
         */
        Scanner leer = new Scanner(System.in);

        Libro libro1 = new Libro();

        libro1.cargarlibro();

        libro1.mostrarlibro();

    }

}
