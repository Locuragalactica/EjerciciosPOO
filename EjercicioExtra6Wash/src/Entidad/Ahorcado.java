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
public class Ahorcado {
    private char[] palabra;
    private int encontradas;
    private int maxIntentos;

    public Ahorcado() {
        // constructor vacío
    }

    public Ahorcado(String palabra, int encontradas, int maxIntentos) {
        this.palabra = palabra.toCharArray();
        this.encontradas = encontradas;
        this.maxIntentos = maxIntentos;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra.toCharArray();
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getMaxIntentos() {
        return maxIntentos;
    }

    public void setMaxIntentos(int maxIntentos) {
        this.maxIntentos = maxIntentos;
    }
}
