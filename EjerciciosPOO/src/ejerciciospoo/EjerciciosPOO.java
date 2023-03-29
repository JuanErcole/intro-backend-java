package ejerciciospoo;

import ejerciciospoo.entidades.Cancion;
import ejerciciospoo.entidades.Circunferencia;
import ejerciciospoo.entidades.Cuenta;
import ejerciciospoo.entidades.Juego;
import ejerciciospoo.entidades.Libro;
import ejerciciospoo.entidades.Operacion;
import ejerciciospoo.entidades.Receta;
import ejerciciospoo.entidades.Rectangulo;

public class EjerciciosPOO {

    public static void main(String[] args) {
        /*
        ejercicio 1
        
        Libro libro1 = new Libro();
        libro1.cargaLibro();
        libro1.mostrarLibro();
        */

        /*
        Ejercicio 2
        
        Circunferencia c1 = new Circunferencia(5);
        c1.crearCircunferencia();
        double area = c1.area();
        double perimetro = c1.perimetro();
        System.out.println("El area es: " + area + ", y el perimetro es: " + perimetro);
        */
        
        /*
        Ejercicio 3
        
        Operacion op1 = new Operacion();
        op1.crearOperacion();
        int suma = op1.sumar();
        int resta = op1.restar();
        int multiplicacion = op1.multiplicar();
        double division = op1.dividir();
        System.out.println("El resultado de las operaciones con los numeros ingreados son: \n Suma: " + suma + ", Resta: " + resta + ", multipl.: " + multiplicacion + ", division: " + division);       
        */
 
        /*
        Ejercico 4
        
        Rectangulo r1 = new Rectangulo();        
        r1.crearRectangulo();
        r1.calcularSuperficie();
        r1.calcularPerimetro();
        r1.dibujarRectangulo();               
        */
 
        /*
        Ejercicio extra 1
        
        Cancion c1 = new Cancion("cancioneta", "La Scaloneta");
        System.out.println(c1.presentacion());
        */
        
        /* 
        Ejercicio extra 3
        
        Juego j1 = new Juego();
        j1.iniciarJuego();        
        */
 
        Cuenta c1 = new Cuenta(54250, "Juan");
        
        c1.retirarDinero();
    }

}
