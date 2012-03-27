/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conejocolita;

import org.junit.Test;
import static org.junit.Assert.*;

public class DuenhoTest {
    
    @Test
    public void elDuenhoDebeTenerNombre(){
        Duenho duenho = new Duenho("Carlos", 5, "Colita");
        assertNotNull(duenho.getNombre());
    }
    
    @Test
    public void cuandoLeTocoLaOrejaAMiMascotaMueveLaCola(){
        Duenho duenho = new Duenho("Carlos", 5, "Colita");
        String mensajeRecibido = duenho.tocarOreja();
        assertSame("Estoy moviendo la cola",mensajeRecibido);
    }
    
    @Test 
    public void cuandoLeMuestroUnaZanahoriaSeAcerca(){
        Duenho duenho = new Duenho("Calos", 5, "Colita");
        String mensajeRecibido = duenho.mostrarZanahoria();
        assertSame("Me estoy acercando",mensajeRecibido);
    }
    
    
}
