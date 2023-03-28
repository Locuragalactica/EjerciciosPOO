/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8poo;

import Entidad.Cadena;
import Servicio.ServicioCadena;
import java.util.Scanner;

/**
 *
 * @author Dami
 */
public class Ejercicio8POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Cadena palabra=new Cadena();
        ServicioCadena Sc=new ServicioCadena();
        
       
        System.out.println("Ingrese una palabra o frase");
        palabra.setFrase(leer.nextLine());
        
        System.out.println(palabra.getTamaño());
        Sc.mostrarVocales(palabra);
        Sc.invertirFrase(palabra);
        Sc.vecesRepetido(palabra);
        Sc.comparLongitud(palabra);
        Sc.unirFrases(palabra);
        Sc.reemplazar(palabra);
        Sc.contiene(palabra);
    }
    
}
