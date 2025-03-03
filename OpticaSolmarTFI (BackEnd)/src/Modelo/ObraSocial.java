package Modelo;

public class ObraSocial {
    private int codigo;
    private String nombre;
    private int porcentajeDescuento;

    public ObraSocial() {
    }

    public ObraSocial(int codigo, String nombre, int porcentajeDescuento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
