package taller;

public class Programador extends Empleado {
    
    protected String LenguajeExperto;

    public Programador(String LenguajeExperto, String Nombre, int ID) {
        super(Nombre, ID);
        this.LenguajeExperto = LenguajeExperto;
    }
    
    @Override
    public double calcularSalario() {
        if (this.LenguajeExperto.equals("Java")) {
            return 120;
        } else {
            return 100;
        }        
    }

    @Override
    public String listarInformacion() {
        return "Administrador " + this.ID + " " + this.Nombre + " , Lenguaje: " + this.LenguajeExperto;
    }
    
}
