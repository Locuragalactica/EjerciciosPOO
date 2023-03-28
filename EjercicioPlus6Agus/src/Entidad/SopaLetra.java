package Entidad;

public class SopaLetra {
    private String [][] sopa;
    private String palabra;
    
    public SopaLetra() {
        sopa = new String [10][10];
    }

    public SopaLetra(String[][] sopa, String palabra) {
        this.sopa = sopa;
        this.palabra = palabra;
    }

    public String[][] getSopa() {
        return sopa;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setSopa(String[][] sopa) {
        this.sopa = sopa;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
}
