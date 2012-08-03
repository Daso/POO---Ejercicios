
package model;

import interfacesMatricula.IPrinter;

public class Carro implements IPrinter{
    private String marca;
    private double km;

    public Carro(String marca, double km) {
        this.marca = marca;
        this.km = km;
    }
    
    public String imprimirme(){
        return "Marca: " + this.marca +" KM " + this.km;
    }
    
}
