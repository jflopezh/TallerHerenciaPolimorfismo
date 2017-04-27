package Clases;

import DAO.ArchivoDB;
import Excepciones.ExcepcionLenguaje;
import Excepciones.ExcepcionNombre;
import Excepciones.ExcepcionSalario;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        Empresa e = new Empresa();
        
        Consultor c = new Consultor("Ing", 1);
        Administrador a = null;
        Programador p1 = null;
        Programador p2 = null;
        Programador p3 = null;
        LiderProyecto l = null;
        
        try {
            a = new Administrador("Abcdefghijk", 2);
            p1 = new Programador("Java", "Abcdefghijk", 200, 3);
            p2 = new Programador("C++", "Abcdefghijk", 200, 4);
            p3 = new Programador("C++", "Abcdefghijk", 200, 5);
            l = new LiderProyecto("Java", "Asfwkjehwuifgwe", 320, 6);
            l.AgregarProgramador(p1);
            l.AgregarProgramador(p2);
            l.AgregarProgramador(p3);
        } catch (ExcepcionNombre ex) {
            ex.printStackTrace();
        } catch (ExcepcionSalario ex) {
            ex.printStackTrace();
        } catch (ExcepcionLenguaje ex) {
            ex.printStackTrace();
        }
        
        e.agregarTrabajador(c);
        e.agregarTrabajador(a);
        e.agregarTrabajador(p1);
        e.agregarTrabajador(p2);
        e.agregarTrabajador(p3);
        e.agregarTrabajador(l);
        
        try {
            ArchivoDB.guardarInformacion(e);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
}
