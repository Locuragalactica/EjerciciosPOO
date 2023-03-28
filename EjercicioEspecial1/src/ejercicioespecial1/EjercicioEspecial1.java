package ejercicioespecial1;

import entidades.Cuenta;
import java.util.Scanner;
import servicios.CuentaServicios;

public class EjercicioEspecial1 {

    public static void main(String[] args) {
        /*
         Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).

El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.

Crea sus métodos get, set y toString.

Tendrá dos métodos especiales:

ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
         */
        Cuenta c1 = new Cuenta();
        CuentaServicios cs = new CuentaServicios();
        cs.crearCuenta(c1);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int rta;
        String rta2 = "";

        do {
            System.out.println("Menu de Cuenta");
            System.out.println("1- Ingresar dinero");
            System.out.println("2- Retirar dinero");
            System.out.println("3- Salir");
            rta = leer.nextInt();
            if (rta == 3) {
                System.out.println("¿Esta seguro que desea salir? S/N");
                rta2 = leer.next();
                if (rta2.equals("s")) {
                    break;
                }
            }
            switch (rta) {
                case 1:
                    cs.ingresar(c1);
                    rta = 4;
                    break;
                case 2:
                    cs.retirar(c1);
                    rta = 4;
                    break;
            }

        } while (rta > 3 || rta < 1 || !rta2.equals("s"));

    }

}
