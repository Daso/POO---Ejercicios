
package model;


public class AlumnoPRE extends Alumno{
    private String telefono;
    private int pc;

    public AlumnoPRE(String codigo, String nombre) {
        super(codigo, nombre);
        this.telefono = "";
        this.pc=0;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String imprimirme(){
        return "El promedio PRE es: "+promedioFinal();
    }
    
    public double promedioFinal(){
        return (this.ef + this.ep + 2 * this.pc)/4;
    }
}
