package Modells;

import java.util.LinkedList;

public class Estadio {
    private String id;
    private String ciudad;
    private String nombre;
    private int capacidad;
    private Liga miliga;

    public Estadio(String id, String ciudad, String nombre, int capacidad) {
        this.id = id;
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.capacidad = capacidad;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
