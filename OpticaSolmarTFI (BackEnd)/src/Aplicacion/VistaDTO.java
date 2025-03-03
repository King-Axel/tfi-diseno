package Aplicacion;

import Modelo.Vista;


public class VistaDTO {
    private OjoDTO izquierdo;
    private OjoDTO derecho;
    private Vista vista;

    public VistaDTO() {
    }

    public VistaDTO(OjoDTO izquierdo, OjoDTO derecho, Vista vista) {
        this.izquierdo = izquierdo;
        this.derecho = derecho;
        this.vista = vista;
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    public OjoDTO getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(OjoDTO izquierdo) {
        this.izquierdo = izquierdo;
    }

    public OjoDTO getDerecho() {
        return derecho;
    }

    public void setDerecho(OjoDTO derecho) {
        this.derecho = derecho;
    }
}
