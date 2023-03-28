package ejercicioextra1;

import entidades.Cancion;
import servicios.CancionServicio;

public class EjercicioExtra1 {

    public static void main(String[] args) {
        /*
        Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
         */     
        
        Cancion c1 = new Cancion();
        CancionServicio cs = new CancionServicio();
        
        cs.ingresarCancion(c1);
        
    }

}
