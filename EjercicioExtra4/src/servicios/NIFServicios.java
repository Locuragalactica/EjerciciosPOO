package servicios;

import entidades.NIF;
import java.util.Scanner;

public class NIFServicios {

    String[] ar = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    int resto = 0;
    String s;
    Scanner leer = new Scanner(System.in);

    /*
    Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
     */
    public void crearNif(NIF n1) {
        System.out.println("Ingrese su numero de DNI");
        do {
            n1.setDNI(leer.nextInt());
            s = String.valueOf(n1.getDNI());
            if (s.length() != 8) {
                System.out.println("Su DNI es incorrecto ingreselo nuevamente: ");
            }
        } while (s.length() != 8);

        resto = n1.getDNI() % 23;
        s = s.concat("-" + ar[resto]);
    }

    public void mostrar(NIF n1) {
        System.out.println("Su numero de DNI con NIF es: " + s);
    }

}
