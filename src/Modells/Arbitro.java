package Modells;

public class Arbitro extends Persona{
    private int años_experiencia;
    private int salario;
    private boolean FIFA;
    private Partido mipartido;

    public Arbitro(String id, String cedula, String nombre, String apellido, int edad, int años_experiencia, int salario, boolean FIFA) {
        super(id, cedula, nombre, apellido, edad);
        this.años_experiencia = años_experiencia;
        this.salario = salario;
        this.FIFA = FIFA;
    }

    public Partido getMipartido() {
        return mipartido;
    }

    public void setMipartido(Partido mipartido) {
        this.mipartido = mipartido;
    }

    public int getAños_experiencia() {
        return años_experiencia;
    }

    public void setAños_experiencia(int años_experiencia) {
        this.años_experiencia = años_experiencia;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public boolean isFIFA() {
        return FIFA;
    }

    public void setFIFA(boolean FIFA) {
        this.FIFA = FIFA;
    }
}
