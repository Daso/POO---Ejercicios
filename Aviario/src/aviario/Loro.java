
package aviario;

import appinterfaces.IProducto;


public class Loro extends Ave implements IProducto {
    private Producto producto;

    public Loro(String codigo, String descripcion,double precio, String nombreCientifico) {
        super(nombreCientifico);
        producto = new Producto(codigo, descripcion, precio);
    }
    
    public String cantar(){
        String texto = fraseCantar + " como un loro";
        return texto;
    }
    
    public String volar(){
        String texto = fraseVolar + " como un loro";
        return texto;
    }

    public Producto getProducto() {
        return producto;
    }
    
    public double getPrecioUnitario(){
        return producto.getPrecioUnitario();
    }
    
    public String getDescripcion(){
        return producto.getDescripcion();
    }
    
    public String getCodigo(){
        return producto.getCodigo();
    }
}
