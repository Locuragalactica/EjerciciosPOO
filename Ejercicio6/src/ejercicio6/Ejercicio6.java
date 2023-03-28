package ejercicio6;

import ejercicio6.entidades.Cafetera;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        /*     
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío ✔
 Constructor con la capacidad máxima y la cantidad actual ✔
 Métodos getters y setters. ✔
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima. ✔
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza. ✔
 Método vaciarCafetera(): pone la cantidad de café actual en cero. ✔
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.✔
         */

        Cafetera c1 = new Cafetera();
        int rta;
        String rta2;
        boolean exit = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Cafetera Nespresso.");

        do {
            do {
                System.out.println("Ingrese su opción de menu");
                System.out.println("Menú.\n"
                        + "1- Llenar Cafetera.\n"
                        + "2- Servir Taza.\n"
                        + "3- Vaciar Cafetera.\n"
                        + "4- Agregar Cafe.\n"
                        + "5- Salir.");

                rta = leer.nextInt();
            } while (rta < 1 || rta > 5);

            if (rta == 5) {

                do {
                    System.out.println("¿Esta seguro que desea salir S/N");
                    rta2 = leer.next();

                    if (rta2.equalsIgnoreCase("S")) {
                        exit = true;
                        break;
                    }
                } while (!rta2.equalsIgnoreCase("S") && !rta2.equalsIgnoreCase("N"));

            }

            switch (rta) {
                case 1:
                    c1.llenarCafetera();
                    System.out.println(" ");
                    break;
                case 2:
                    int cafe,
                     taza;

                    do {
                        System.out.println("Ingrese el tamaño de taza a llenar:");
                        System.out.println("1- Pequeña (50ml).\n"
                                + "2- Mediana (100ml).\n"
                                + "3- Grande (150ml).\n"
                                + "4- Enorme (300ml).");
                        taza = leer.nextInt();

                    } while (taza > 4 || taza < 1);

                    switch (taza) {
                        case 1:
                            taza = 50;
                            break;
                        case 2:
                            taza = 100;
                            break;
                        case 3:
                            taza = 150;
                            break;
                        case 4:
                            taza = 300;
                            break;
                    }
                    c1.servirTaza(taza);
                    System.out.println(" ");
                    break;
                case 3:
                    c1.vaciarCafetera();
                    System.out.println(" ");
                    break;
                case 4:
                    int cantactual = c1.getCantidadActual();
                    int capmax = c1.getCapacidadMaxima();
                    System.out.println("La carga actual de la cafetera es de: " + c1.getCantidadActual());

                    System.out.println("¿Cuanto cafe desea agregar?");

                    do {
                        System.out.println("Recuerde que la capacidad maxima es de 2000ml.)");
                        taza = leer.nextInt();
                        cantactual += taza;
                        if (cantactual > capmax) {
                            System.out.println("Usted esta excediendo el limite de la cafetera.\n");
                            cantactual -= taza;

                        }
                    } while (taza < 0 || taza > 2000);

                    System.out.println("La cafetera quedo con: " + c1.agregarCafe(taza) + "ml");
                    System.out.println(" ");
                    break;
            }

        } while (exit != true);

    }

}
