
package modelos;


public class Usuario {
    private String nombre;
    private String apellido;
    private String userName;
    private String password;

    public Usuario(String nombre, String apellido, String userName, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.userName = userName;
        this.password = password;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
    
}
