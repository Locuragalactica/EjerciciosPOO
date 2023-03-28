package entidades;

public class Sopa {

    String[][] sopal = new String[10][10];
    String palabra;

    public Sopa() {
    }

    public Sopa(String palabra) {
        this.palabra = palabra;
    }

    public String[][] getSopal() {
        return sopal;
    }

    public void setSopal(String[][] sopal) {
        this.sopal = sopal;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

}
