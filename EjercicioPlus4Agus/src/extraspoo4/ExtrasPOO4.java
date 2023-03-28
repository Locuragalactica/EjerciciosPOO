package extraspoo4;

import Entidad.Fecha;
import Servicio.FechaServicio;


public class ExtrasPOO4 {

   
    public static void main(String[] args) {
        FechaServicio fs = new FechaServicio();
        Fecha f1 = new Fecha();
        fs.menu(f1);
    }
    
}
