package servicios;

import entidades.Movil;
import java.util.Arrays;
import java.util.Scanner;

public class MovilServicio {

    Scanner leer = new Scanner(System.in);
    String[] cod = new String[7];
    int rta, rta2;

    /*
     Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
     */
    public void cargarCelular(Movil m1) {

        System.out.println("Ingresara los datos de su nuevo dispositivo: ");
        System.out.println("Ingrese la marca del movil. ");
        m1.setMarca(leer.next());
        System.out.println("Ingrese el precio del movil en $ ");
        m1.setPrecio(leer.nextInt());
        System.out.println("Ingrese la memoria RAM del movil. ");
        System.out.println("1- 2GB RAM. \n"
                + "2- 4GB RAM. \n"
                + "3- 6GB RAM. \n"
                + "4- 8GB RAM");
        rta = leer.nextInt();
        while (rta > 4 || rta < 1) {
            System.out.println("Respuesta incorrecta, ingresela nuevamente.");
            rta = leer.nextInt();
        }
        switch (rta) {
            case 1:
                m1.setMemoriaRam(2);
                break;
            case 2:
                m1.setMemoriaRam(4);
                break;
            case 3:
                m1.setMemoriaRam(6);
                break;
            case 4:
                m1.setMemoriaRam(8);
                break;
        }
        System.out.println("Ingrese el almacenamiento del movil. ");
        System.out.println("1- 16GB RAM. \n"
                + "2- 32GB RAM. \n"
                + "3- 64GB RAM. \n"
                + "4- 128GB RAM");
        rta2 = leer.nextInt();
        while (rta > 4 || rta < 1) {
            System.out.println("Respuesta incorrecta, ingresela nuevamente.");
            rta = leer.nextInt();
        }
        switch (rta) {
            case 1:
                m1.setAlmacenamiento(16);
                break;
            case 2:
                m1.setAlmacenamiento(32);
                break;
            case 3:
                m1.setAlmacenamiento(64);
                break;
            case 4:
                m1.setAlmacenamiento(128);
                break;
        }
        ingresarCodigo(m1);
    }

    /*
    Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
     */
    public void ingresarCodigo(Movil m1) {
        int cn;
        String s;
        do {
            System.out.println("Ingrese el codigo de 7 numeros del movil");
            cn = leer.nextInt();
            s = Integer.toString(cn);
        } while (s.length() > 7 || s.length() < 7);

        for (int i = 0; i < 7; i++) {
            m1.getCodigo()[i] = s.substring(i, i + 1);

        }

    }

    public void imprimirCelular(Movil m1) {

        System.out.println(m1.toString());
    }

}
