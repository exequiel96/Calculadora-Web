package mx.com.operaciones;

public class OperacionesImpl implements Operaciones{

    @Override
    public double suma(double numero1, double numero2) {
        double resultado= numero1 + numero2;
        return resultado;
    }

    @Override
    public double resta(double numero1, double numero2) {
        double resultado= numero1 - numero2;
        return resultado;
    }

    @Override
    public double multiplicacion(double numero1, double numero2) {
        double resultado= numero1 * numero2;
        return resultado;
    }

    @Override
    public double division(double numero1, double numero2) {
        double resultado= numero1 / numero2;
        return resultado;
    }
    
}
