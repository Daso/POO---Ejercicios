/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author operador
 */
public class AlumnoTest {
    
    @Test
    public void alumnosDebeTenerUnaCalificacion(){        
        String codigo = "u811000";
        String nombre = "Miguel";
        String modalidad = "Tradicional";
        Alumno alumno = new Alumno(codigo,nombre,modalidad);
        Calificacion calificacion = alumno.getCalificacion();
        Assert.assertNotNull(calificacion);
    }
    
    @Test 
    public void alumnoConModalidadTradicionalDebeCalcularSuPromedioFinal(){
        String codigo = "u811000";
        String nombre = "Miguel";
        String modalidad = "Tradicional";
        double examenParcial = 10;
        double examenFinal = 10;
        double pc1 = 10;
        double pc2 = 10;
        Alumno alumno = new Alumno(codigo,nombre,modalidad);
        alumno.getCalificacion().setExamenParcial(examenParcial);
        alumno.getCalificacion().setExamenFinal(examenFinal);
        ((CalificacionTradicional)alumno.getCalificacion()).setPc1(pc1);
        ((CalificacionTradicional)alumno.getCalificacion()).setPc2(pc2);        
        double retornado = alumno.getCalificacion().calcularPromedioFinal();
        Assert.assertTrue(retornado > 0);
        
    }
  
    
     @Test
     public void alumnosConModalidadPracticaDebeCalcularSuPromedioFinal(){
          String codigo = "u811000";
        String nombre = "Miguel";
        String modalidad = "Practica";
        double examenParcial = 20;
        double examenFinal = 20;
        double tb1 = 20;
        double tb2 = 20;
        double proyecto = 10;
        Alumno alumno = new Alumno(codigo,nombre,modalidad);
         alumno.getCalificacion().setExamenParcial(examenParcial);
         alumno.getCalificacion().setExamenFinal(examenFinal);
         ((CalificacionPractica)alumno.getCalificacion()).setTb1(tb1);
         ((CalificacionPractica)alumno.getCalificacion()).setTb2(tb2);
         ((CalificacionPractica)alumno.getCalificacion()).setProyecto(proyecto);
         
         double retornado = alumno.getCalificacion().calcularPromedioFinal();
         Assert.assertTrue(retornado > 0);
     }         
}
