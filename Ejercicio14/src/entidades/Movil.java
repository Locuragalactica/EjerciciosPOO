package entidades;

import java.util.Arrays;

public class Movil {

    private String marca;
    private int precio, memoriaRam, almacenamiento;
    private String[] codigo = new String[7];

    //Un constructor por defecto.
    public Movil() {
    }

    // Un constructor con todos los atributos como parámetro.
    public Movil(String marca, int precio, int memoriaRam, int almacenamiento) {
        this.marca = marca;
        this.precio = precio;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
    }

    //Métodos getters y setters de cada atributo.
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String[] getCodigo() {
        return codigo;
    }

    public void setCodigo(String[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", precio=" + precio + ", memoriaRam=" + memoriaRam + ", almacenamiento=" + almacenamiento + ", codigo=" + Arrays.toString(codigo) + '}';
    }

}
