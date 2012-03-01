package calculadora;

public class Calculadora {

     public int suma( int operando1, int operando2 ){
        int suma = operando1 + operando2;
        return suma;
    }

    public int resta( int operando1, int operando2 ){
        int resta = operando1 - operando2;
        return resta;
    }

    public int producto( int operando1, int operando2 ){
        int producto = operando1 * operando2;
        return producto;
    }

    private boolean esCero(int numero){
        if(numero == 0){
            return true;
        }else{
            return false;
        }
    }

    public int cociente( int operando1, int operando2 ){
            if(esCero(operando2)){
                return 0;
            }else{
                return operando1 / operando2;
            }
    }
}
