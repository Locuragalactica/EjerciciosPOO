package servicios;

import entidades.Arreglo;
import java.util.Arrays;

public class ArregloServicios {

    int[] vector1 = new int[50];

    public void crearArreglos(Arreglo ar) {

        for (int i = 0; i < 50; i++) {
            ar.getArreglo1()[i] = (int) (Math.random() * 50);
        }

        System.out.println("Arreglo A: " + Arrays.toString(ar.getArreglo1()));

        Arrays.sort(ar.getArreglo1());

        System.arraycopy(ar.getArreglo1(), 0, ar.getArreglo2(), 0, 10);

        Arrays.fill(ar.getArreglo2(), 10, 20, 5);

        System.out.println("Arreglo A Ordenado: " + Arrays.toString(ar.getArreglo1()));

        System.out.println("Arreglo B: " + Arrays.toString(ar.getArreglo2()));

    }

    public void imprimirArreglos(Arreglo ar) {

        System.out.println("");
    }

}
