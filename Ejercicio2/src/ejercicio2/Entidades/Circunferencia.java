package ejercicio2.Entidades;

import java.util.Scanner;

public class Circunferencia {

    Scanner leer = new Scanner(System.in);
    private double radio, area, perimetro;

    //a) Método constructor que inicialice el radio pasado como parámetro.//
    public Circunferencia(int radio) {
        this.radio = radio;
    }
    //b) Métodos get y set para el atributo radio de la clase Circunferencia.//

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    /*c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
        objeto.*/
    public void crearCircunferencia() {
        System.out.println("Ingrese el radio");
        radio = leer.nextInt();
    }

    //d) Método area(): para calcular el área de la circunferencia (area = Math.PI * Math.pow(radio, 2)).
    public void area() {
        area = Math.PI * Math.pow(radio, 2);
    }

    //e) Método perimetro(): para calcular el perímetro (perimetro = 2 * Math.PI * radio).
    public void perimetro() {
        perimetro = 2 * Math.PI * radio;
    }

    public void imprimir() {
        area();
        perimetro();
        System.out.println("El radio ingresado es: " + radio);
        System.out.println("El área es de : " + area);
        System.out.println("El perimetro es de : " + perimetro);
    }
}
