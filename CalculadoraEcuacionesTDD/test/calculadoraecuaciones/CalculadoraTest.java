/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraecuaciones;

import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraTest {    
         
    
    @Test
    public void ecuacionDebeCalcularX1(){
        //Datos de prueba        
        double a = 5;
        double b = 4;
        double c = -1;
        double x1Esperado = 0.2;        
        //Ejecutamos los métodos
        Ecuacion ecuacion = new Ecuacion(a,b,c);
        double x1Retornado = ecuacion.calcularX1();        
        assertEquals(x1Esperado, x1Retornado, 0);
        
    }
    @Test
    public void ecuacionDebeCalcularX1conOtrosValores(){
        double a = 2;
        double b = -1;
        double c = -1;
        double X1Esperado = 1.0;
        
        Ecuacion ecuacion = new Ecuacion(a, b, c);
        double x1Retornado = ecuacion.calcularX1();
        assertEquals(X1Esperado, x1Retornado, 0);
    }
    
    @Test
    public void ecuacionDebeCalcularX2(){
        double a = 5;
        double b = 4;
        double c = -1;
        
        double x2Esperado = -1;
         Ecuacion ecuacion = new Ecuacion(a, b, c);
        double x2Retornado = ecuacion.calcularX2();
        assertEquals(x2Esperado, x2Retornado, 0);
    }
    @Test
    public void ecuacionDebeCalcularX2ConOtrosValores(){
         double a = 2;
        double b = -1;
        double c = -1;
        
        double x2Esperado = -0.5;
         Ecuacion ecuacion = new Ecuacion(a, b, c);
        double x2Retornado = ecuacion.calcularX2();
        assertEquals(x2Esperado, x2Retornado, 0);
    }
    
}
