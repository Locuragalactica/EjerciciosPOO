package ejercicio9;

import entidades.Matematica;

import java.util.Scanner;
import servicios.MatematicaServicio;

public class Ejercicio9 {

    public static void main(String[] args) {
        /*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
         */

        MatematicaServicio ms = new MatematicaServicio();
        Matematica m1 = new Matematica();
        Scanner leer = new Scanner(System.in);

        boolean exit = false;
        int rta;
        String rta2;

        m1.setNum1((float) (Math.random() * (10)));

        m1.setNum2((float) (Math.random() * (10)));

        ms.declararNumeros(m1);
        
        System.out.println("Sus dos numeros son: " + m1.getNum1() + ", " + m1.getNum2());

        do {
            do {
                System.out.println("Ingrese su opción de menu");
                System.out.println("Menú.\n"
                        + "1- Devolver Mayor.\n"
                        + "2- Calcular Potencia.\n"
                        + "3- Calcular Raiz.\n"
                        + "4- Salir.");

                rta = leer.nextInt();
            } while (rta < 1 || rta > 4);

            if (rta == 4) {

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
                    ms.devolverMayor(m1);
                    break;
                case 2:
                    ms.calcularPotencia();
                    break;
                case 3:
                    ms.calculaRaiz();
                    break;
            }

        } while (exit != true);

    }

}
