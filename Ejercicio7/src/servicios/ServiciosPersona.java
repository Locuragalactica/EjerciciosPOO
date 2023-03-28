package servicios;

import entidades.Persona;
import java.util.Scanner;

public class ServiciosPersona {

    String sexo, nom;
    double peso, altura, prom;
    int IMC;
    boolean mayed;
    Persona p1 = new Persona();
    Scanner leer = new Scanner(System.in);

    /*
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
     */
    public void crearPersona(Persona p1) {

        System.out.println("Ingrese su nombre: ");
        p1.setNombre(leer.next());
        nom = p1.getNombre();
        System.out.println("Ingrese su edad: ");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese su sexo: H(hombre) / M(Mujer) / O(Otro)");
        p1.setSexo(leer.next().toLowerCase());
        sexo = p1.getSexo();
        if (!sexo.equals("h") && !sexo.equals("m") && !sexo.equals("o")) {
            do {
                System.out.println("Usted no ha ingresado una letra valida");
                sexo = leer.next().toLowerCase();
                System.out.println(sexo);
            } while (!sexo.equals("m") && !sexo.equals("h") && !sexo.equals("o"));
        }
    }

    /*
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
     */
    public int calcularIMC(Persona p1) {
        System.out.println("Ingrese su altura en metros con ','");
        altura = leer.nextFloat();
        System.out.println("Ingrese su peso en kilos");
        peso = leer.nextFloat();
        prom = peso / (Math.pow(altura, 2));
        if (prom < 20) {
            IMC = -1;
        } else if (prom >= 20 && prom <= 25) {
            IMC = 0;
        } else {
            IMC = 1;
        }

        return IMC;
    }

    //Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    public boolean esMayorDeEdad(Persona p1) {

        mayed = p1.getEdad() > 18;

        return mayed;
    }

}
