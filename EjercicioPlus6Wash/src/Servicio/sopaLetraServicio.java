/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.sopaLetra;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Estefania
 */
public class sopaLetraServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public sopaLetra crearSopaLetra(sopaLetra sp){
        llenarMatriz(sp);
        mostrarSopaLetra(sp);
        buscador(sp);
        reemplazar(sp);
        mostrarSopaLetra(sp);
        invertirSopaLetra(sp);
        return sp;
    }
    
    public void mostrarSopaLetra(sopaLetra sp){
        System.out.println("VISUALIZACIÓN MATRIZ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("["+sp.getMatriz()[i][j]+"]");
            }
            System.out.println("");
        }
    }
    public void invertirSopaLetra(sopaLetra sp) {
        System.out.println("MATRIZ INVERTIDA");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + sp.getMatriz()[j][i] + "]");
            }
            System.out.println("");
        }
    }
    public int[][] buscador(sopaLetra sp){
        System.out.println("BUSCADOR");
        int [][] pos = new int[1][3];
        int posX = 0, posY = 0, state = 0;
        String palabraBuscar, palabraArray;
        System.out.print("Ingrese la palabra a buscar: ");
        palabraBuscar = leer.next();

        for (int i = 0; i < 10; i++) {
            palabraArray = new String(sp.getMatriz()[i]);
            if (palabraArray.contains(palabraBuscar)){
                posX = i;
                posY = palabraArray.indexOf(palabraBuscar);
                state = 1;
                break;
            }
        }
        
        pos[0][0] = posX;
        pos[0][1] = posY;
        pos[0][2] = state;
        
        if (state == 1){
            System.out.println("La palabra '"+palabraBuscar+"' se encuentra en: ["+posX+"]["+posY+"]");
        }else{
            System.out.println("La palabra '"+palabraBuscar+"' no se encuentra.");
        }
        return pos;
    }

    public void reemplazar(sopaLetra sp) {
        System.out.println("REEMPLAZO");
        int[][] pos;
        char[] reemplaza;
        pos = buscador(sp);        
        if (pos[0][2] == 1) {
            System.out.print("Ingrese palabra a reemplazar: ");
            reemplaza = leer.next().toCharArray();
            for (int j = pos[0][1]; j < pos[0][1]+reemplaza.length; j++) {
                if (j<10) {
                    sp.getMatriz()[pos[0][0]][j] = reemplaza[j - pos[0][1]];
                }
            }
            System.out.println("Reemplazo Exitoso!");
        }else{
            System.out.println("No se pudo realizar el reemplazo!");
        }
        
    }
    
    public void llenarMatriz(sopaLetra sp) {
        char[][] matriz = new char[10][10];
        String[] palabrasPreestablecidas = {"perro", "gato", "tigre", "oso", "mono", "cebra", "jabali", "oso", "leon", "elefante"};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < palabrasPreestablecidas[i].length(); j++) {
                    matriz[i][j] = palabrasPreestablecidas[i].charAt(j);
            }
        }
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == 0) {
                    matriz[i][j] = (char) (random.nextInt(26) + 'a');
                }
            }
        }
        sp.setMatriz(matriz);
    }
}
