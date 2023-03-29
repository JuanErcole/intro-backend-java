package javaapplication2;

import java.util.Scanner;

public class ejerc5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int valorLimite, contador = 0;

        System.out.println("Ingrese un valor limite positivo");

        valorLimite = Integer.parseInt(entrada.next());

        while (contador <= valorLimite) {
            System.out.println("Ingrese un numero");
            
            contador += Integer.parseInt( entrada.next() );       
        }

    }

}
