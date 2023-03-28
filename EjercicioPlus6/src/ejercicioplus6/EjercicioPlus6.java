package ejercicioplus6;

import entidades.Sopa;
import java.util.Scanner;
import servicios.SopaServicios;

public class EjercicioPlus6 {

    public static void main(String[] args) {
        /*
        Crear una clase Sopa de letras que contenga un atributo matriz, y otro palabra a encontrar.
Llenar una matriz de 10x10 con palabras de 5 caracteres (todas de forma horizontal, en orden)
inicializándola por defecto con “palabras preestablecidas”.
Crear métodos:
● Que el usuario ingrese una palabra y la busque en la matriz. Deberá retornar en que
posición de la matriz inicia la palabra.
● Imprimir la sopa de letras en pantalla ✔
● Que el usuario pueda reemplazar una palabra especifica de la matriz ya pre -cargada (Es
decir, por ejemplo, que si en posición 0.0 estaba perro, cambiarla a polo). Para realizar esta
gestión, el método recibirá la palabra a buscar y a reemplazar sus datos
● Imprimir la sopa de letras, invertida (es decir, filas por columnas)✔
         */

        Sopa s1 = new Sopa();
        SopaServicios ss = new SopaServicios();
        int rta;
        String rta2 = "";
        Scanner leer = new Scanner(System.in);

        ss.palabrasPreestablecidas(s1);

        do {
            System.out.println("Menu de Cuenta");
            System.out.println("1- Buscar palabra");
            System.out.println("2- Imprimir Sopa de Letras");
            System.out.println("3- Reemplazar Palabra");
            System.out.println("4- Imprimir Sopa de Letras Invertida");
            System.out.println("5- Salir");
            rta = leer.nextInt();
            if (rta == 5) {
                System.out.println("¿Esta seguro que desea salir? S/N");
                rta2 = leer.next();
                if (rta2.equals("s")) {
                    break;
                }
            }
            switch (rta) {
                case 1:
                    ss.ingresarPalabra(s1);
                    rta = 6;
                    break;
                case 2:
                    ss.imprimirSopa(s1);
                    rta = 6;
                    break;
                case 3:
                    ss.reemplazarPalabra(s1);
                    rta = 6;
                    break;
                case 4:
                    ss.imprimirSopaInvertida(s1);
                    rta = 6;
                    break;
            }

        } while (rta > 5 || rta < 1 || !rta2.equals("s"));

    }

}
