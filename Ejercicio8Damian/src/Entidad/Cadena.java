/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Dami
 */
public class Cadena {
    private String frase;
    private int tamaño;
    
    

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getTamaño() {
        return tamaño=frase.length();
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

   
}
