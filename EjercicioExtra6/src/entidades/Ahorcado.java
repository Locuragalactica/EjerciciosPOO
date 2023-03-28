

package entidades;


public class Ahorcado {
String [] palabra; 
int letenc, jugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letenc, int jugadas) {
        this.palabra = palabra;
        this.letenc = letenc;
        this.jugadas = jugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetenc() {
        return letenc;
    }

    public void setLetenc(int letenc) {
        this.letenc = letenc;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }
    


}
