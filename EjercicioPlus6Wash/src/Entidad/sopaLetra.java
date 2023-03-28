/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Estefania
 */
public class sopaLetra {
    private char[][] matriz;
    private String palabra;

    public sopaLetra(char[][] matriz, String palabra) {
        this.matriz = matriz;
        this.palabra = palabra;
    }

    public sopaLetra() {
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    
}
