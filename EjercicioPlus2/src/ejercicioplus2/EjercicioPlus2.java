package ejercicioplus2;

import entidades.Tiempo;
import servicios.TiempoServicios;

public class EjercicioPlus2 {
    
    public static void main(String[] args) {
        /*
        Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
         */
        
        Tiempo t1 = new Tiempo();
        TiempoServicios ts = new TiempoServicios();
        
        ts.ingresarHora(t1);
        ts.imprimirHora(t1);
        ts.pasoTiempo(t1);
        
    }
    
}
