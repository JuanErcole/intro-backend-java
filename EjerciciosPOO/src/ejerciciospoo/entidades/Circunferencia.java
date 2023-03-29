package ejerciciospoo.entidades;

import java.util.Scanner;


public class Circunferencia {

    // Atributos
    private double radio;

    
    // Constructor
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    
    
    // Metodos
    public double getRadio() { // Metodo de consulta
        return radio;
    }

    public void setRadio(double radio) { // metodo modificador
        this.radio = radio;
    }
    
    
    // Metodos de operacion
    public void crearCircunferencia(){         
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio = leer.nextDouble();
    }
    
    public double area(){
        double area = Math.PI * Math.pow(radio, 2) ;
        return area;
    }
    
    public double perimetro(){
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
    
    
}
