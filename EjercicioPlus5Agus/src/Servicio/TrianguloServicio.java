package Servicio;

import Entidad.Triangulo;
import java.util.Arrays;
import java.util.Scanner;

public class TrianguloServicio {
    Scanner leer = new Scanner(System.in);
    double Areas[] = new double[4];
    double area;
    int posMayor;

    public void crearTriangulo(Triangulo t1[]) {
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el valor de los lados del triangulo " + (i + 1) + ": ");
            t1[i].setLadosI(leer.nextInt());
            System.out.print("Ingrese el valor de la base del triángulo " + (i + 1) + ": ");
            t1[i].setBase(leer.nextInt());
            Areas[i] = calcularArea(t1[i]);
        }
    }

    public double calcularArea(Triangulo t1) {
        double alt = Math.sqrt((Math.pow(t1.getLadosI(), 2)) - ((Math.pow(t1.getBase() / 2, 2) / 2)));;
        area = (t1.getBase() * alt) / 2;
        return area;
    }

    public int mayor() {
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                posMayor = i;
            } else if (Areas[posMayor] < Areas[i]) {
                posMayor = i;
            }
        }
        return posMayor;
    }

    public void mayorA() {
        Arrays.sort(Areas);
        System.out.println("Area: " + Areas[3]);
    }

    public void mostrar(Triangulo t1[]) {
        int i;
        crearTriangulo(t1);
        System.out.println("-----------------------");
        System.out.println("El triangulo con valores: " + t1[mayor()] + " es el de mayor area.");
        System.out.println("--------------------------------------------------");
        System.out.print("     ");
        for (i = 0; i < 3; i++) {
           System.out.print((i+1)+")"+Areas[i]+" / ");
        }
        System.out.println((i+1)+")"+Areas[i]+"     ");
        System.out.println("--------------------------------------------------");
        mayorA();
        double perimetro = t1[posMayor].getLadosI() * 2 + t1[posMayor].getBase();
        System.out.println("Perimetro: " + perimetro);
    }

}
