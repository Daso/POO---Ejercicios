
package interfaces;

import control.Printer;
import interfacesMatricula.IPrinter;
import model.*;


public class Interfaces {

    public static void main(String[] args) {
        
        
        
       AlumnoEPE alumno1 = new AlumnoEPE(52, "09834", "Carlos");       
       alumno1.setEf(20);
       alumno1.setEp(10);
       alumno1.setTf(20);
       
       
       AlumnoPRE alumno2 = new AlumnoPRE("0994", "Carla");
       alumno2.setEf(20);
       alumno2.setEp(20);
       alumno2.setPc(20);
       
       AlumnoTRA alumno3  = new AlumnoTRA(16);              
        
       Printer impresora = new Printer();
       impresora.imprimir(alumno1);
       impresora.imprimir(alumno2);
       impresora.imprimir(alumno3);
       
       Carro miCarro =  new Carro("Uno Mille", 20993);
       impresora.imprimir(miCarro);
    }
}
