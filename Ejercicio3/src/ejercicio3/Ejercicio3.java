package ejercicio3;

import ejercicio3.entidades.Operacion;

public class Ejercicio3 {

    public static void main(String[] args) {
        /*
        Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.✔
b) Metodo constructor sin los atributos pasados por parámetro.✔
c) Métodos get y set.✔
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto. ✔
e) Método sumar(): calcular la suma de los números y devolver el resultado al main. ✔
f) Método restar(): calcular la resta de los números y devolver el resultado al main ✔
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main ✔
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main. ✔
         */

        Operacion op1 = new Operacion();

        op1.crearOperacion();
        
        System.out.println("La suma de sus numeros es: " + op1.sumar() + "\n"
                + "La resta de sus numeros es: " + op1.restar() + "\n"
                + "La multiplicación de sus numeros es: " + op1.multiplicar() + "\n"
                + "La division de sus numeros es:" + op1.dividir());

    }

}
