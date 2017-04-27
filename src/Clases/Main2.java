package Clases;

import DAO.ArchivoDB;
import java.io.FileNotFoundException;

public class Main2 {

    public static void main(String[] args) {
        Empresa e = new Empresa();
        try {
            ArchivoDB.leerInformacion(e);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println(e.listarInformacion());
    }
    
}
