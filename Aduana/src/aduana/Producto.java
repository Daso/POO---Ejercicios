/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aduana;


public class Producto {
    private String codigo;
    private String lote;
    private String descripcion;
    private double costo;
    private double impuesto;

    public Producto() {
    }
   
    public Producto(String codigo, String lote, String descripcion, double costo) {
        this.codigo = codigo;
        this.lote = lote;
        this.descripcion = descripcion;
        this.costo = costo;      
        calcularImpuesto();
    }

    public String getCodigo() {
        return codigo;
    }

    public double getCosto() {
        return costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getLote() {
        return lote;
    }

    public double getImpuesto() {
        return impuesto;
    }
    
    private void calcularImpuesto(){
        if (this.costo <= 200){
            impuesto = this.costo * 0.12;
        }else{
            impuesto = this.costo * 0.25;
        }
           
    }
    
    
}
