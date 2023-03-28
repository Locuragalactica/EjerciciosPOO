package ejercicio7;

import entidades.Persona;
import servicios.ServiciosPersona;

public class Ejercicio7 {

    public static void main(String[] args) {
        /*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto. ✔
 Un constructor con todos los atributos como parámetro. ✔
 Métodos getters y setters de cada atributo. ✔
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje ✔
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1. ✔
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano. ✔
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
         */

        ServiciosPersona ps = new ServiciosPersona();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();

        int deb = 0, pes = 0, ob = 0, may = 0, men = 0;

        String[] name = new String[4];
        int[] gralimc = new int[4];
        boolean[] myed = new boolean[4];

        ps.crearPersona(p1);
        name[0] = p1.getNombre();
        gralimc[0] = ps.calcularIMC(p1);
        myed[0] = ps.esMayorDeEdad(p1);

        ps.crearPersona(p2);
        name[1] = p2.getNombre();
        gralimc[1] = ps.calcularIMC(p2);
        myed[1] = ps.esMayorDeEdad(p2);

        ps.crearPersona(p3);
        name[2] = p3.getNombre();
        gralimc[2] = ps.calcularIMC(p3);
        myed[2] = ps.esMayorDeEdad(p3);

        ps.crearPersona(p4);
        name[3] = p4.getNombre();
        gralimc[3] = ps.calcularIMC(p4);
        myed[3] = ps.esMayorDeEdad(p4);

        for (int i = 0; i < 4; i++) {
            switch (gralimc[i]) {
                case -1:
                    System.out.println(name[i] + " esta por debajo del peso ideal.");
                    deb++;
                    break;
                case 0:
                    System.out.println(name[i] + " esta en el peso ideal.");
                    pes++;
                    break;
                case 1:
                    System.out.println(name[i] + " esta excedido del peso ideal.");
                    ob++;
                    break;
            }
        }

        for (int i = 0; i < 4; i++) {
            if (myed[i] == true) {
                System.out.println(name[i] + " es mayor de edad");
                may++;
            } else {
                System.out.println(name[i] + " es menor de edad");
                men++;
            }
        }

        System.out.println("La cantidad de personas por debajo del peso ideal es de: " + deb + "\n"
                + "La cantidad de perosnas en el peso ideal es de: " + pes + "\n"
                + "La cantidad de personas que exceden el peso ideal es de: " + ob);

        System.out.println("El porcentaje de mayores de edad es de: " + (may * 100 / (4)) + "\n"
                + "El porcentaje de menores de edad es de: " + men * 100 / (4));

    }

}
