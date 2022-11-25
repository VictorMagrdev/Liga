package Modells;

import java.util.LinkedList;

public class Liga {
    private String id;
    private LinkedList<Estadio> miestadio;

    public Liga(String id) {
        this.id = id;
        this.miestadio = new LinkedList<>();
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
}
