package taller;

public abstract class Trabajador {

    protected int ID;

    public Trabajador(int ID) {
        this.ID = ID;
    }

    public abstract double calcularSalario();

    public abstract String listarInformacion();
    
}
