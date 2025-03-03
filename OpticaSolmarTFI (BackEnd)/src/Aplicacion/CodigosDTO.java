package Aplicacion;

public class CodigosDTO {
    private int cristalOIL;
    private int cristalODL;
    private int cristalOIC;
    private int cristalODC;
    private int tratamientoOIL;
    private int tratamientoODL;
    private int tratamientoOIC;
    private int tratamientoODC;
    private int armazonUno;
    private int armazonDos;
    private int obraSocial;

    public CodigosDTO() {
    }

    public CodigosDTO(int cristalOIL, int cristalODL, int cristalOIC, int cristalODC, int tratamientoOIL, int tratamientoODL, int tratamientoOIC, int tratamientoODC, int armazonUno, int armazonDos, int obraSocial) {
        this.cristalOIL = cristalOIL;
        this.cristalODL = cristalODL;
        this.cristalOIC = cristalOIC;
        this.cristalODC = cristalODC;
        this.tratamientoOIL = tratamientoOIL;
        this.tratamientoODL = tratamientoODL;
        this.tratamientoOIC = tratamientoOIC;
        this.tratamientoODC = tratamientoODC;
        this.armazonUno = armazonUno;
        this.armazonDos = armazonDos;
        this.obraSocial = obraSocial;
    }

    public int getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(int obraSocial) {
        this.obraSocial = obraSocial;
    }

    public int getCristalOIL() {
        return cristalOIL;
    }

    public void setCristalOIL(int cristalOIL) {
        this.cristalOIL = cristalOIL;
    }

    public int getCristalODL() {
        return cristalODL;
    }

    public void setCristalODL(int cristalODL) {
        this.cristalODL = cristalODL;
    }

    public int getCristalOIC() {
        return cristalOIC;
    }

    public void setCristalOIC(int cristalOIC) {
        this.cristalOIC = cristalOIC;
    }

    public int getCristalODC() {
        return cristalODC;
    }

    public void setCristalODC(int cristalODC) {
        this.cristalODC = cristalODC;
    }

    public int getTratamientoOIL() {
        return tratamientoOIL;
    }

    public void setTratamientoOIL(int tratamientoOIL) {
        this.tratamientoOIL = tratamientoOIL;
    }

    public int getTratamientoODL() {
        return tratamientoODL;
    }

    public void setTratamientoODL(int tratamientoODL) {
        this.tratamientoODL = tratamientoODL;
    }

    public int getTratamientoOIC() {
        return tratamientoOIC;
    }

    public void setTratamientoOIC(int tratamientoOIC) {
        this.tratamientoOIC = tratamientoOIC;
    }

    public int getTratamientoODC() {
        return tratamientoODC;
    }

    public void setTratamientoODC(int tratamientoODC) {
        this.tratamientoODC = tratamientoODC;
    }

    public int getArmazonUno() {
        return armazonUno;
    }

    public void setArmazonUno(int armazonUno) {
        this.armazonUno = armazonUno;
    }

    public int getArmazonDos() {
        return armazonDos;
    }

    public void setArmazonDos(int armazonDos) {
        this.armazonDos = armazonDos;
    }
}
