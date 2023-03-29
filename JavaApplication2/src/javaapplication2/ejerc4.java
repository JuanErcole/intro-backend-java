package javaapplication2;

import java.util.Scanner;

public class ejerc4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra!");

        String frase = entrada.nextLine();
        String primerLetra = frase.substring(0, 1);

        if (primerLetra.equals("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Icorrecto");
        }

    }

}
