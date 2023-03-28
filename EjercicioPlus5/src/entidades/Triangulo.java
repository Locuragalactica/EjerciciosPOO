package entidades;

public class Triangulo {

    private int lados, base;

    public Triangulo() {
    }

    public Triangulo(int lados, int base) {
        this.lados = lados;
        this.base = base;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Lados=" + lados + "cms" + ", Base=" + base + "cms";
    }

}
