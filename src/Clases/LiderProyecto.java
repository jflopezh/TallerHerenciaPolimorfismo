package Clases;

import Excepciones.ExcepcionLenguaje;
import Excepciones.ExcepcionNombre;
import Excepciones.ExcepcionSalario;
import java.util.ArrayList;

public class LiderProyecto extends Programador {

    private ArrayList<Programador> MiembrosEquipo;

    public LiderProyecto(String LenguajeExperto, String Nombre, double Salario, int ID) throws ExcepcionNombre, ExcepcionSalario, ExcepcionLenguaje {
        super(LenguajeExperto, Nombre, Salario, ID);
        this.MiembrosEquipo = new ArrayList<>();
    }

    public ArrayList<Programador> getMiembrosEquipo() {
        return MiembrosEquipo;
    }

    public void AgregarProgramador(Programador p) {
        this.MiembrosEquipo.add(p);
    }

    @Override
    public double calcularSalario() {
        double SalarioTotal = super.calcularSalario();
        if (!this.MiembrosEquipo.isEmpty()) {
            SalarioTotal += 10 * MiembrosEquipo.size();
        }
        return SalarioTotal;
    }
    
    @Override
    public String listarInformacion() {
        String Informacion = super.listarInformacion();
        Informacion += "\n Programadores a Cargo\n";
        for (Programador p : MiembrosEquipo) {
            Informacion += p.listarInformacion() + "\n";
        }
        return Informacion;
    }
}
