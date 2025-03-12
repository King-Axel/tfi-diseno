package Modelo;

public class DetalleOjo {
    private double esfera;
    private double cilindro;
    private double eje;
    private Ojo ojo;
    private Tratamiento tratamiento;
    private Cristal cristal;

    public DetalleOjo() {
    }

    public DetalleOjo(Ojo ojo, double esfera, double cilindro, double eje, Tratamiento tratamiento, Cristal cristal) {
        this.esfera = esfera;
        this.cilindro = cilindro;
        this.eje = eje;
        this.ojo = ojo;
        this.tratamiento = tratamiento;
        this.cristal = cristal;
    }

    public double getEsfera() {
        return esfera;
    }

    public double getCilindro() {
        return cilindro;
    }

    public double getEje() {
        return eje;
    }

    public Ojo getOjo() {
        return ojo;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public Cristal getCristal() {
        return cristal;
    }

    public double obtenerPrecioCristal() {
        return cristal.getPrecio();
    }
    
    public double obtenerPrecioTratamiento() {
        return tratamiento.getPrecio();
    }
    
    public void setOjo(Ojo ojo) {
        this.ojo = ojo;
    }

    public void setEsfera(double esfera) {
        this.esfera = esfera;
    }

    public void setCilindro(double cilindro) {
        this.cilindro = cilindro;
    }

    public void setEje(double eje) {
        this.eje = eje;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public void setCristal(Cristal cristal) {
        this.cristal = cristal;
    }
}
