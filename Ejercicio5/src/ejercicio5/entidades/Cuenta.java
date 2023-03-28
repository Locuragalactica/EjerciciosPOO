package ejercicio5.entidades;

import java.util.Scanner;

public class Cuenta {

    Scanner leer = new Scanner(System.in);
    private int numeroCuenta, dni, saldoactual;
    private double interes;

    //a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int dni, int saldoactual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoactual = saldoactual;
        this.interes = interes;
    }

    //b) Agregar los métodos getters y setters correspondientes
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(int saldoactual) {
        this.saldoactual = saldoactual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    //c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public void crearCuenta() {
        System.out.println("Ingrese su Dni");
        dni = leer.nextInt();
        System.out.println("Ingrese su numero de cuenta");
        numeroCuenta = leer.nextInt();
        saldoactual = (int) (Math.random() * 99999);
        System.out.println("Su saldo actual es de: "+saldoactual);
    }

    //d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
    public double ingresar(double ingreso) {
        
        saldoactual += ingreso;

        return saldoactual;
    }

    /*
    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
    la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    pondrá el saldo actual en 0.
     */
    public double retiro(double retiro) {
        

        if (retiro > saldoactual) {
            System.out.println("Usted no posee fondos suficientes. Ha retirado todo su dinero que es: "+saldoactual);
            saldoactual = 0;
        } else {
            saldoactual -= retiro;
        }
        return saldoactual;
    }

    /*
    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    usuario no saque más del 20%.
     */
    public double extraccionRapida() {
        double retiro;
        System.out.println("Digite la cantidad a retirar en su extracción rapida. \n"
                + "Recuerde que solo puede sacar hasta un 20%");
        retiro = leer.nextDouble();
        while (retiro > saldoactual * 0.2) {
            System.out.println("Error, recuerde que puede retirar unicamente hasta el 20%");
            retiro = leer.nextDouble();
        }
        saldoactual -= retiro;

        return saldoactual;
    }

    //g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo() {
        System.out.println("Su saldo actual es: " + saldoactual);
    }

    public void consultarDatos() {
        System.out.println("Su DNI es: " + dni + "\n"
                + "Su numero de cuenta es: " + numeroCuenta + "\n"
                + "Su saldo actual es: " + saldoactual);
    }

}
