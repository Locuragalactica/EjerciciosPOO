package servicios;

import java.util.Arrays;

public class ArrayServicios {

    public void llenarArrays(int[] ar1, int[] ar2) {

        for (int i = 0; i < 50; i++) {
            ar1[i] = ((int) (Math.random() * 100));
        }

        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                ar2[i] = ar1[i];
            } else {
                ar2[i] = 0;

            }
        }

    }

    public void imprimirArrays(int[] ar1, int[] ar2) {
        System.out.println("Este es el primer Arreglo con 50 numeros aleatorios.");
        for (int i = 0; i < 50; i++) {
            System.out.print("[ " + ar1[i] + " ]");
        }
        System.out.println("");
        System.out.println("Estos son los primeros 10 numeros del primer arreglo ordenados de menor a mayor.");
        Arrays.sort(ar1, 0, 50);

        for (int i = 0; i < 10; i++) {
            System.out.print("[ " + ar1[i] + " ]");
        }
        System.out.println("");
        System.out.println("Este es el primer Arreglo ordenado de menor a mayor.");

        for (int i = 0; i < 50; i++) {
            System.out.print("[ " + ar1[i] + " ]");
        }
        System.out.println("");
        System.out.println("Este es el segundo arreglo, con los primeros diez del primero y los ultimos diez numeros con el valor de 0.");

        for (int i = 0; i < 20; i++) {
            System.out.print("[ " + ar2[i] + " ]");
        }
        System.out.println("");

    }
}
