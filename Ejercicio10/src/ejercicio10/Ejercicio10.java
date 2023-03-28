package ejercicio10;

import entidades.Array;
import servicios.ArrayServicios;

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
        Array Arr = new Array();
        ArrayServicios as = new ArrayServicios();

        int[] ar1 = new int[50];
        int[] ar2 = new int[20];
        System.out.println("Se crearan automaticamente 2 Arreglos.");

        as.llenarArrays(ar1, ar2);
        as.imprimirArrays(ar1, ar2);

    }

}
