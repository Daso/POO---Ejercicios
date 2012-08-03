package model;

import interfacesMatricula.IPrinter;

public class AlumnoTRA extends Alumno{
    private int nt;

    public AlumnoTRA(int nt, String codigo, String nombre) {
        super(codigo, nombre);
        this.nt = nt;
    }

    public AlumnoTRA(int nt) {
        this.nt = nt;
    }
        
    public String imprimirme(){
        return "La nota de Traslado es: " + nt;
    }
    
    public double promedioFinal(){
        return (this.ef + this.ep+3*this.nt)/5;
    }
}
