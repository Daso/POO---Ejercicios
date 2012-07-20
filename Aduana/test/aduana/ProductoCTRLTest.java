
package aduana;

import org.junit.Assert;
import org.junit.Test;

public class ProductoCTRLTest {
    ProductoCTRL productos = new ProductoCTRL();
    
    @Test
    public void DeboTenerUnArregloDeProductos(){
        Assert.assertNotNull(productos.getProductos());
    }
    
    @Test
    public void DeboPoderAgregarUnProducto(){
        Producto producto = new Producto("003","lote02", "Carne", 300.00);
        productos.addProducto(producto);
        Assert.assertEquals(productos.getProductos().size(), 1);
    }
    
    @Test
    public void DeboPoderCalcularElTotal(){
        Producto producto1 = new Producto("003","lote02", "Carne", 100.00);
        Producto producto2 = new Producto("004","lote03", "Leche", 100.00);
        productos.addProducto(producto1);
        productos.addProducto(producto2);
        Assert.assertEquals(24.00, productos.getTotal(),0.0);
        
    }
}
