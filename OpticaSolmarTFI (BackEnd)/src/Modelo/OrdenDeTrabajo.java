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
           String profesional
   ) {
       this.senia = senia;
       this.fechaEntregaEstimada = fechaEntregaEstimada;
       this.vendedor = vendedor;
       this.cliente = cliente;
       this.obraSocial = obraSocial;
       this.profesional = profesional;
       
       estado = EstadoOrdenDeTrabajo.GENERADA;
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
    
    public void crearDetalleVista(
            Vista vista, 
            Armazon armazon,
            double esferaIzq,
            double cilindroIzq,
            double ejeIzq,
            Tratamiento tratamientoIzq,
            Cristal cristalIzq,
            double esferaDer,
            double cilindroDer,
            double ejeDer,
            Tratamiento tratamientoDer,
            Cristal cristalDer
    ) {
        
        if (
                tratamientoIzq != null && 
                tratamientoDer != null &&
                cristalIzq != null &&
                cristalDer != null
        ) {
            DetalleVista dv = new DetalleVista(vista, armazon);
        
            dv.crearDetalleOjo(
                    esferaIzq,
                    cilindroIzq,
                    ejeIzq,
                    tratamientoIzq,
                    cristalIzq,
                    Ojo.IZQUIERDO
            );

            dv.crearDetalleOjo(
                    esferaDer,
                    cilindroDer,
                    ejeDer,
                    tratamientoDer,
                    cristalDer,
                    Ojo.DERECHO
            );

            if (vista == Vista.CERCA) {
                detalleVistaCerca = dv;
            } else {
                detalleVistaLejos = dv;
            }
        }
    }
}
