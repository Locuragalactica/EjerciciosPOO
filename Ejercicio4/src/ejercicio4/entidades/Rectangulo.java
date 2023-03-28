package ejercicio4.entidades;

import java.util.Scanner;

public class Rectangulo {

    Scanner leer = new Scanner(System.in);
    private int base, altura;
    private float superficie, perimetro;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        System.out.println("Ingrese la base");
        base = leer.nextInt();
        System.out.println("Ingrese la altura");
        altura = leer.nextInt();
    }

    public void calculoSuperficie() {
        superficie = base * altura;
        System.out.println("La superficie de su rectangulo es: " + superficie);
    }

    public void calculoPerimetro() {
        perimetro = (base * altura) * 2;
        System.out.println("El perimetro de su rectangulo es: " + perimetro);
    }

    public void impresionRectangulo() {

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == (altura - 1) || j == 0 || j == (base - 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("   ");
        }
    }

}
