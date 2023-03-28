/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6grupo;

import poo6.entidades.Cafetera;
import java.util.Scanner;
import poo6.CafeteraService.CafeteraService;

/**
 *
 * @author PAVILION
 */
public class Ejercicio6Grupo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraService cfs = new CafeteraService();
        Cafetera cf2 = cfs.llenarCafetera();
       
        System.out.println("De que tamaño es la tasa que desea utilizar");
         int taza=leer.nextInt();
         int taza2=cfs.servirTaza(taza);
        if (taza==taza2) {
          System.out.println("Se lleno la tasa exitosamente");
        }else{
            System.out.println("No se lleno la tasa completamente, solo se pudo llenar con: "+taza2);
        }
        cfs.vaciarCafetera();
        System.out.println("Ingrese la cantidad de cafe que quiera añadir");
        int cafe = leer.nextInt();
        cfs.agregarCafe(cafe);
    }
    
}
