package javaapplication2;

import java.util.Scanner;

public class ejerc2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una frase");

        String frase = entrada.nextLine();

        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Icorrecto");
        }

    }

}
