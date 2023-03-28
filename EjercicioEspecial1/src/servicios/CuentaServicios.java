package servicios;

import entidades.Cuenta;
import java.util.Scanner;

public class CuentaServicios {

    Scanner leer = new Scanner(System.in);
    float retiro;

    /*
    ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, 
    no se hará nada.
     */
    public void crearCuenta(Cuenta c1) {
        System.out.println("Ingrese el nombre del titular de la cuenta");
        c1.setTitular(leer.next());
        c1.setCantidad((float) Math.random() * 50000);
    }

    public void ingresar(Cuenta c1) {

        System.out.println("Su cuenta tiene: $" + c1.getCantidad());
        System.out.println("Ingrese la cantidad de dinero que dese ingresar.");
        c1.setCantidad(c1.getCantidad() + leer.nextFloat());
        System.out.println("Su cuenta tiene: $" + c1.getCantidad());
    }

    /*
    retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que 
    nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
     */
    public void retirar(Cuenta c1) {
        System.out.println("Ingrese cuanto dinero quiere retirar");
        retiro = leer.nextFloat();

        if (retiro > c1.getCantidad()) {
            retiro = c1.getCantidad();
            System.out.println("Usted no cuenta con suficiente dinero. El saldo que retirara sera de: $" + retiro);
        } else {
            System.out.println("Usted ha retirado $" + retiro);
            c1.setCantidad(c1.getCantidad() - retiro);
        }
        System.out.println("El saldo de su cuenta es: $" + c1.getCantidad());

    }
}
