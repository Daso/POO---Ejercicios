package calculadoraestadistica;

import java.util.ArrayList;


public class Calculadora {
    private ArrayList<Dato> operandos;

    public Calculadora() {
        operandos = new ArrayList<Dato>();
    }

    public void registrarDato(double valor){
        Dato objDato = new Dato(valor);
        operandos.add(objDato);
    }

    public ArrayList<Dato> getOperandos(){
        return operandos;
    }

    public double suma(){
        double total = 0;
        for(Dato dato : operandos)
            total += dato.getValor();
        return total;
    }

    public int getCantidadOperandos(){
        return operandos.size();
    }

    public double promedio(){
        int cantidad = getCantidadOperandos();
        return (cantidad==0) ? 0.00 : suma()/cantidad;
           
    }

    public double maximo(){
        double max = 0;
        int cantidadOperandos = getCantidadOperandos();
        if(cantidadOperandos > 0){
            max = operandos.get(0).getValor();
            for (Dato dato : operandos){
                if(dato.getValor() > max)
                    max = dato.getValor();
            }
        }
        return max;
    }

}
