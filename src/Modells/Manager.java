package Modells;

public class Manager extends Persona{
    private int años_afilicion;

    public Manager(String id, String cedula, String nombre, String apellido, int edad, int años_afilicion) {
        super(id, cedula, nombre, apellido, edad);
        this.años_afilicion = años_afilicion;
    }

    public int getAños_afilicion() {
        return años_afilicion;
    }

    public void setAños_afilicion(int años_afilicion) {
        this.años_afilicion = años_afilicion;
    }
}
