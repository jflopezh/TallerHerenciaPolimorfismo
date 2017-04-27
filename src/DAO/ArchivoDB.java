package DAO;

import Clases.*;
import Excepciones.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ArchivoDB {

    public static void guardarInformacion(Empresa e) throws FileNotFoundException {
        File Archivo = new File("Empresa.txt");
        PrintStream Salida = new PrintStream(Archivo);

        for (Trabajador t : e.getTrabajadores()) {
            if (t instanceof Consultor) {
                Consultor c = (Consultor) t;
                Salida.print("C," + c.getID() + "," + c.getLabor() + ",");
            } else if (t instanceof LiderProyecto) {
                LiderProyecto l = (LiderProyecto) t;
                Salida.print("L," + l.getID() + "," + l.getNombre() + "," + l.calcularSalario() + "," + l.getLenguajeExperto() + ",");
                Salida.print(l.getMiembrosEquipo().size() + ",");
                for (Programador p : l.getMiembrosEquipo()) {
                    Salida.print(p.getID() + ",");
                }
            } else if (t instanceof Programador) {
                Programador p = (Programador) t;
                Salida.print("P," + p.getID() + "," + p.getNombre() + "," + p.calcularSalario() + "," + p.getLenguajeExperto() + ",");
            } else if (t instanceof Administrador) {
                Administrador a = (Administrador) t;
                Salida.print("A," + a.getID() + "," + a.getNombre() + "," + a.calcularSalario() + ",");
            }
        }

        Salida.close();
    }

    public static void leerInformacion(Empresa e) throws FileNotFoundException {
        File Archivo = new File("Empresa.txt");
        Scanner sc = new Scanner(Archivo);
        sc.useDelimiter(",");

        int id;
        String lab, nombre, lenguaje;
        double salario;

        try {
            while (sc.hasNext()) {
                String x = sc.next();
                if (x.equals("C")) {
                    id = sc.nextInt();
                    lab = sc.next();
                    Consultor c = new Consultor(lab, id);
                    e.agregarTrabajador(c);
                } else if (x.equals("P")) {
                    id = sc.nextInt();
                    nombre = sc.next();
                    System.out.println(nombre);
                    salario = Double.parseDouble(sc.next());
                    lenguaje = sc.next();
                    Programador p = new Programador(lenguaje, nombre, salario, id);
                    e.agregarTrabajador(p);
                } else if (x.equals("A")) {
                    id = sc.nextInt();
                    nombre = sc.next();
                    Administrador a = new Administrador(nombre, id);
                    e.agregarTrabajador(a);
                } else if (x.equals("L")) {
                    id = sc.nextInt();
                    nombre = sc.next();
                    salario = Double.parseDouble(sc.next());
                    lenguaje = sc.next();
                    LiderProyecto l = new LiderProyecto(lenguaje, nombre, salario, id);
                    int cache = 0;
                    for (int i = 0; i < sc.nextInt(); i++) {
                        cache = sc.nextInt();
                        for (Trabajador p : e.getTrabajadores()) {
                            if (p instanceof Programador) {
                                if (p.getID() == cache) {
                                    l.AgregarProgramador((Programador) p);
                                }
                            }
                        }
                    }
                    e.agregarTrabajador(l);
                }
            }
        } catch (ExcepcionNombre ex) {
            ex.printStackTrace();
        } catch (ExcepcionSalario ex) {
            ex.printStackTrace();
        } catch (ExcepcionLenguaje ex) {
            ex.printStackTrace();
        }
    }
}
