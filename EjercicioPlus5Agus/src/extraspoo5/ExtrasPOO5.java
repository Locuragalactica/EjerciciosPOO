package extraspoo5;

import Entidad.Triangulo;
import Servicio.TrianguloServicio;

public class ExtrasPOO5 {

    public static void main(String[] args) {
        TrianguloServicio ts = new TrianguloServicio();
        //Objeto array de dimensión 4 
        Triangulo t1 [] = new Triangulo[4];
        for (int i = 0; i <4 ; i++) {
            t1[i]=new Triangulo();
        }
        ts.mostrar(t1);
    }
    
}
