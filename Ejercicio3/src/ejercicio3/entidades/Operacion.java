package ejercicio3.entidades;

import java.util.Scanner;

public class Operacion {

    Scanner leer = new Scanner(System.in);
    private int num1, num2;

    //c) Métodos get y set.//
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    //a) Método constructor con todos los atributos pasados por parámetro.//
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //b) Metodo constructor sin los atributos pasados por parámetro.//
    public Operacion() {
    }

    //d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
    //en los atributos del objeto.
    public void crearOperacion() {
        System.out.println("Ingrese su primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese su segundo numero");
        num2 = leer.nextInt();
    }

    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public int sumar() {
        int suma;

        suma = num1 + num2;

        return suma;
    }

    //f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public int restar() {
        int resta;

        resta = num1 - num2;
        return resta;
    }

    /*g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
    fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
    Si no, se hace la multiplicación y se devuelve el resultado al main*/
    public float multiplicar() {
        float multi;
        if (num1 != 0 && num2 != 0) {
            multi = num1 * num2;
        } else {
            multi = 0;
            System.out.println("Error, no se puede multiplicar, uno de los numeros ingresados es 0");
        }

        return multi;
    }

    /*
    h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
    una división por cero, el método devuelve 0 y se le informa al usuario el error se le
    informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
     */
    public float dividir() {
        float div;
        if (num1 != 0 && num2 != 0) {
            div = num1 / num2;
        } else {
            div = 0;
            System.out.println("Error, no se puede dividir, uno de los numeros ingresados es 0");
        }

        return div;
    }
}
