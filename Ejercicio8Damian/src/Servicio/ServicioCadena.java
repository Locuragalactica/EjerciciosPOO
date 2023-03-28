/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Dami
 */
public class ServicioCadena {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    public void mostrarVocales(Cadena letras){
     int cont=0;
        for (int i = 0; i < letras.getTamaño(); i++) {
            char vocal=letras.getFrase().charAt(i);
            
            if(vocal=='a' || vocal=='e'|| vocal=='i'|| vocal=='o'|| vocal=='u'){
                cont++;
        
            } 
         
        }
        System.out.println("La frase o palabra ingresada tiene: " + cont + " vocales");
        
    }
    public void invertirFrase(Cadena letras){
        String lt="";
        for (int i = letras.getTamaño()-1; i >= 0; i--) {
            char letra=letras.getFrase().charAt(i);
            lt=lt.concat(String.valueOf(letra));
            
        }
        System.out.println("La frase o palabra al reves es:" + lt );
    }
    public void vecesRepetido(Cadena letras){
        
        System.out.println("Ingresa un letra que quieras buscar");
        char letra =leer.next().charAt(0);
        int cont=0;
        for (int i = 0; i <letras.getTamaño() ; i++){
            char letra1=letras.getFrase().charAt(i);
            if (letra1== letra){
                cont++;
                
            }
        }    
        System.out.println("Letra buscada se repite:" + cont);
    }  
    public void comparLongitud(Cadena letras){
        System.out.println("Ingrese una nueva frase");
        String nfrase=leer.next();
        
        int nf=nfrase.length();
        
        if (nf==letras.getTamaño()){
            System.out.println("Tienen la misma longitud");
        }else {
            System.out.println("La nueva frase no tiene la misma cantidad de caracteres que la prime frase");
            
            
        }
        
    }
    public void unirFrases(Cadena letras){
        System.out.println("Ingrese una nueva frase o palabra");
        String nfrase=leer.next();
        
        String n1=letras.getFrase().concat(String.valueOf(nfrase));
        System.out.println(n1);
        
    }
    public void reemplazar(Cadena letras){
        String nletra, nfrase="";
        
        System.out.println("Ingrese una letra");
        nletra=leer.next();
        
        /*replace(char oldChar, char newChar
        Retorna una nueva cadena

        reemplazando los caracteres del primer
        parámetro con el carácter del segundo
        parámetro
        */
        for (int i = 0; i <letras.getTamaño(); i++) {
            if(letras.getFrase().substring(i,i+1).equals(nletra)){
                nfrase=nfrase.concat("*");
                
            }else{
                nfrase=nfrase.concat(letras.getFrase().substring(i,i+1));
            }
        }
        System.out.println("Nueva frase "+ nfrase);
                

        
    }
    public void contiene(Cadena letras){
        String nletra;
        boolean frase=false;
        System.out.println("Ingrese una caracter");
        nletra=leer.next();
         for (int i = 0; i <letras.getTamaño(); i++) {
            if(letras.getFrase().substring(i,i+1).equals(nletra)){
                
             frase=true;
             System.out.println("Su caracter se encuentra contenido");
             break;
             
            }
         }
         System.out.println("Su caracter no se encuentra contenido");
         
    }
}
