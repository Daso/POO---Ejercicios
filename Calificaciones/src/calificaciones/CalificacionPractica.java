/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;

/**
 *
 * @author operador
 */
public class CalificacionPractica extends Calificacion{
    private double tb1;
    private double tb2;
    private double proyecto;

    public CalificacionPractica() {
        super();
        this.tb1 = 0.0;
        this.tb2 = 0.0;
        this.proyecto = 0.0;
    }

    
    
    public double getProyecto() {
        return proyecto;
    }

    public void setProyecto(double proyecto) {
        this.proyecto = proyecto;
    }

    public double getTb1() {
        return tb1;
    }

    public void setTb1(double tb1) {
        this.tb1 = tb1;
    }

    public double getTb2() {
        return tb2;
    }

    public void setTb2(double tb2) {
        this.tb2 = tb2;
    }
    public double calcularPromedioFinal(){
        return 0.15*examenParcial + 0.25 * examenFinal + 0.10 * tb1 + 0.10 * tb2 + 0.40 * proyecto;
    }
    
}
