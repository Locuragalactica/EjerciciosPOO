package entidades;

public class Tiempo {

    private int hs, min, seg;

    public Tiempo() {
    }

    public Tiempo(int hs, int min, int seg) {
        this.hs = hs;
        this.min = min;
        this.seg = seg;
    }

    public int getHs() {
        return hs;
    }

    public void setHs(int hs) {
        this.hs = hs;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

}
