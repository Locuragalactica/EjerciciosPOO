package ejercicio5;

import ejercicio5.entidades.Cuenta;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        /*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. ✔
b) Agregar los métodos getters y setters correspondientes ✔
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. ✔
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual. ✔
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0. ✔
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
         */
        Cuenta c1 = new Cuenta();
        int rta;
        String rta2;
        boolean exit = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido al Banco.\n"
                + "Es necesario que cree un usuario.");

        c1.crearCuenta();

        System.out.println("Cuenta Creada.");

        do {
            do {
                System.out.println("Ingrese su opción de menu");
                System.out.println("Menú.\n"
                        + "1- Ingresar dinero.\n"
                        + "2- Retirar dinero.\n"
                        + "3- Extracción rapido.\n"
                        + "4- Consultar saldo.\n"
                        + "5- Consultar datos.\n"
                        + "6- Salir.");

                rta = leer.nextInt();
            } while (rta < 1 || rta > 6);

            if (rta == 6) {

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
                    double ingreso;
                    System.out.println("Digite la cantidad a ingresar");
                    ingreso = leer.nextDouble();

                    double saldo = c1.ingresar(ingreso);

                    System.out.println("Su saldo actual es de: " + saldo + "\n");
                    break;
                case 2:

                    double retiro;
                    System.out.println("Digite la cantidad a retirar");
                    retiro = leer.nextDouble();
                    saldo = c1.retiro(retiro);
                    
                    System.out.println("Su saldo actual es de: " + saldo + "\n");
                    break;
                case 3:
                    saldo = c1.extraccionRapida();
                    System.out.println("Su saldo actual es de: " + saldo + "\n");
                    break;
                case 4:
                    c1.consultarSaldo();
                    System.out.println(" ");
                    break;
                case 5:
                    c1.consultarDatos();
                    System.out.println(" ");
                    break;
            }

        } while (exit != true);

    }

}
