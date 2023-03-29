package ejerciciospoo.entidades;

import java.util.Scanner;

public class Rectangulo {

    // ATRIBUTOS
    private int base;
    private int altura;
    
    
    
    //CONSTRUCTORES
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    
    // METODOS DE CONSULTA Y METODOS MODIFICADORES
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    

    // METODOS OPERACIONALES
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la base del ractangulo en cm");
        base = leer.nextInt();

        System.out.println("Ingrese la altura del ractangulo en cm");
        altura = leer.nextInt();
    }

    public void calcularSuperficie() {
        int superficie = base * altura;
        System.out.println("La superficie del rectangulo es " + superficie);
    }

    public void calcularPerimetro() {
        int perimetro = (base + altura) * 2;
        System.out.println("El perimetro del rectangulo es " + perimetro);
    }

    public void dibujarRectangulo() {
        int i = 0;
        int j = 0;
        
        while(i < altura){
            while( j < base){
                System.out.print("*");
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }
        
    }

}
