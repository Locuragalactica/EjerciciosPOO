/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author checho
 */
public class Cuenta {
    private int numerodecuenta;
    private long dni;
    private int saldoactual;

    public Cuenta(int numerodecuenta, long dni, int saldoactual) {
        this.numerodecuenta = numerodecuenta;
        this.dni = dni;
        this.saldoactual = saldoactual;
    }

    public Cuenta() {
    }

    public void setNumerodecuenta(int numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoactual(int saldoactual) {
        this.saldoactual = saldoactual;
    }

    public int getNumerodecuenta() {
        return numerodecuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldoactual() {
        return saldoactual;
    }
    
}
