package javaapplication2;

import java.util.Iterator;
import java.util.Scanner;

public class ejerc8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int cuadrado;

        System.out.println("Ingrese tamaño de cuadrado");

        cuadrado = entrada.nextInt();

        for (int i = 0; i < cuadrado; i++) {
            System.out.print("*");
        }

        System.out.println("");
        
        for (int i = 0; i < cuadrado - 2; i++) {
            
            System.out.print("*");
            
            for ( int j = 0; j < cuadrado - 2; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < cuadrado; i++) {
            System.out.print("*");
        }

    }
}

