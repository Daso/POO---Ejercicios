package calculadora;

public class Main {

   
    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();
        Calculadora pepito = new Calculadora();
        System.out.println(pepito.producto(5,42));
        System.out.println(calculadora1.suma(4,6));
    }
}
