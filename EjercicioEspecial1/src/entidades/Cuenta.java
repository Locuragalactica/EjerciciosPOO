package entidades;

public class Cuenta {

    private String titular;
    private float cantidad;

    public Cuenta() {
    }

    public Cuenta(String titular, float cantidad) {
        this.titular = titular;
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }

}
