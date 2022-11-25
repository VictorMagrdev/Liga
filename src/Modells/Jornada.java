package Modells;

public class Jornada {
    private String id;
    private int numero;
    private String eslogan;

    public Jornada(String id, int numero, String eslogan) {
        this.id = id;
        this.numero = numero;
        this.eslogan = eslogan;
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
