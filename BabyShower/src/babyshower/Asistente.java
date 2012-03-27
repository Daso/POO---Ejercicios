
package babyshower;

public class Asistente {
    private String nombre;
    private int dia;
    private int mes;
    private int anho;
    private int edad;

    public Asistente(String nombre, int dia, int mes, int anho) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
        calcularEdad();
    }
        
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    private void calcularEdad(){
        Date date = new Date();
        edad = 2012 - this.anho;
        if(date.getMes() < this.mes){
            edad = edad - 1;
        }
        if(date.getMes() == this.mes){
            if(date.getDia() < this.dia){
                edad = edad - 1;
            }
        }
        
    }
    
    public int preguntarEdad(Asistente asistente){
        int respuesta = asistente.getEdad();        
        return respuesta;
    }
    
}
