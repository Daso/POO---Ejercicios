package aviario;

import appinterfaces.IAve;
import appinterfaces.IProducto;
import junit.framework.Assert;
import org.junit.Test;

public class CanarioTest {

    @Test
    public void canarioDebeReconocerComportamientoDeAve() {

        String codigo = "PR001";
        String nombre = "Canario";
        double precio = 50.00;
        String nombreCientifico = "Canarious";
        IAve canario = new Canario(codigo, nombre, precio,nombreCientifico);

        canario.volar();
        canario.cantar();
        String retornado = canario.getNombreCientifico();

        Assert.assertEquals(nombreCientifico, retornado);

    }

    @Test
    public void canarioDebeCantarComoCanario() {
          String codigo = "PR001";
        String nombre = "Canario";
        double precio = 50.00;
        String nombreCientifico = "Canarious";
        IAve canario = new Canario(codigo, nombre, precio,nombreCientifico);
        System.out.println(canario.cantar());
        Assert.assertEquals("Estoy cantando como un canario", canario.cantar());
    }

    @Test
    public void canarioDebeVolarComoCanario() {
        String codigo = "PR001";
        String nombre = "Canario";
        double precio = 50.00;
        String nombreCientifico = "Canarious";
        IAve canario = new Canario(codigo, nombre, precio,nombreCientifico);
        System.out.println(canario.volar());
        Assert.assertEquals("Estoy volando como un canario", canario.volar());
    }
    @Test
    public void canarioDebeReconocerComportamientoDeProducto(){
        String codigo = "PR001";
        String nombre = "Canario";
        double precio = 50.00;
        String nombreCientifico = "Canarious";
        IProducto canario = new Canario(codigo, nombre, precio,nombreCientifico);
        double precioRetornado = canario.getPrecioUnitario();
        Assert.assertEquals(precio, precioRetornado, 0.0);
        
        
    }
}
