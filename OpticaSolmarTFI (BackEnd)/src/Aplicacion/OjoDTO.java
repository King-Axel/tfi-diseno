package Aplicacion;

import Modelo.Ojo;

public class OjoDTO {
    private double esfera;
    private double eje;
    private double cilindro;
    private Ojo ojo;

    public OjoDTO() {
    }

    public OjoDTO(double esfera, double eje, double cilindro, Ojo ojo) {
        this.esfera = esfera;
        this.eje = eje;
        this.cilindro = cilindro;
        this.ojo = ojo;
    }

    public Ojo getOjo() {
        return ojo;
    }

    public void setOjo(Ojo ojo) {
        this.ojo = ojo;
    }

    public double getEsfera() {
        return esfera;
    }

    public void setEsfera(double esfera) {
        this.esfera = esfera;
    }

    public double getEje() {
        return eje;
    }

    public void setEje(double eje) {
        this.eje = eje;
    }

    public double getCilindro() {
        return cilindro;
    }

    public void setCilindro(double cilindro) {
        this.cilindro = cilindro;
    }
    
    
}
