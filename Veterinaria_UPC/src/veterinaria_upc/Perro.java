package veterinaria_upc;

public class Perro {
    private String nombre;
    private String raza;    
    private int tamanho;
    private boolean vacunado;

    public Perro(String nombre, String raza, int tamanho) {
        this.nombre = nombre;
        this.raza = raza;       
        this.tamanho = tamanho;
        this.vacunado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public String getRaza() {
        return raza;
    }
    
    
    
    
}
