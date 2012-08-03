
package model;


public class AlumnoEPE extends Alumno{
    private int edad;
    private int tf;

    public AlumnoEPE(int edad, String codigo, String nombre) {
        super(codigo, nombre);
        this.edad = edad;
        this.tf = 0;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTf() {
        return tf;
    }

    public void setTf(int tf) {
        this.tf = tf;
    }

    public String imprimirme(){
        return "El promedio EPE es:" + promedioFinal();
    }
    
    
    public double promedioFinal(){
        return (this.tf + this.ep + this.ef)/3;
    }
    
    
}
