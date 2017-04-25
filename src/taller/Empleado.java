package taller;

public abstract class Empleado extends Trabajador {

    protected String Nombre;

    public Empleado(String Nombre, int ID) {
        super(ID);
        this.Nombre = Nombre;
    }
    
}
