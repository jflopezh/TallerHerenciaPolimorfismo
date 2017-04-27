package Clases;

import Excepciones.ExcepcionNombre;
import Excepciones.ExcepcionSalario;

public abstract class Empleado extends Trabajador {

    protected String Nombre;
    protected double Salario;

    public Empleado(String Nombre, double  Salario, int ID) throws ExcepcionNombre, ExcepcionSalario {
        super(ID);
        
        if (Nombre.length() < 10) {
            throw new ExcepcionNombre();
        }
        if (Salario < 100) {
            throw new ExcepcionSalario();
        }
        
        this.Nombre = Nombre;
        this.Salario = Salario;
    }

    public String getNombre() {
        return Nombre;
    }
    
}
