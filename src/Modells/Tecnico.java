package Modells;

public class Tecnico extends Persona{
    private int años_expereincia;
    private int salario;

    public Tecnico(String cedula, String nombre, String apellido, int edad, int años_expereincia, int salario) {
        super(cedula, nombre, apellido, edad);
        this.años_expereincia = años_expereincia;
        this.salario = salario;
    }

    public int getAños_expereincia() {
        return años_expereincia;
    }

    public void setAños_expereincia(int años_expereincia) {
        this.años_expereincia = años_expereincia;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
