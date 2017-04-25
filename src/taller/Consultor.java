package taller;

public class Consultor extends Trabajador {

    protected String Labor;

    public Consultor(String Labor, int ID) {
        super(ID);
        this.Labor = Labor;
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
