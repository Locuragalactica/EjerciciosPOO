package Entidad;

public class Triangulo {
    private int ladosI;
    private int base;

    public Triangulo() {
    }

    public Triangulo(int ladosI, int base) {
        this.ladosI = ladosI;
        this.base = base;
    }

    public float getLadosI() {
        return ladosI;
    }

    public float getBase() {
        return base;
    }

    public void setLadosI(int ladosI) {
        this.ladosI = ladosI;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "ladosI=" + ladosI + ", base=" + base + '}';
    }
    
}
