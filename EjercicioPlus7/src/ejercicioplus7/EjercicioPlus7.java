package ejercicioplus7;

import entidades.Auto;
import java.util.Scanner;
import servicios.AutoServicios;

public class EjercicioPlus7 {

    public static void main(String[] args) {
        /*
        Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Auto a1 = new Auto();
        AutoServicios as = new AutoServicios();
        int rta;
        String rta2 = "";

        do {
            System.out.println("Menu de Cuenta");
            System.out.println("1- Cargar Ficha de Auto");
            System.out.println("2- Mostrar Ficha de Auto");
            System.out.println("3- Modificar Titularidad");
            System.out.println("4- Ingresar trayecto recorrido");
            System.out.println("5- Necesidad de Service");
            System.out.println("6- Salir");
            rta = leer.nextInt();
            if (rta == 6) {
                System.out.println("¿Esta seguro que desea salir? S/N");
                rta2 = leer.next();
                if (rta2.equals("s")) {
                    break;
                }
            }
            switch (rta) {
                case 1:
                    as.cargarFicha(a1);
                    rta = 7;
                    break;
                case 2:
                    as.mostrarFicha(a1);
                    rta = 7;
                    break;
                case 3:
                    as.modificarTitularidad(a1);

                    rta = 7;
                    break;
                case 4:
                    as.ingresarTrayecto(a1);

                    rta = 7;
                    break;
                case 5:
                    as.necesidadService(a1);

                    rta = 7;
            }

        } while (rta > 6 || rta < 1 || !rta2.equals("s"));

    }

}
