
package model;

import appinterfaces.IProducto;
import db.dbCanarios;
import java.util.ArrayList;

public class Canario extends Ave implements IProducto{
    
    private Producto producto;
    
    public Canario(String codigo,String descripcion, double precio,String nombreCientifico) {
        super(nombreCientifico);
        producto = new Producto(codigo, descripcion, precio);
    }
    
    
    public String volar(){
        String texto = fraseVolar + " como un canario";
        return texto;
    }
    
    public String cantar(){
        String texto = fraseCantar + " como un canario";
        return texto;
    }
    
    public String getCodigo(){
        return producto.getCodigo();
    }
    
    public String getDescripcion(){
        return producto.getDescripcion();
    }
    
    public double getPrecioUnitario(){
        return producto.getPrecioUnitario();
    }
    
    public static ArrayList<IProducto> getCanarios(){
        dbCanarios canarios =  new dbCanarios();             
        return canarios.simulaDataCanarios();
    }
    
}
