
package veterinaria_upc;

public class Doctor {
    private String nombre;

    public Doctor(String nombre) {
        this.nombre = nombre;
    }
    
    public void vacunarPerro(Perro perroAVacaunar){
        perroAVacaunar.setVacunado(true);
    }
    
}
