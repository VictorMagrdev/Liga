package Modells;

import java.util.LinkedList;

public class Equipo {
    private String id;
    private String nombre;
    private int titulos_nacionales;
    private int titulos_internacionales;
    private int puntos;
    private int goles_favor;
    private int goles_contra;
    private int partidos;
    private Tecnico mitecnico;
    private LinkedList<Jugador> mijugador;
    private LinkedList<Partido> mipartido;
    private LinkedList<Aficionado> miaficionado;
    private Manager mimanager;

    //constructor
    public Equipo(String id, String nombre, int titulos_nacionales, int titulos_internacionales, int puntos, int goles_favor, int goles_contra, int partidos) {
        this.id = id;
        this.nombre = nombre;
        this.titulos_nacionales = titulos_nacionales;
        this.titulos_internacionales = titulos_internacionales;
        this.puntos = puntos;
        this.goles_favor = goles_favor;
        this.goles_contra = goles_contra;
        this.partidos = partidos;
        this.mipartido = new LinkedList<>();
        this.miaficionado= new LinkedList<>();
        this.mijugador = new LinkedList<>();
    }
    //gets/sets
    public void agregarjugador(Jugador nuevojugador){
        this.mijugador.add(nuevojugador);
    }
    public void agregartecnico(Tecnico nuevotecnico){
        this.setMitecnico(nuevotecnico);
    }

    public LinkedList<Jugador> getMijugador() {
        return mijugador;
    }

    public void setMijugador(LinkedList<Jugador> mijugador) {
        this.mijugador = mijugador;
    }

    public Manager getMimanager() {
        return mimanager;
    }

    public void setMimanager(Manager mimanager) {
        this.mimanager = mimanager;
    }

    public LinkedList<Aficionado> getMiaficionado() {
        return miaficionado;
    }

    public void setMiaficionado(LinkedList<Aficionado> miaficionado) {
        this.miaficionado = miaficionado;
    }

    public void agregarTecnico(Tecnico nuevotecnico){
        this.setMitecnico(nuevotecnico);
    }

    public Tecnico getMitecnico() {
        return mitecnico;
    }

    public void setMitecnico(Tecnico mitecnico) {
        this.mitecnico = mitecnico;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTitulos_nacionales() {
        return titulos_nacionales;
    }

    public void setTitulos_nacionales(int titulos_nacionales) {
        this.titulos_nacionales = titulos_nacionales;
    }

    public int getTitulos_internacionales() {
        return titulos_internacionales;
    }

    public void setTitulos_internacionales(int titulos_internacionales) {
        this.titulos_internacionales = titulos_internacionales;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getGoles_favor() {
        return goles_favor;
    }

    public void setGoles_favor(int goles_favor) {
        this.goles_favor = goles_favor;
    }

    public int getGoles_contra() {
        return goles_contra;
    }

    public void setGoles_contra(int goles_contra) {
        this.goles_contra = goles_contra;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    public LinkedList<Partido> getMipartido() {
        return mipartido;
    }

    public void setMipartido(LinkedList<Partido> mipartido) {
        this.mipartido = mipartido;
    }

    //metodos
    public Jugador jugadormasjoven_equipo(){
        Jugador respuesta = null;
        int menor= Integer.MAX_VALUE;
        for (Jugador actual: this.mijugador){
            if (actual instanceof Jugador) {
                if (actual.getEdad() < menor) {
                    respuesta = actual;
                }
            }
        }
        return respuesta;
    }
    public double promedio_edad(){
        double respuesta = 0;
        double edad = 0.0;
        for(Jugador actual: this.mijugador){
            edad += actual.getEdad();
        }
        respuesta = edad / this.mijugador.size();
        return respuesta;
    }
    public Jugador jugador_masgoles_equipo(){
        int mayor = Integer.MIN_VALUE;
        Jugador respuesta = null;
        for (Jugador actual: this.mijugador){
            if (actual.getGoles()> mayor){
                respuesta = actual;
            }
        }
        return respuesta;
    }

    public Jugador buscarJugador(String cedula) {
        Jugador respuesta = null;
        for (Jugador actual: this.mijugador){
            if (actual.getCedula().equals(cedula)){
                respuesta = actual;
            }
        }
        return respuesta;
    }

    public void eliminarjugador(Jugador encontrado) {
        this.mijugador.remove(encontrado);
    }
}
