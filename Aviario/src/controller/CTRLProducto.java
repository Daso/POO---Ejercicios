
package controller;

import appinterfaces.IProducto;
import java.util.ArrayList;
import model.Canario;
import model.Loro;


public class CTRLProducto {
    public static ArrayList getProductos(int opcion){
        ArrayList<IProducto> canarios = Canario.getCanarios();        
        ArrayList<IProducto> loros = Loro.getLoros();
      
        switch(opcion){
            case 1:                      
                return canarios;                
            case 2: 
                return loros;                
            case 3:     
               ArrayList<IProducto> productos = new ArrayList<IProducto>();
               productos.addAll(loros);
               productos.addAll(canarios);
               return productos;
        }
       return null;
    }
}
