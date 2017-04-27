package Clases;

public class Consultor extends Trabajador {

    protected String Labor;

    public Consultor(String Labor, int ID) {
        super(ID);
        this.Labor = Labor;
    }

    public String getLabor() {
        return Labor;
    }

    @Override
    public double calcularSalario() {
        return 220;
    }

    @Override
    public String listarInformacion() {
        return "Consultor " + this.ID + " " + this.Labor;
    }

}
