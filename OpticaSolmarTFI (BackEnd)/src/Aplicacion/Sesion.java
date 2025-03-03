package Aplicacion;

import Modelo.Empleado;

public class Sesion {
    private Empleado empleado;
    private static Sesion instancia;

    public Sesion() {
    }

    public Sesion(Empleado empleado) {
        this.empleado = empleado;
    }
    
    public static Sesion getInstance() {
        if (instancia == null) { 
            instancia = new Sesion();
        }

        return instancia;
    }
    
    public Empleado getEmpleado() {
        return empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    public void cerrarSesion() {
        this.empleado = null;
    }
}


