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
    
    public DetalleVista(
            Vista vista,
            Armazon armazon,
            double esfOI,
            double cilOI,
            double ejeOI,
            Cristal cristalOI,
            Tratamiento tratamientoOI,
            double esfOD,
            double cilOD,
            double ejeOD,
            Cristal cristalOD,
            Tratamiento tratamientoOD
    ) {
        this.vista = vista;
        this.armazon = armazon;
        
        if (cristalOI != null && tratamientoOI != null) {
            detalleOjoIzquierdo = new DetalleOjo(
                Ojo.IZQUIERDO,
                esfOI,
                cilOI,
                ejeOI,
                tratamientoOI,
                cristalOI
            );
        }
        
        if (cristalOD != null && tratamientoOD != null) {
            detalleOjoDerecho = new DetalleOjo(
                Ojo.DERECHO,
                esfOD,
                cilOD,
                ejeOD,
                tratamientoOD,
                cristalOD
            );
        }
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
}
