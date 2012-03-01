package clase;

public class Alumno {

    private String nombre;

    public String saludar(Alumno alumno){
        String mensaje = "Soy " + nombre + " hola ";
        return mensaje + " " + alumno.getNombre();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
