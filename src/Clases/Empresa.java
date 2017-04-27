package Clases;

import java.util.ArrayList;

public class Empresa {
    
    private ArrayList<Trabajador> Trabajadores;

    public Empresa() {
        this.Trabajadores = new ArrayList<>();
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return Trabajadores;
    }
    
    public void agregarTrabajador(Trabajador t) {
        this.Trabajadores.add(t);
    }
    
    public double calcularSalarioTotal() {
        double SalarioTotal = 0;
        for (Trabajador t : Trabajadores) {
            SalarioTotal += t.calcularSalario();
        }
        return SalarioTotal;
    }
    
    public String listarInformacion()  {
        String Informacion = "";
        for (Trabajador t : Trabajadores) {
            Informacion += t.listarInformacion() + "\n";
        }
        return Informacion;
    }
    
}
