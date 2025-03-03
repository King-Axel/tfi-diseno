package SistemasDistribuidos;

import Aplicacion.GestorCrearOrdenDeTrabajo;
import Aplicacion.OrdenDeTrabajoDTO;

import Modelo.Armazon;
import Modelo.Cliente;
import Modelo.Cristal;
import Modelo.ObraSocial;
import Modelo.Tratamiento;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorCrearOrdenDeTrabajo {
    private GestorCrearOrdenDeTrabajo gestor;

    public ControladorCrearOrdenDeTrabajo() {
        this.gestor = new GestorCrearOrdenDeTrabajo();
    }
    
    public void iniciarOrdenDeTrabajo() {
        ArrayList<Armazon> armazones = gestor.buscarArmazones();
        ArrayList<Cristal> cristales = gestor.buscarCristales();
        ArrayList<Tratamiento> tratamiento = gestor.buscarTratamientos();
        ArrayList<ObraSocial> obraSocial = gestor.buscarObrasSociales();
    }
    
    public void seleccionarCristal(int codigo) throws SQLException {
        Cristal cristal = gestor.buscarCristal(codigo);
        double precio = cristal.getPrecio();
    }
    
    public void seleccionarTratamiento(int codigo) throws SQLException {
        Tratamiento tratamiento = gestor.buscarTratamiento(codigo);
        double precion = tratamiento.getPrecio();
    }
    
    public void buscarCliente(int dni) throws SQLException {
        Cliente cliente = gestor.buscarCliente(dni);
    }
    
    public void seleccionarArmazon(int codigo) throws SQLException {
        Armazon armazon = gestor.buscarArmazon(codigo);
        double precio = armazon.getPrecio();
    }
    
    public void seleccionarObraSocial(int codigo) throws SQLException {
        ObraSocial obraSocial = gestor.buscarObraSocial(codigo);
        int descuento = obraSocial.getPorcentajeDescuento();
    }
    
    public void confirmarOrdenDeTrabajo(OrdenDeTrabajoDTO ordenTrabajo) throws SQLException {
        gestor.confirmarOrdenDeTrabajo(ordenTrabajo);
    }
}
