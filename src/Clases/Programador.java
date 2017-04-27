package Clases;

import Excepciones.ExcepcionLenguaje;
import Excepciones.ExcepcionNombre;
import Excepciones.ExcepcionSalario;

public class Programador extends Empleado {
    
    protected String LenguajeExperto;

    public Programador(String LenguajeExperto, String Nombre, double Salario, int ID) throws ExcepcionNombre, ExcepcionSalario, ExcepcionLenguaje {
        super(Nombre, Salario, ID);
        
        if (LenguajeExperto.equals("Go")) {
            throw new ExcepcionLenguaje();
        }
        
        this.LenguajeExperto = LenguajeExperto;
    }

    public String getLenguajeExperto() {
        return LenguajeExperto;
    }
    
    @Override
    public double calcularSalario() {
        if (this.LenguajeExperto.equals("Java")) {
            return this.Salario + (this.Salario * 0.1);
        }
        return this.Salario;
    }

    @Override
    public String listarInformacion() {
        return "Administrador " + this.ID + " " + this.Nombre + " , Lenguaje: " + this.LenguajeExperto;
    }
    
}
