package Modells;

public class Aficionado extends Persona{
    private int años_fedelidad;
    private boolean abonados;

    public Aficionado(String id, String cedula, String nombre, String apellido, int edad, String id1, int años_fedelidad, boolean abonados) {
        super(id, cedula, nombre, apellido, edad);
        this.años_fedelidad = años_fedelidad;
        this.abonados = abonados;
    }

    public int getAños_fedelidad() {
        return años_fedelidad;
    }

    public void setAños_fedelidad(int años_fedelidad) {
        this.años_fedelidad = años_fedelidad;
    }

    public boolean isAbonados() {
        return abonados;
    }

    public void setAbonados(boolean abonados) {
        this.abonados = abonados;
    }
}
