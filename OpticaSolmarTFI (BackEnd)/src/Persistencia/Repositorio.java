package Persistencia;

import Modelo.Armazon;
import Modelo.Cristal;
import Modelo.Tratamiento;
import Modelo.ObraSocial;
import Modelo.Cliente;
import Modelo.DetalleOjo;
import Modelo.DetalleVista;
import Modelo.Empleado;
import Modelo.OrdenDeTrabajo;
import Modelo.Puesto;
import com.mysql.cj.xdevapi.Statement;

import java.util.ArrayList;
import java.util.Date;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class Repositorio {
    private static Repositorio instancia;
    private String sql = "";
    
    private Repositorio(){}
    
    public ArrayList<Armazon> buscarArmazones() {
        ArrayList<Armazon> armazones = new ArrayList<>();
        sql = "SELECT * FROM Armazon";
        
        try (
                Connection con = Persistencia.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
            ) {

            while (rs.next()) {
                Armazon a = new Armazon();
                a.setCodigo(rs.getInt("codigo"));
                a.setModelo(rs.getString("modelo"));
                a.setPrecio(rs.getDouble("precio"));
                a.setAltura(rs.getInt("altura"));
                a.setDnp(rs.getInt("dnp"));
                a.setMm(rs.getInt("mm"));
                a.setPrisma(rs.getDouble("prisma"));
                a.setLongitudCurva(rs.getInt("longitudCurva"));
                a.setDiametroLente(rs.getInt("diametroLente"));
                a.setBase(rs.getInt("base"));
                a.setIndicacionesEsp(rs.getString("indicacionesEsp"));
                
                armazones.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return armazones;
    }
    
    public ArrayList<Cristal> buscarCristales(){ 
        ArrayList<Cristal> cristales = new ArrayList<>();
        
        sql = "SELECT * FROM Cristal";
        
        try (
                Connection con = Persistencia.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
            ) {

            while (rs.next()) {
                Cristal c = new Cristal();
                c.setCodigo(rs.getInt("codigo"));
                c.setNombre(rs.getString("nombre"));
                c.setPrecio(rs.getDouble("precio"));
                
                cristales.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return cristales;
    }
    
    public ArrayList<Tratamiento> buscarTratamientos() {
        ArrayList<Tratamiento> tratamientos = new ArrayList<>();
        
        sql = "SELECT * FROM Tratamiento";
        
        try (
                Connection con = Persistencia.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
            ) {

            while (rs.next()) {
                Tratamiento t = new Tratamiento();
                t.setCodigo(rs.getInt("codigo"));
                t.setNombre(rs.getString("nombre"));
                t.setPrecio(rs.getDouble("precio"));
                
                tratamientos.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return tratamientos;
    }
    
    public ArrayList<ObraSocial> buscarObrasSociales(){ 
        ArrayList<ObraSocial> obrasSociales = new ArrayList<>();
        
        sql = "SELECT * FROM ObraSocial";
        
        try (
                Connection con = Persistencia.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
            ) {

            while (rs.next()) {
                ObraSocial os = new ObraSocial();
                os.setCodigo(rs.getInt("codigo"));
                os.setNombre(rs.getString("nombre"));
                os.setPorcentajeDescuento(rs.getInt("porcentajeDescuento"));
                
                obrasSociales.add(os);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return obrasSociales;
    }
    
    public Armazon buscarArmazon(int codigo) throws SQLException {
        Armazon armazon = null;
        
        sql = "SELECT * FROM Armazon WHERE codigo = ?";
        
        try (
                Connection con = Persistencia.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
            ) {
            
            ps.setInt(1, codigo);
            
            try (ResultSet rs = ps.executeQuery()) {
                armazon = new Armazon();
                
                if (rs.next()) {
                    armazon.setCodigo(rs.getInt("codigo"));
                    armazon.setModelo(rs.getString("modelo"));
                    armazon.setPrecio(rs.getDouble("precio"));
                    armazon.setAltura(rs.getInt("altura"));
                    armazon.setDnp(rs.getInt("dnp"));
                    armazon.setMm(rs.getInt("mm"));
                    armazon.setPrisma(rs.getDouble("prisma"));
                    armazon.setLongitudCurva(rs.getInt("longitudCurva"));
                    armazon.setDiametroLente(rs.getInt("diametroLente"));
                    armazon.setBase(rs.getInt("base"));
                    armazon.setIndicacionesEsp(rs.getString("indicacionesEsp"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return armazon;
    }
    
    public Cristal buscarCristal(int codigo) throws SQLException{ 
        Cristal cristal = null;
        
        sql = "SELECT * FROM Cristal WHERE codigo = ?";
        
        try (
                Connection con = Persistencia.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
            ) {
            
            ps.setInt(1, codigo);
            
            try (ResultSet rs = ps.executeQuery()) {
                cristal = new Cristal();
                
                if (rs.next()) {
                    cristal.setCodigo(rs.getInt("codigo"));
                    cristal.setNombre(rs.getString("nombre"));
                    cristal.setPrecio(rs.getDouble("precio"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return cristal;
    }
    
    public Tratamiento buscarTratamiento(int codigo) throws SQLException {
        Tratamiento tratamiento = null;
        
        sql = "SELECT * FROM Tratamiento WHERE codigo = ?";
        
        try (
                Connection con = Persistencia.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
            ) {
            
            ps.setInt(1, codigo);
            
            try (ResultSet rs = ps.executeQuery()) {
                tratamiento = new Tratamiento();
                
                if (rs.next()) {
                    tratamiento.setCodigo(rs.getInt("codigo"));
                    tratamiento.setNombre(rs.getString("nombre"));
                    tratamiento.setPrecio(rs.getDouble("precio"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return tratamiento;
    }
    
    public ObraSocial buscarObraSocial(int codigo) throws SQLException{ 
        ObraSocial obraSocial = null;
        
        sql = "SELECT * FROM ObraSocial WHERE codigo = ?";
        
        try (
                Connection con = Persistencia.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
            ) {
            
            ps.setInt(1, codigo);
            
            try (ResultSet rs = ps.executeQuery()) {
                obraSocial = new ObraSocial();
                
                if (rs.next()) {
                    obraSocial.setCodigo(rs.getInt("codigo"));
                    obraSocial.setNombre(rs.getString("nombre"));
                    obraSocial.setPorcentajeDescuento(rs.getInt("porcentajeDescuento"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return obraSocial;
    }
    
    public Cliente buscarCliente(int dni) throws SQLException {
        Cliente cliente = null;
        
        sql = "SELECT * FROM Cliente WHERE dni = ?";
        
        try (
                Connection con = Persistencia.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
            ) {
            
            ps.setInt(1, dni);
            
            try (ResultSet rs = ps.executeQuery()) {
                cliente = new Cliente();
                
                if (rs.next()) {
                    cliente.setDni(rs.getInt("dni"));
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setApellido(rs.getString("apellido"));
                    cliente.setDomicilio(rs.getString("domicilio"));
                    cliente.setLocalidad(rs.getString("localidad"));
                    cliente.setTelefono(rs.getString("telefono"));
                    cliente.setEmail(rs.getString("email"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return cliente;
    }
    
    public void guardarCliente(Cliente cliente) {
        sql = "INSERT INTO Cliente (dni, nombre, apellido, domicilio, localidad, telefono, email) " +
              "VALUES (?, ?, ?, ?, ?, ?, ?) " +
              "ON DUPLICATE KEY UPDATE nombre = VALUES(nombre), " +
              "apellido = VALUES(apellido), " +
              "domicilio = VALUES(domicilio), " +
              "localidad = VALUES(localidad), " +
              "telefono = VALUES(telefono), " +
              "email = VALUES(email)";
        
        try (
                Connection con = Persistencia.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
            ) {
            
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(4, cliente.getDomicilio());
            ps.setString(5, cliente.getLocalidad());
            ps.setString(6, cliente.getTelefono());
            ps.setString(7, cliente.getEmail());
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void guardarOrdenDeTrabajo(OrdenDeTrabajo ordenDeTrabajo) throws SQLException {
        
        try {
            Connection con = Persistencia.getConnection();
            
            //Cliente cliente = buscarCliente(ordenDeTrabajo.getCliente().getDni());
            //if (cliente == null) guardarCliente(ordenDeTrabajo.getCliente());
        
            guardarCliente(ordenDeTrabajo.getCliente());
            
            String sqlOT = "INSERT INTO OrdenDeTrabajo (senia, fechaEntregaEstimada, empleado_legajo, obraSocial_codigo, cliente_dni, profesional) " +
                  "VALUES (?, ?, ?, ?, ?, ?)";
            
            PreparedStatement psOT = con.prepareStatement(sqlOT);
            psOT.setDouble(1, ordenDeTrabajo.getSenia());
            psOT.setDate(2, new java.sql.Date(ordenDeTrabajo.getFechaEntregaEstimada().getTime()));
            psOT.setInt(3, ordenDeTrabajo.getVendedor().getLejajo());
            psOT.setInt(4, ordenDeTrabajo.getObraSocial().getCodigo());
            psOT.setInt(5, ordenDeTrabajo.getCliente().getDni());
            psOT.setString(6, ordenDeTrabajo.getProfesional());
            
            psOT.executeUpdate();
            ResultSet rs = psOT.getGeneratedKeys();
            
            int codOT = 0;
            if (rs.next()) {
                codOT = rs.getInt(1);
            }
            
            String sqlDV = "INSERT INTO DetalleVista (orden_trabajo_numero, vista, armazon_codigo) VALUES (?, ?, ?)";
            PreparedStatement psDV = con.prepareStatement(sqlDV);
            
            String sqlDO = "INSERT INTO DetalleOjo (detalle_vista_id, ojo, esfera, cilindro, eje, tratamiento_codigo, cristal_codigo) values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement psDO = con.prepareStatement(sqlDO);
            
            for (DetalleVista detalleVista : Arrays.asList(ordenDeTrabajo.getDetalleVistaLejos(), ordenDeTrabajo.getDetalleVistaCerca())) {
                psDV.setInt(1, codOT);
                psDV.setString(2, detalleVista.getVista().name());
                psDV.setInt(3, detalleVista.getArmazon().getCodigo());
                psDV.executeUpdate();

                ResultSet rsVista = psDV.getGeneratedKeys();
                int idDetalleVista = 0;
                if (rsVista.next()) {
                    idDetalleVista = rsVista.getInt(1);
                }

                for (DetalleOjo detalleOjo : Arrays.asList(detalleVista.getDetalleOjoIzquierdo(), detalleVista.getDetalleOjoDerecho())) {
                    psDO.setInt(1, idDetalleVista);
                    psDO.setDouble(2, detalleOjo.getEsfera());
                    psDO.setDouble(3, detalleOjo.getCilindro());
                    psDO.setDouble(4, detalleOjo.getEje());
                    psDO.setString(5, detalleOjo.getOjo().name());
                    psDO.setInt(6, detalleOjo.getTratamiento().getCodigo());
                    psDO.setInt(7, detalleOjo.getCristal().getCodigo());
                    psDO.executeUpdate();
                }
            }
        } catch (SQLException e) {
            throw e;
        }
    }
    
    public static Repositorio getInstance() {
        if(instancia == null) {
            instancia = new Repositorio();
        } 
        
        return instancia;
    }
}
