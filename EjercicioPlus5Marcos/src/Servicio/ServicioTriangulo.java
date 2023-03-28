package Servicio;

import Entidad.Triangulo;
import java.util.Scanner;

public class ServicioTriangulo {
    
    Scanner leer = new Scanner(System.in);
    
    public void crearTriangulo(Triangulo t1) {
        
        System.out.println("Ingrese los datos de triangulo isósceles");
        System.out.println("Lado que se repite:");
        System.out.print("Lado A: ");
        t1.setLadoA(leer.nextDouble());
        
        System.out.println("Lado desigual o base:");
        System.out.print("Lado B: ");
        t1.setLadoB(leer.nextDouble());
           
    }
    
    public void calcularArea(Triangulo t1) {
        
        double areaTriangulo = ((t1.getLadoB() *  Math.sqrt(Math.pow(t1.getLadoA(), 2) - ((Math.pow(t1.getLadoB(), 2)/4))))/2);
        
        System.out.println("El area del triangulo isosceles es " + areaTriangulo);
        
        t1.setAreaT(areaTriangulo);
        
    }
    
    public void calcularPerimetro(Triangulo t1) {
        
        double perimetroTriangulo = (2 * t1.getLadoA()) + t1.getLadoB();
        
        System.out.println("El perimetro del triangulo isosceles es " + perimetroTriangulo);
        
        t1.setPerimetroT(perimetroTriangulo);
        
    }
    
    public void opcionesMetodos(Triangulo t1) {
        
        int opcion;
        String confirma = "n";

        do {
            System.out.println("----------------------------");
            System.out.println("Menu del triangulo isósceles");
            System.out.println("1.Crear triangulo");
            System.out.println("2.Calcular area");
            System.out.println("3.Calcular perimetro");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            opcion = leer.nextInt();

            if (opcion == 4) {
                do {
                    System.out.println("¿Estas seguro que quieres salir del programa? (s/n)");
                    confirma = leer.next();
                    if (confirma.equals("s")) {
                        break;
                    }              
                } while (!confirma.equalsIgnoreCase("n") && !confirma.equalsIgnoreCase("s"));
            }
            if (opcion > 0 && opcion < 4) {
                switch (opcion) {
                    case 1:
                        crearTriangulo(t1);
                        break;
                    case 2:
                        calcularArea(t1);
                        break;
                    case 3:
                        calcularPerimetro(t1);
                        break;
                }
            }
        } while (confirma.equals("n"));

        System.out.println("El programa a terminado");
    }
    

}
