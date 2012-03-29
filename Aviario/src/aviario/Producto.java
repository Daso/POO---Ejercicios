
package aviario;

import appinterfaces.IProducto;


public class Producto implements IProducto{
    protected String codigo;
    protected String descripcion;
    protected double precioUnitario;

    public Producto(String codigo, String descripcion, double precioUnitario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
    
}
