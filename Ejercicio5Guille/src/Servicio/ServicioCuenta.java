/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author checho
 */
public class ServicioCuenta {

    Scanner leer = new Scanner(System.in);
    Cuenta cc = new Cuenta();

    public Cuenta CrearCuenta() {
        System.out.println("Ingrese su numero de cuenta: ");
        cc.setNumerodecuenta(leer.nextInt());
        System.out.println("Ingrese su numero de dni: ");
        cc.setDni(leer.nextLong());
        System.out.println("Ingrese su Saldo actual: ");
        cc.setSaldoactual(leer.nextInt());

        return cc;
    }

    public double Ingresar(Cuenta cc) {
        System.out.println("Ingrese el monto a ingresar: ");
        double ingreso = leer.nextDouble();
        double saldo = cc.getSaldoactual();
        saldo += ingreso;
        cc.setSaldoactual((int) saldo);
        return saldo;
    }

    public void Retirar(Cuenta cc) {
        System.out.println("Ingrese el monto a retirar");
        double retiro = leer.nextDouble();
        double saldo = cc.getSaldoactual();
        saldo -= retiro;
        cc.setSaldoactual((int) saldo);
    }

    public void extraccionRapida(Cuenta cc) {
        boolean a = true;
        do {

            System.out.println("Ingrese el monto a retirar: ");
            double retiro = leer.nextDouble();
            double saldo = cc.getSaldoactual();
            double porsen = 20 * saldo / 100;
            if (retiro <= porsen) {
                saldo -= retiro;
                cc.setSaldoactual((int) saldo);
                System.out.println("Su Salto actual es de: " + cc.getSaldoactual());
                a = false;
            } else {
                System.out.println("El monto de: " + retiro + " supera el limite diario a retirar que es de: " + porsen);
            }
        } while (a != false);
    }

    public void consultarSaldo(Cuenta cc) {
        System.out.println("Su saldo actual es de :" + cc.getSaldoactual());
    }

    public void consultarDatos(Cuenta cc) {
        System.out.println("Su numero de cuenta es : " + cc.getNumerodecuenta());
        System.out.println("Su dni : " + cc.getDni());
    }

    public void opciones() {
        int opc;
        String confi = "n";
        do {
            System.out.println("MENU");
            System.out.println("1.Ingresar");
            System.out.println("2. Extraccion");
            System.out.println("3. Extraccion Rapida");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("6. Salir");
            System.out.println("Elija opción:");
            opc = leer.nextInt();
            if (opc == 6) {
                do {
                    System.out.println("¿estas seguro de que quieres salir del programa? (s/n)");
                    confi = leer.next();
                } while (!confi.equalsIgnoreCase("n") && !confi.equalsIgnoreCase("s"));
                if (confi.equals("s")) {
                    break;
                } else {
                }
                continue;
            }
            if (opc > 0 && opc <= 6) {
                switch (opc) {
                    case 1:
                        this.Ingresar(cc);
                        break;
                    case 2:
                        this.Retirar(cc);
                        break;
                    case 3:
                        this.extraccionRapida(cc);
                        break;
                    case 4:
                        this.consultarSaldo(cc);
                        break;
                    case 5:
                        this.consultarDatos(cc);
                        break;
                }
            }
        } while (confi.equals("n"));
        System.out.println("El programa a terminado");
    }
}
