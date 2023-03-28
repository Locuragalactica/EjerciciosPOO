package servicios;

import entidades.Triangulo;
import java.util.Arrays;
import java.util.Scanner;

public class TrianguloServicios {

    Scanner leer = new Scanner(System.in);

    double[] areas = new double[4];
    int[] perimetros = new int[4];
    double area, altura;
    int perimetro, may, i = 0;

    public void ingresarTriangulos(Triangulo t, Triangulo[] ta) {

        System.out.println("Ingrese la base del triangulo en cms: " + (i + 1));
        t.setBase(leer.nextInt());
        System.out.println("Ingrese los lados del triangulo en cms: " + (i + 1));
        t.setLados(leer.nextInt());
        calcularArea(t);
        areas[i] = area;
        calcularPerimetro(t);
        perimetros[i] = perimetro;
        i++;
    }

    public void calcularArea(Triangulo t) {

        altura = Math.sqrt((Math.pow(t.getLados(), 2)) - ((Math.pow(t.getBase() / 2, 2) / 2)));
        area = t.getBase() * (altura / 2);

    }

    public void calcularPerimetro(Triangulo t1) {
        perimetro = t1.getBase() + (t1.getLados() * 2);
    }

    public void mayor(Triangulo t1, Triangulo[] ta) {
        for (int j = 0; i < 4; i++) {
            if (j == 0) {
                may = j;
            } else if (areas[i] > may) {
                may = j;
            }
        }
        Arrays.sort(areas);

    }

    public void mostrarDatos(Triangulo t1, Triangulo[] ta) {
        System.out.println(areas[0]);
        System.out.println(areas[1]);
        System.out.println(areas[2]);
        System.out.println(areas[3]);
        mayor(t1, ta);
        System.out.println("Los datos del triangulo con mayor area son: ");
        System.out.println(ta[may].toString());
        System.out.println("El perimetro es de: " + perimetros[may] + "cms");
        System.out.println("El área es de : " + areas[3] + "cms");
    }
    
    

}
