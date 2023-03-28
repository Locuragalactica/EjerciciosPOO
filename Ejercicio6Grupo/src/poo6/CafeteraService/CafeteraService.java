/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6.CafeteraService;

import poo6.entidades.Cafetera;

/**
 *
 * @author PAVILION
 */
public class CafeteraService {
    Cafetera cf1 = new Cafetera();
    public Cafetera llenarCafetera(){
        
        cf1.setCapacidadActual(cf1.getCapacidadMaxima());
        System.out.println("Se ha igualado la capacidad actual con la maxima");
    return cf1;
}
    public int servirTaza(int taza){
        System.out.println(""+taza);
        if (taza>cf1.getCapacidadActual()) {
            taza=cf1.getCapacidadActual();
        }
        System.out.println(""+taza);
            cf1.setCapacidadActual(cf1.getCapacidadActual()-taza);
            System.out.println(""+taza);
        return taza;
    }
    public void vaciarCafetera(){
        
        cf1.setCapacidadActual(0);
        System.out.println("Se ha vaciado la cafetera");
    }
    public void agregarCafe(int cafe){
        cf1.setCapacidadActual(cf1.getCapacidadActual()+cafe);
        System.out.println("Se ha agregado esta cantidad de cafe "+cf1.getCapacidadActual());
    }
}
