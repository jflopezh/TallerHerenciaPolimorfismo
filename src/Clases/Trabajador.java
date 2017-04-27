package Clases;

public abstract class Trabajador {

    protected int ID;

    public Trabajador(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public abstract double calcularSalario();

    public abstract String listarInformacion();
    
}
