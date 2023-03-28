

package entidades;


public class NIF {
private int DNI;
private String let;

    public NIF() {
    }

    public NIF(int DNI, String let) {
        this.DNI = DNI;
        this.let = let;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getLet() {
        return let;
    }

    public void setLet(String let) {
        this.let = let;
    }

  
    
    
}
