/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer5cuenta;

import Entidad.Cuenta;
import Servicio.ServicioCuenta;
import java.util.Scanner;

/**
 *
 * @author checho
 */
public class Ejer5Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioCuenta cc = new ServicioCuenta();
        Cuenta ct = cc.CrearCuenta();
        cc.opciones();
    }
}
