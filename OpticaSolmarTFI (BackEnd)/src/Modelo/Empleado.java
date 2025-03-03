package Modelo;

import java.util.Date;

public class Empleado {
    private String nombre;
    private String turno;
    private int lejajo;
    private Puesto puesto;

    public Empleado() {
    }

    public Empleado(String nombre, String turno, int lejajo, Puesto puesto) {
        this.nombre = nombre;
        this.turno = turno;
        this.lejajo = lejajo;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTurno() {
        return turno;
    }

    public int getLejajo() {
        return lejajo;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setLegajo(int lejajo) {
        this.lejajo = lejajo;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    
    public OrdenDeTrabajo crearOrdenDeTrabajo(
            Cliente cliente,
            Empleado vendedor,
            double senia,
            Date fechaEntrega,
            String profesional,
            Cristal cristalOIL,
            Cristal cristalODL,
            Cristal cristalOIC,
            Cristal cristalODC,
            Tratamiento tratamientoOIL,
            Tratamiento tratamientoODL,
            Tratamiento tratamientoOIC,
            Tratamiento tratamientoODC,
            Armazon armazonUno,
            Armazon armazonDos,
            ObraSocial obraSocial,
            double esfODL,
            double esfOIL,
            double esfODC,
            double esfOIC,
            double cilODL,
            double cilOIL,
            double cilODC,
            double cilOIC,
            double ejeODL,
            double ejeOIL,
            double ejeODC,
            double ejeOIC
    ) {
        
        OrdenDeTrabajo ot = new OrdenDeTrabajo(
                senia,
                fechaEntrega,
                this,
                cliente,
                obraSocial,
                profesional
        );
        
        ot.crearDetalleVista(
                Vista.LEJOS, 
                armazonUno, 
                esfOIL,
                cilOIL,
                ejeOIL,
                tratamientoOIL,
                cristalOIL,
                esfODL,
                cilODL,
                ejeODL,
                tratamientoODL,
                cristalODL
        );
        
        ot.crearDetalleVista(
                Vista.CERCA, 
                armazonDos,
                esfOIC,
                cilOIC,
                ejeOIC,
                tratamientoOIC,
                cristalOIC,
                esfODC,
                cilODC,
                ejeODC,
                tratamientoODC,
                cristalODC
        );
        
        return ot;
    }
}
