package servicios;

import entidades.Cancion;
import java.util.Scanner;

public class CancionServicio {

    Scanner leer = new Scanner(System.in);

    public void ingresarCancion(Cancion c1) {
        System.out.println("Ingrese el nombre de la cancion: ");
        c1.setTitulo(leer.next());

        System.out.println("Ingrese el autor de la cancion: ");
        c1.setAutor(leer.next());
    }

}
