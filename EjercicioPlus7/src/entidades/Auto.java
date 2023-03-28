package entidades;

import java.util.Date;

public class Auto {

    private String dueño, colorauto, modelo;
    private int KM = 7500, cantServ;
    private Date fechavenc;

    public Auto() {
    }

    public Auto(String dueño, String colorauto, String modelo, int cantServ, Date fechavenc) {
        this.dueño = dueño;
        this.colorauto = colorauto;
        this.modelo = modelo;
        this.cantServ = cantServ;
        this.fechavenc = fechavenc;
    }

    public int getCantServ() {
        return cantServ;
    }

    public void setCantServ(int cantServ) {
        this.cantServ = cantServ;
    }



    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getColorauto() {
        return colorauto;
    }

    public void setColorauto(String colorauto) {
        this.colorauto = colorauto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKM() {
        return KM;
    }

    public void setKM(int KM) {
        this.KM = KM;
    }

    public Date getFechavenc() {
        return fechavenc;
    }

    public void setFechavenc(Date fechavenc) {
        this.fechavenc = fechavenc;
    }

}
