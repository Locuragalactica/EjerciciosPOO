package ejercicio6.entidades;

import java.util.Scanner;

public class Cafetera {

    private int capacidadMaxima = 2000, cantidadActual, taza;
    Scanner leer = new Scanner(System.in);

    //Constructor predeterminado o vacío ✔
    public Cafetera() {
    }

    //Constructor con la capacidad máxima y la cantidad actual ✔
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    //Métodos getters y setters. ✔
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. ✔
    public void llenarCafetera() {
        System.out.println("La cafetera se ha llenado");
        cantidadActual = capacidadMaxima;
        System.out.println("La carga de la cafetera es de: 2000ml.");
    }

    /*
    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    cuanto quedó la taza. ✔
     */
    public int servirTaza(int taza) {

        if (cantidadActual < taza) {
            taza = cantidadActual;
            cantidadActual = 0;
            if (taza == 0) {
                System.out.println("No hay cafe");
            } else {
                System.out.println("Su taza no sea ha podido llenar, se ha cargado con: " + taza + "ml.");
                System.out.println("La cafetera quedo con: " + cantidadActual + "ml");
            }

        } else {
            cantidadActual -= taza;
            System.out.println("Su taza se ha llenado con " + taza + "ml.");
            System.out.println("La cafetera quedo con: " + cantidadActual + "ml");
        }

        return cantidadActual;
    }

    //Método vaciarCafetera(): pone la cantidad de café actual en cero. ✔
    public void vaciarCafetera() {
        System.out.println("La cafetera se ha vaciado");
        cantidadActual = 0;
    }

    /*
    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    recibe y se añade a la cafetera la cantidad de café indicada.✔
     */
    public int agregarCafe(int taza) {
        cantidadActual += taza;

        return cantidadActual;
    }

}
