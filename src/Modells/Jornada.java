package Modells;

import java.util.LinkedList;

public class Jornada {
    private String id;
    private int numero;
    private String eslogan;
    private LinkedList<Partido> mipartido;
    public Jornada(String id, int numero, String eslogan) {
        this.id = id;
        this.numero = numero;
        this.eslogan = eslogan;
        this.mipartido = new LinkedList<>();
    }

    public LinkedList<Partido> getMipartido() {
        return mipartido;
    }

    public void setMipartido(LinkedList<Partido> mipartido) {
        this.mipartido = mipartido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEslogan() {
        return eslogan;
    }

    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }
}
