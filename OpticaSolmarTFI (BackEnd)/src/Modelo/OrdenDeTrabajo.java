package Modelo;

import java.util.Date;

public class OrdenDeTrabajo {
    private int numero;
    private Date fechaCreacion;
    private EstadoOrdenDeTrabajo estado;
    private double senia;
    private Date fechaEntregaEstimada;
    private Empleado vendedor;
    private Cliente cliente;
    private ObraSocial obraSocial;
    private DetalleVista detalleVistaCerca;
    private DetalleVista detalleVistaLejos;
    private String profesional;

    public OrdenDeTrabajo() {
    }
    
    public OrdenDeTrabajo(  
        double senia, 
        Date fechaEntregaEstimada, 
        Empleado vendedor, 
        Cliente cliente, 
        ObraSocial obraSocial, 
        DetalleVista detalleVistaCerca, 
        DetalleVista detalleVistaLejos,
        String profesional
    ) {
        this.senia = senia;
        this.fechaEntregaEstimada = fechaEntregaEstimada;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.obraSocial = obraSocial;
        this.detalleVistaCerca = detalleVistaCerca;
        this.detalleVistaLejos = detalleVistaLejos;
        this.profesional = profesional;
        
        estado = EstadoOrdenDeTrabajo.GENERADA;        
    }

    public OrdenDeTrabajo(
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
        this.estado = EstadoOrdenDeTrabajo.GENERADA;
        this.senia = senia;
        this.fechaEntregaEstimada = fechaEntrega;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.obraSocial = obraSocial;
        detalleVistaLejos = null;
        detalleVistaCerca = null;
        this.profesional = profesional;
        
        if (
                cristalOIL != null && 
                tratamientoOIL != null &&
                cristalODL != null & 
                tratamientoODL != null
            ) {
            
            detalleVistaLejos = new DetalleVista(
                    Vista.LEJOS,
                    armazonUno,
                    esfOIL,
                    cilOIL,
                    ejeOIL,
                    cristalOIL,
                    tratamientoOIL,
                    esfODL,
                    cilODL,
                    ejeODL,
                    cristalODL,
                    tratamientoODL
            );
        }
        
        if (
                cristalOIC != null && 
                tratamientoOIC != null &&
                cristalODC != null & 
                tratamientoODC != null
            ) {
            
            detalleVistaLejos = new DetalleVista(
                    Vista.CERCA,
                    armazonDos,
                    esfOIC,
                    cilOIC,
                    ejeOIC,
                    cristalOIC,
                    tratamientoOIC,
                    esfODC,
                    cilODC,
                    ejeODC,
                    cristalODC,
                    tratamientoODC
            );
        }
    }
    
    public int getNumero() {
        return numero;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public EstadoOrdenDeTrabajo getEstado() {
        return estado;
    }

    public double getSenia() {
        return senia;
    }

    public Date getFechaEntregaEstimada() {
        return fechaEntregaEstimada;
    }

    public Empleado getVendedor() {
        return vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public DetalleVista getDetalleVistaCerca() {
        return detalleVistaCerca;
    }

    public DetalleVista getDetalleVistaLejos() {
        return detalleVistaLejos;
    }
    
    public String getProfesional() {
        return profesional;
    }
}
