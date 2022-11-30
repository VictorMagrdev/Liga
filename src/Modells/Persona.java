package Modells;

public abstract class Persona {
    private String id;
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private Liga miliga;
    public Persona(String id, String cedula, String nombre, String apellido, int edad) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Liga getMiliga() {
        return miliga;
    }

    public void setMiliga(Liga miliga) {
        this.miliga = miliga;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
