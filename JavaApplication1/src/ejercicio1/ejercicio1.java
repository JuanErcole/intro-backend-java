package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

    // Primer ejercicio
    /*
        Escribir un programa que pida dos números enteros por teclado y 
        calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
     */
    public static void main(String[] args) {

        int num1, num2, resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido, por favor ingrese un numero entero");
        num1 = Integer.parseInt(entrada.next());

        System.out.println("Por favor ingrese un segundo numero entero");
        num2 = Integer.parseInt(entrada.next());

        resultado = num1 + num2;    
        
        System.out.println("El resultado de la suma de " + num1 + " + " + num2 + " es: " + resultado);
        
    }

}
