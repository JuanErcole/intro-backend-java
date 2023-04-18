package clasesutilidad.entities;


public class ParDeNumeros {

    // ATRIBUTOS
    private double num1;
    private double num2;

    // CONSTRUCTOR
    public ParDeNumeros() {
        num1 = ( Math.random() * 10);
        num2 = ( Math.random() * 10);
    }
    
    // METODOS

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    
    
    
}
