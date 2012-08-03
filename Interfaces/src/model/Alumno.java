
package model;

import interfacesMatricula.IPrinter;


abstract public class Alumno implements IPrinter{
    private String codigo;
    private String nombre;
    protected int ef;
    protected int ep;

    public Alumno() {
    }
        
    public Alumno(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ef = 0;
        this.ep = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getEf() {
        return ef;
    }

    public void setEf(int ef) {
        this.ef = ef;
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    
    
    
    abstract public double promedioFinal();
        
}
