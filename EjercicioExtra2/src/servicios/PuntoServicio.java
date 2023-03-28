package servicios;

import entidades.Puntos;
import java.util.Scanner;

public class PuntoServicio {

    Scanner leer = new Scanner(System.in);
    double distancia;

    public void crearPuntos(Puntos p1) {
        System.out.println("Ingrese la cordenada X de su primer punto: ");
        p1.setX1(leer.nextInt());
        System.out.println("Ingrese la cordenada Y de su primer punto: ");
        p1.setY1(leer.nextInt());
        System.out.println("Ingrese la cordenada X de su segundo punto: ");
        p1.setX2(leer.nextInt());
        System.out.println("Ingrese la cordenada Y de su segundo punto: ");
        p1.setY2(leer.nextInt());
    
    }
    

    public void calcular(Puntos p1) {
        distancia = (Math.sqrt(Math.pow((p1.getX2() - p1.getX1()), 2) + Math.pow((p1.getY2() - p1.getY1()), 2)));
        System.out.println("La distancia entre sus dos puntos es: " + distancia);
    }

}
