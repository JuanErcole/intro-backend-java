package ejerciciospoo.entidades;

import java.util.Scanner;

public class Operacion {

    // ATRIBUTOS
    private int num1;
    private int num2;
    
    

    // CONSTRUCTORES
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }
    
    

    // METODOS ( getters son metodos de consulta, setters son metodos modificadores )
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    

    // METODOS OPERACIONALES
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
    }

    public int sumar() {
        return num1 + num2;
    }

    public int restar() {
        return num1 - num2;
    }

    public int multiplicar() {

        if(num1 == 0 || num2 == 0){
            System.out.println("No se puede multiplicar por 0");
            return 0;
        }else{
            return num1 * num2;
        }
        
    }

    public double dividir() {
        
        double numero1 = num1;
        double numero2 = num2;
        
        if(numero1 == 0 || numero2 == 0){
            System.out.println("No se puede multiplicar por 0");
            return 0;
        }else{
            return  numero1 / numero2;
        }
    }

}
