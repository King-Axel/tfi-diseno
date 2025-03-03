package Modelo;

public class Armazon {
    private String modelo;
    private int codigo;
    private double precio;
    private int dnp;
    private int altura;
    private int mm;
    private double prisma;
    private int longitudCurva;
    private int diametroLente;
    private int base;
    private String indicacionesEsp;

    public Armazon() {
    }

    public Armazon(String modelo, int codigo, double precio, int dnp, int altura, int mm, double prisma, int longitudCurva, int diametroLente, int base, String indicacionesEsp) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.precio = precio;
        this.dnp = dnp;
        this.altura = altura;
        this.mm = mm;
        this.prisma = prisma;
        this.longitudCurva = longitudCurva;
        this.diametroLente = diametroLente;
        this.base = base;
        this.indicacionesEsp = indicacionesEsp;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getDnp() {
        return dnp;
    }

    public int getAltura() {
        return altura;
    }

    public int getMm() {
        return mm;
    }

    public double getPrisma() {
        return prisma;
    }

    public int getLongitudCurva() {
        return longitudCurva;
    }

    public int getDiametroLente() {
        return diametroLente;
    }

    public int getBase() {
        return base;
    }

    public String getIndicacionesEsp() {
        return indicacionesEsp;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDnp(int dnp) {
        this.dnp = dnp;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public void setPrisma(double prisma) {
        this.prisma = prisma;
    }

    public void setLongitudCurva(int longitudCurva) {
        this.longitudCurva = longitudCurva;
    }

    public void setDiametroLente(int diametroLente) {
        this.diametroLente = diametroLente;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setIndicacionesEsp(String indicacionesEsp) {
        this.indicacionesEsp = indicacionesEsp;
    }
}
