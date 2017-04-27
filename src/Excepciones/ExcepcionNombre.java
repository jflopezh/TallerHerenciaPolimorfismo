package Excepciones;

public class ExcepcionNombre extends Exception {

    public ExcepcionNombre() {
        super("El nombre debe tener mas de 10 caracteres");
    }
    
}
