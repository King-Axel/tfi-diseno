package Modelo;

public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private String localidad;
    private String telefono;
    private String email;

    public Cliente() {
    }

    public Cliente(
        String nombre, 
        String apellido, 
        int dni, 
        String domicilio, 
        String localidad, 
        String telefono, 
        String email
    ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
