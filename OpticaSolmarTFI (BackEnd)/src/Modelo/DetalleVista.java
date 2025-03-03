package Modelo;

public class DetalleVista {
    private Vista vista;
    private Armazon armazon;
    private DetalleOjo detalleOjoIzquierdo;
    private DetalleOjo detalleOjoDerecho;

    public DetalleVista() {
    }

    public DetalleVista(Vista vista, Armazon armazon) {
        this.vista = vista;
        this.armazon = armazon;
    }
    
    public DetalleVista(Vista vista, Armazon armazon, DetalleOjo detalleOjoIzquierdo, DetalleOjo detalleOjoDerecho) {
        this.vista = vista;
        this.armazon = armazon;
        this.detalleOjoIzquierdo = detalleOjoIzquierdo;
        this.detalleOjoDerecho = detalleOjoDerecho;
        
       detalleOjoIzquierdo.setOjo(Ojo.IZQUIERDO);
       detalleOjoDerecho.setOjo(Ojo.DERECHO);
    }

    public Vista getVista() {
        return vista;
    }

    public Armazon getArmazon() {
        return armazon;
    }

    public DetalleOjo getDetalleOjoIzquierdo() {
        return detalleOjoIzquierdo;
    }

    public DetalleOjo getDetalleOjoDerecho() {
        return detalleOjoDerecho;
    }
    
    public double obtenerPrecioCristalIzq() {
        return detalleOjoIzquierdo.obtenerPrecioCristal();
    }
    
    public double obtenerPrecioCristalDer() {
        return detalleOjoDerecho.obtenerPrecioCristal();
    }
    
    public double obtenerPrecioTratamientoIzq() {
        return detalleOjoIzquierdo.obtenerPrecioTratamiento();
    }
    
    public double obtenerPrecioTratamientoDer() {
        return detalleOjoDerecho.obtenerPrecioTratamiento();
    }
    
    public double obtenerPrecioArmazon() {
        return armazon.getPrecio();
    }
    
    public void setVista(Vista vista) {
        this.vista = vista;
    }
    
    public void setArmazon(Armazon armazon) {
        this.armazon = armazon;
    }

    public void setDetalleOjoIzquierdo(DetalleOjo detalleOjoIzquierdo) {
        this.detalleOjoIzquierdo = detalleOjoIzquierdo;
    }

    public void setDetalleOjoDerecho(DetalleOjo detalleOjoDerecho) {
        this.detalleOjoDerecho = detalleOjoDerecho;
    }
    
    public void crearDetalleOjo(
            double esfera,
            double cilindro,
            double eje,
            Tratamiento tratamiento,
            Cristal cristal,
            Ojo ojo
    ) {
        
        DetalleOjo dOjo = new DetalleOjo();
        dOjo.setEsfera(esfera);
        dOjo.setCilindro(cilindro);
        dOjo.setEje(eje);
        dOjo.setTratamiento(tratamiento);
        dOjo.setCristal(cristal);
        dOjo.setOjo(ojo);
        
        if (ojo == Ojo.IZQUIERDO) {
            detalleOjoIzquierdo = dOjo;
        } else {
            detalleOjoDerecho = dOjo;
        }
    }
}
