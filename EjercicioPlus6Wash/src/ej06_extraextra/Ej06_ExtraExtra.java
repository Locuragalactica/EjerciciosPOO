/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej06_extraextra;

import Entidad.sopaLetra;
import Servicio.sopaLetraServicio;

/**
 *
 * @author Estefania
 */
public class Ej06_ExtraExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       sopaLetraServicio ss = new sopaLetraServicio();
       sopaLetra sp = new sopaLetra();
       ss.crearSopaLetra(sp);
    }
    
}
