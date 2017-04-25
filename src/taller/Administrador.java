package taller;

public class Administrador extends Empleado {

    public Administrador(String Nombre, int ID) {
        super(Nombre, ID);
    }
    
    @Override
    public double calcularSalario() {
        return 100;
    }

    @Override
    public String listarInformacion() {
        return "Administrador " + this.ID + " " + this.Nombre;
    }
    
}
