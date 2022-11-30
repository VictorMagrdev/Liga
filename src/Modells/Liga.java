package Modells;

import java.util.LinkedList;

public class Liga {
    private String id;
    private LinkedList<Estadio> miestadio;
    private LinkedList<Equipo> miequipo;
    private LinkedList<Persona> mipersona;

    public Liga(String id) {
        this.id = id;
        this.miestadio = new LinkedList<>();
        this.miequipo = new LinkedList<>();
        this.mipersona = new LinkedList<>();
    }
    public void crearequipo(String id, String nombre, int titulos_nacionales, int titulos_internacionales, int puntos, int goles_favor, int goles_contra, int partidos){
        Equipo nuevoequipo = new Equipo(id, nombre, titulos_nacionales, titulos_internacionales, puntos, goles_favor, goles_contra, partidos);
        this.miequipo.add(nuevoequipo);
    }

    public LinkedList<Equipo> getMiequipo() {
        return miequipo;
    }

    public void setMiequipo(LinkedList<Equipo> miequipo) {
        this.miequipo = miequipo;
    }

    public LinkedList<Persona> getMipersona() {
        return mipersona;
    }

    public void setMipersona(LinkedList<Persona> mipersona) {
        this.mipersona = mipersona;
    }

    public LinkedList<Estadio> getMiestadio() {
        return miestadio;
    }

    public void setMiestadio(LinkedList<Estadio> miestadio) {
        this.miestadio = miestadio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    //metodos
    public Jugador jugadormasjoven_liga(){
        Jugador respuesta = null;
        int menor = Integer.MAX_VALUE;
        for (Equipo actual: this.miequipo){
            Jugador joven = actual.jugadormasjoven_equipo();
            if(joven instanceof Jugador){
                if (joven.getEdad() <menor){
                    respuesta = joven;
                }
            }
        }
        return respuesta;
    }

    public Jugador jugador_masgoles_liga(){
        Jugador respuesta = null;
        int mayor = Integer.MIN_VALUE;
        for (Equipo actual: this.miequipo){
            Jugador goleador = actual.jugador_masgoles_equipo();
            if(goleador.getGoles() > mayor){
                respuesta = goleador;
            }
        }
        return respuesta;
    }
}
