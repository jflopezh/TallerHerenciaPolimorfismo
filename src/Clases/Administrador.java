package Clases;

import Excepciones.ExcepcionNombre;
import Excepciones.ExcepcionSalario;

public class Administrador extends Empleado {

    public Administrador(String Nombre, int ID) throws ExcepcionNombre, ExcepcionSalario {
        super(Nombre, 100, ID);
    }
    
    @Override
    public double calcularSalario() {
        return this.Salario;
    }

    @Override
    public String listarInformacion() {
        return "Administrador " + this.ID + " " + this.Nombre;
    }
    
}
