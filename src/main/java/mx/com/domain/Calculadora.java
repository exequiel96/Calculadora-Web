package mx.com.domain;

public class Calculadora {
    private double numero1, numero2, resultado;
    
    public Calculadora(){
        
    }
    
    public Calculadora(double numero1, double numero2){
        this.numero1= numero1;
        this.numero2= numero2;
    }
    
    public Calculadora(double resultado){
        this.resultado= resultado;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    
    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double getResultado() {
        return resultado;
    }
    
    public void setResultado(double resultado) {
        this.resultado= resultado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.numero1) ^ (Double.doubleToLongBits(this.numero1) >>> 32));
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.numero2) ^ (Double.doubleToLongBits(this.numero2) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Calculadora other = (Calculadora) obj;
        if (Double.doubleToLongBits(this.numero1) != Double.doubleToLongBits(other.numero1)) {
            return false;
        }
        return Double.doubleToLongBits(this.numero2) == Double.doubleToLongBits(other.numero2);
    }

    @Override
    public String toString() {
        return "Calculadora{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
}
