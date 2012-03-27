
package babyshower;
import org.junit.Test;
import static org.junit.Assert.*;


public class AsistenteTest {
    Asistente asistente1 = new Asistente("Martha", 20 , 2, 1960);
    Asistente asistente2 = new Asistente("Norma", 10 , 7, 1960);
    Asistente asistente3 = new Asistente("Mariela", 28 , 3, 1980);
    Asistente asistente4 = new Asistente("Karla", 28 , 12, 2000);
    
    
    @Test
    public void asistenteDebeTenerNombre(){
        Asistente asistente = new Asistente("Martha", 20 , 2, 1960);
        assertNotNull(asistente.getNombre());                        
    }
    
    @Test
    public void asistenteDebeTenerUnaEdad(){
        Asistente asistente = new Asistente("Martha", 20 , 2, 1960);
        assertNotNull(asistente.getEdad());
    }
    
    @Test    
    public void asistenteDebeCalcularSuEdadCorrecta(){
        Asistente asistente = new Asistente("Martha", 20 , 2, 1960);
        assertEquals(52, asistente.getEdad());
    }
    
    @Test
    public void asistenteDebeCalcularSuEdadCorrectaTomandoEnCuentaElMes(){
        Asistente asistente = new Asistente("Norma", 10 , 7, 1960);
        assertEquals(51, asistente.getEdad());
    }
    
    @Test
    public void asistenteDebeCalcularSuEdadCorrectaTomandoEnCuentaElDia(){
        Asistente asistente = new Asistente("Mariela", 28 , 3, 1980);
        assertEquals(31, asistente.getEdad());
    }
    
    @Test
    public void asistenteSiempreDebeCalcularSuEdadCorrectaTomandoEnCuentaLaFecha(){
         Asistente asistente = new Asistente("Karla", 28 , 12, 2000);
        assertEquals(11, asistente.getEdad());
    }
    
    
    
    @Test
    public void asistenteDebeRecibirLaEdadDeLaAsistenteALaQueSeLoPregunta(){
        
        
        int edadRecibida = asistente1.preguntarEdad(asistente2);
        int edadEsperada = asistente2.getEdad();
        System.out.println("La edad de " + asistente2.getNombre()+" es: " + edadEsperada);
        System.out.println(asistente1.getNombre()+ " pregunta a "+asistente2.getNombre()+ " su edad");
        System.out.println("y "+asistente2.getNombre()+ " dice que tiene: " + edadRecibida);
        assertEquals(edadEsperada, edadRecibida);                
    }
    
}

