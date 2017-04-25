package Excepciones;

public class ExcepcionSalario extends Exception {
    
    public ExcepcionSalario() {
        super("Salario debe ser mayor al minimo");
    }
    
}
