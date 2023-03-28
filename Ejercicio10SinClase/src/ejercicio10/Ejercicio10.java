package ejercicio10;

import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {

        /*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
         */
        int[] ar1 = new int[50];
        int[] ar2 = new int[20];

        for (int i = 0; i < 50; i++) {
            ar1[i] = ((int) (Math.random() * 100));
        }

        for (int i = 0; i < 50; i++) {
            System.out.print("[ " + ar1[i] + " ]");
        }
        System.out.println("");
        Arrays.sort(ar1, 0, 50);

        for (int i = 0; i < 10; i++) {
            System.out.print("[ " + ar1[i] + " ]");
        }
        System.out.println("");

        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                ar2[i] = ar1[i];
            } else {
                ar2[i] = 0;
            }
        }

        for (int i = 0; i < 50; i++) {
            System.out.print("[ " + ar1[i] + " ]");
        }
        System.out.println("");

        for (int i = 0; i < 20; i++) {
            System.out.print("[ " + ar2[i] + " ]");
        }

    }

}
