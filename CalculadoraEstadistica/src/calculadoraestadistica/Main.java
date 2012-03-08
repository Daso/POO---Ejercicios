/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraestadistica;

/**
 *
 * @author pcsidsub
 */
public class Main {

    
    public static void main(String[] args) {
        int cantidadElementos;
        Calculadora calculadora = new Calculadora();

        calculadora.registrarDato(40.0);
        calculadora.registrarDato(10.0);
        calculadora.registrarDato(30.0);
        cantidadElementos = calculadora.getOperandos().size();
        for(int aux = 0;aux < cantidadElementos;aux++){
            System.out.println(calculadora.getOperandos().get(aux).getValor());
        }
        
        System.out.println(calculadora.suma());

        System.out.println(calculadora.promedio());

        System.out.println("El máximo es:" + calculadora.maximo());

    }

}
