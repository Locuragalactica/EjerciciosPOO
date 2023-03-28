package Entidad;

public class Triangulo {

    //Atributos
    private double ladoA; //lado que se repite
    private double ladoB; //lado desigual o base
    private double AreaT;
    private double perimetroT;

    //Constructores
    public Triangulo() {
    }

    public Triangulo(double ladoA, double ladoB, double AreaT, double perimetroT) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.AreaT = AreaT;
        this.perimetroT = perimetroT;
    }

    //Getter y Setter
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getAreaT() {
        return AreaT;
    }

    public void setAreaT(double AreaT) {
        this.AreaT = AreaT;
    }

    public double getPerimetroT() {
        return perimetroT;
    }

    public void setPerimetroT(double perimetroT) {
        this.perimetroT = perimetroT;
    }
    
    

   
    
}
