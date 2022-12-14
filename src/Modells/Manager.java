package Modells;

import java.util.LinkedList;

public class Manager extends Persona{
    private int años_afilicion;
    private LinkedList<Jugador> mijugador;
    private Equipo miequipo;

    public Manager(String cedula, String nombre, String apellido, int edad, int años_afilicion) {
        super(cedula, nombre, apellido, edad);
        this.años_afilicion = años_afilicion;
        this.mijugador = new LinkedList<>();
    }

    public Equipo getMiequipo() {
        return miequipo;
    }

    public void setMiequipo(Equipo miequipo) {
        this.miequipo = miequipo;
    }

    public LinkedList<Jugador> getMijugador() {
        return mijugador;
    }

    public void setMijugador(LinkedList<Jugador> mijugador) {
        this.mijugador = mijugador;
    }

    public int getAños_afilicion() {
        return años_afilicion;
    }

    public void setAños_afilicion(int años_afilicion) {
        this.años_afilicion = años_afilicion;
    }
}
