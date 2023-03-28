/*
Ejercicio 5
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
- Calcular área
- Calcular perímetro
- Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package pooextra05;

import Entidad.Triangulo;
import Servicio.ServicioTriangulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class POOExtra05 {

    public static void main(String[] args) {
        
        ServicioTriangulo servTri = new ServicioTriangulo();
        
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        Triangulo t3 = new Triangulo();
        Triangulo t4 = new Triangulo();
        
        servTri.opcionesMetodos(t1);
        servTri.opcionesMetodos(t2);
        servTri.opcionesMetodos(t3);
        servTri.opcionesMetodos(t4);
        
        List<Triangulo> listaTriangulos = new ArrayList<> ();
        
        listaTriangulos.add(t1);
        listaTriangulos.add(t2);
        listaTriangulos.add(t3);
        listaTriangulos.add(t4);
        
        System.out.println("------For-------");
        //recorrido por indice
        for (int i = 0; i < listaTriangulos.size(); i++) {
            
            System.out.println("Area del Triangulo " + listaTriangulos.get(i).getAreaT());
            
        }
        /*System.out.println("------Foreach-------");
        //recorrido foreach
        for (Triangulo triangulo : listaTriangulos) {
            System.out.println("Area del Triangulo " + triangulo.getAreaT());
        }*/
        System.out.println("-----------------");
        
        ArrayList<Double> areasTriangulos = new ArrayList<>();
        
        areasTriangulos.add(listaTriangulos.get(0).getAreaT());
        areasTriangulos.add(listaTriangulos.get(1).getAreaT());
        areasTriangulos.add(listaTriangulos.get(2).getAreaT());
        areasTriangulos.add(listaTriangulos.get(3).getAreaT());
        
        Double max = Collections.max(areasTriangulos);
        Double min = Collections.min(areasTriangulos);

        System.out.println("El area con valor máximo: " + max);
        System.out.println("El area con valor mínimo: " + min);
  
        
    }

}
