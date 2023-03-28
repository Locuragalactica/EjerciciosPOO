package servicios;

import entidades.Raices;
import java.util.Scanner;

public class RaizServicios {

    Scanner leer = new Scanner(System.in);
    double discriminante, dobra, dobra2;
    boolean rai = false, rai2 = false;

    public void llenarNum(Raices r1) {
        System.out.println("Ingrese el primer numero: ");
        r1.setA(leer.nextDouble());
        System.out.println("Ingrese el segundo numero: ");
        r1.setB(leer.nextDouble());
        System.out.println("Ingrese el primer numero: ");
        r1.setC(leer.nextDouble());
    }

    /*
     Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
     */
    public double getDiscriminante(Raices r1) {
        double a = r1.getA();
        double b = r1.getB();
        double c = r1.getC();
        discriminante = (Math.pow(b, 2)) - 4 * a * c;
        System.out.println(discriminante);

        return discriminante;

    }

    /*
    Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
     */
    public boolean tieneRaices(Raices r1) {
        if (discriminante >= 0) {
            rai = true;
        }
        return rai;
    }

    /*
    Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
     */
    public boolean tieneRaiz(Raices r1) {
        if (discriminante == 0) {
            rai2 = true;
        }
        return rai2;
    }

    /*
    Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
     */
    public void obtenerRaices(Raices r1) {
        double a = r1.getA();
        double b = r1.getB();
        double c = r1.getC();
        dobra = (-b + Math.sqrt(((Math.pow(b, 2)) - (4 * a * c))) / (2 * a));
        dobra2 = (-b - Math.sqrt(((Math.pow(b, 2)) - (4 * a * c))) / (2 * a));
        if (tieneRaices(r1) == true) {
            System.out.println("Solucion 1: " + dobra + ".\n"
                    + "Solucion 2: " + dobra2);
        }

    }

    /*
    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
     */
    public void obtenerRaiz(Raices r1) {
        double a = r1.getA();
        double b = r1.getB();
        double c = r1.getC();
        dobra = (-b + Math.sqrt(((Math.pow(b, 2)) - (4 * a * c))) / (2 * a));

        if (tieneRaiz(r1) == true) {
            System.out.println("Unica solución: " + dobra);
        }
    }

    /*
    Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
     */
    public void calcular(Raices r1) {
        if (tieneRaices(r1) == false && tieneRaiz(r1) == false) {
            System.out.println("No existe solución;");
        } else {
            obtenerRaices(r1);
            obtenerRaiz(r1);
        }

    }

}
