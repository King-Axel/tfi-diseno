package Aplicacion;

import Modelo.Armazon;
import Modelo.Cristal;
import Modelo.Tratamiento;
import Modelo.ObraSocial;
import Modelo.Cliente;
import Modelo.DetalleOjo;
import Modelo.DetalleVista;
import Modelo.Empleado;
import Modelo.Ojo;
import Modelo.OrdenDeTrabajo;
import Modelo.Vista;

import Persistencia.Repositorio;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

public class GestorCrearOrdenDeTrabajo {
    private Repositorio repositorio;
    private Sesion sesion;
    
    public GestorCrearOrdenDeTrabajo() {
        this.repositorio = Repositorio.getInstance();
        this.sesion = Sesion.getInstance();
    }
    
    public ArrayList<Armazon> buscarArmazones(){
        return repositorio.buscarArmazones();
    }
    
    public ArrayList<Cristal> buscarCristales(){
        return repositorio.buscarCristales();
    }
    
    public ArrayList<Tratamiento> buscarTratamientos(){
        return repositorio.buscarTratamientos();
    }
    
    public ArrayList<ObraSocial> buscarObrasSociales(){
        return repositorio.buscarObrasSociales();
    }
    
    public Armazon buscarArmazon(int codigo) throws SQLException{
        return repositorio.buscarArmazon(codigo);
    }
    
    public Cristal buscarCristal(int codigo) throws SQLException {
        return repositorio.buscarCristal(codigo);
    }
    
    public Tratamiento buscarTratamiento(int codigo) throws SQLException {
        return repositorio.buscarTratamiento(codigo);
    }
    
    public ObraSocial buscarObraSocial(int codigo) throws SQLException {
        return repositorio.buscarObraSocial(codigo);
    }
    
    public Cliente buscarCliente(int dni) throws SQLException {
        return repositorio.buscarCliente(dni);
    }
    
    public Cliente buscarOGuardarCliente(ClienteDTO cliente) throws SQLException {
        Cliente cl = repositorio.buscarCliente(cliente.getDni());
        
        if (cl == null) {
            cl = new Cliente(
                    cliente.getNombre(), 
                    cliente.getApellido(), 
                    cliente.getDni(), 
                    cliente.getDomicilio(), 
                    cliente.getLocalidad(), 
                    cliente.getTelefono(), 
                    cliente.getEmail());
            
            repositorio.guardarCliente(cl);
        }
        
        return cl;
    }
    
    public void confirmarOrdenDeTrabajo(OrdenDeTrabajoDTO ordenTrabajo) throws SQLException {
        ClienteDTO cliente = ordenTrabajo.getClienteDTO();
        CodigosDTO codigos = ordenTrabajo.getCodigosDTO();
        VistaDTO lejos = ordenTrabajo.getLejosDTO();
        VistaDTO cerca = ordenTrabajo.getCercaDTO();
    
        OjoDTO lejosIzq = lejos.getIzquierdo();
        OjoDTO lejosDer = lejos.getDerecho();
        OjoDTO cercaIzq = cerca.getIzquierdo();
        OjoDTO cercaDer = cerca.getDerecho();
        
        Cliente clienteOT = buscarOGuardarCliente(cliente);
        
        Empleado empleado = sesion.getEmpleado();
        
        Cristal cOIL = repositorio.buscarCristal(codigos.getCristalOIL());
        Cristal cODL = repositorio.buscarCristal(codigos.getCristalODL());
        Cristal cOIC = repositorio.buscarCristal(codigos.getCristalOIC());
        Cristal cODC = repositorio.buscarCristal(codigos.getCristalODC());       
        
        Tratamiento tOIL = repositorio.buscarTratamiento(codigos.getTratamientoOIL());
        Tratamiento tODL = repositorio.buscarTratamiento(codigos.getTratamientoODL());
        Tratamiento tOIC = repositorio.buscarTratamiento(codigos.getTratamientoOIC());
        Tratamiento tODC = repositorio.buscarTratamiento(codigos.getTratamientoODC());
        
        Armazon aUno = repositorio.buscarArmazon(codigos.getArmazonUno());
        Armazon aDos = repositorio.buscarArmazon(codigos.getArmazonDos());
        
        ObraSocial os = repositorio.buscarObraSocial(codigos.getObraSocial());
        
        OrdenDeTrabajo ot = empleado.crearOrdenDeTrabajo(
                clienteOT,
                empleado,
                ordenTrabajo.getSenia(),
                ordenTrabajo.getEntregaEstimada(),
                cliente.getProfesional(),
                cOIL,
                cODL,
                cOIC,
                cODC,
                tOIL,
                tODL,
                tOIC,
                tODC,
                aUno,
                aDos,
                os,
                lejosDer.getEsfera(),
                lejosIzq.getEsfera(),
                cercaDer.getEsfera(),
                cercaIzq.getEsfera(),
                lejosDer.getCilindro(),
                lejosIzq.getCilindro(),
                cercaDer.getCilindro(),
                cercaIzq.getCilindro(),
                lejosDer.getEje(),
                lejosIzq.getEje(),
                cercaDer.getEje(),
                cercaIzq.getEje()
        );
        
        repositorio.guardarOrdenDeTrabajo(ot);
    }
}
