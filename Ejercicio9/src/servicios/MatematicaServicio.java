package servicios;

import entidades.Matematica;

public class MatematicaServicio {

    float mayor, menor, potencia;

    public void declararNumeros(Matematica m1) {

        mayor = Math.max(m1.getNum1(), m1.getNum2());
        menor = Math.min(m1.getNum1(), m1.getNum2());
    }

    /*
    a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
     */
    public void devolverMayor(Matematica m1) {

        System.out.println("Su numero: " + mayor + " es mayor que su numero: " + menor);

    }

    /*
    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    elevado al menor número. Previamente se deben redondear ambos valores.
     */
    public void calcularPotencia() {
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        potencia = (float) Math.pow(mayor, menor);

        System.out.println("La potencia de: " + mayor + " elevada a: " + menor + " es de: " + potencia);

    }

    /*
Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
     */
    public void calculaRaiz() {

        menor = Math.abs(menor);
        System.out.println("La raiz cuadrada de su numero: " + menor + " es de: " + (Math.sqrt(menor)));
    }

}
