package ejercicioplus5;

import entidades.Triangulo;
import servicios.TrianguloServicios;

public class EjercicioPlus5 {

    public static void main(String[] args) {
        /*
        Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
         */
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        Triangulo t3 = new Triangulo();
        Triangulo t4 = new Triangulo();
        TrianguloServicios ts = new TrianguloServicios();

        Triangulo[] ta = {t1, t2, t3, t4};

        ts.ingresarTriangulos(t1, ta);
        ts.ingresarTriangulos(t2, ta);
        ts.ingresarTriangulos(t3, ta);
        ts.ingresarTriangulos(t4, ta);
        ts.mostrarDatos(t1, ta);

    } 

}
