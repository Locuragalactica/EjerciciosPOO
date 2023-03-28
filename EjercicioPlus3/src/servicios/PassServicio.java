package servicios;

import java.util.Scanner;
import entidades.Pass;

public class PassServicio {

    Scanner leer = new Scanner(System.in);
    String letra, pass2;
    int cont = 0;
    boolean exit;

    /*
    Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (8). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
     */
    public void crearPass(Pass p1) {

        System.out.println("Ingrese su contraseña de 8 caracteres");
        p1.setPass(leer.next());

        while (p1.getPass().length() != 8) {
            System.out.println("Su contraseña es incorrecta, no cuenta con 8 caracteres.");
            p1.setPass(leer.next());
        }

    }

    /*
    Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO.
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO.
o Si ninguna condición se cumple es nivel BAJO.
     */
    public void analizarPass(Pass p1) {
        for (int i = 0; i < p1.getPass().length(); i++) {
            letra = p1.getPass().substring(i, i + 1);

            if (letra.equals("z")) {
                cont++;
            } else if (letra.equals("a")) {
                cont++;
            }
        }

        switch (cont) {
            case 1:
                System.out.println("Su contraseña tiene un nivel medio");
                break;
            case 3:
                System.out.println("Su contraseña tiene un nivel alto");
                break;
            default:
                System.out.println("Su contraseña tiene un nivel bajo");
        }

    }

    /*
    Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
     */
    public void modificarNombre(Pass p1) {

        do {
            System.out.println("Por favor ingrese la contraseña:");
            pass2 = leer.next();
            if (!pass2.equals(p1.getPass())) {
                System.out.println("Su contraseña es incorrecta, ingresela nuevamente");
            }
        } while (!pass2.equals(p1.getPass()));

        System.out.println("Ingrese el nuevo nombre");
        p1.setNombre(leer.next());

    }

    public void modificarDNI(Pass p1) {

        do {
            System.out.println("Por favor ingrese la contraseña:");
            pass2 = leer.next();
            if (!pass2.equals(p1.getPass())) {
                System.out.println("Su contraseña es incorrecta, ingresela nuevamente");
            }
        } while (!pass2.equals(p1.getPass()));

        System.out.println("Ingrese en nuevo DNI");
        p1.setDni(leer.nextInt());

    }

    public void mostrarDatos(Pass p1) {
        System.out.println("Su nombre es: " + p1.getNombre());
        System.out.println("Su DNI es: " + p1.getDni());
    }


    /*
    A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña.
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso.
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios.
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios.
     */
    public void menu(Pass p1) {
        int rta;
        String rta2;

        do {
            do {
                System.out.println("Ingrese su opción de menu");
                System.out.println("Menú.\n"
                        + "1- Ingresar Pass.\n"
                        + "2- Nivel de Pass.\n"
                        + "3- Modificar Pass.\n"
                        + "4- Modificar nombre.\n"
                        + "5- Modificar DNI.\n"
                        + "6- Mostrar Datos. \n"
                        + "7- Salir.");

                rta = leer.nextInt();
            } while (rta < 1 || rta > 7);

            if (rta == 7) {

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
                    crearPass(p1);
                    break;
                case 2:
                    analizarPass(p1);
                    break;
                case 3:
                    crearPass(p1);
                    break;
                case 4:
                    modificarNombre(p1);
                    break;
                case 5:
                    modificarDNI(p1);
                    break;
                case 6:
                    mostrarDatos(p1);
                    break;
            }

        } while (exit != true);
    }

}
