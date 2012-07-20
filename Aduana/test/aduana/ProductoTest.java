
package aduana;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;


public class ProductoTest {
    
    @Test
    public void DebeExistirLaClaseProductoYNoSerNull(){
        Producto producto = new Producto();
        Assert.assertNotNull(producto);                
    }
    
    @Test
    public void ProductoDebeTenerAtributos(){
        Producto producto = new Producto("001","lote01","Arroz",100.00);
        Assert.assertEquals("001", producto.getCodigo());
        Assert.assertEquals("lote01", producto.getLote());
        Assert.assertEquals("Arroz", producto.getDescripcion());
        Assert.assertEquals(100.00, producto.getCosto(),0.0);
    }
    
    @Test
    public void ProductoDebeCalcularSuImpuesto(){
        Producto producto = new Producto("001","lote01","Arroz",100.00);
        Assert.assertEquals(12.00,producto.getImpuesto(),0.01);
    }
    
    @Test
    public void ProductoDebeCalcularSuImpuestoSiEsMasDeDoscientoConVeintiCincoPorciento(){
       Producto producto = new Producto("002","lote02","Menta",1000.00); 
       Assert.assertEquals(250.00,producto.getImpuesto(),0.01);
    }
}
