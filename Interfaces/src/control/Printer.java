package control;

import interfacesMatricula.IPrinter;

public class Printer {
    
    public void imprimir(IPrinter imprimible){
        System.out.println(imprimible.imprimirme());
    }
    
}
