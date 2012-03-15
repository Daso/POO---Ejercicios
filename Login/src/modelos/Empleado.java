
package modelos;


public class Empleado extends Usuario{
    private String codigoEmpleado;

    public Empleado(String codigoEmpleado, String nombre, String apellido, String userName, String password) {
        super(nombre, apellido, userName, password);
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
    
}
