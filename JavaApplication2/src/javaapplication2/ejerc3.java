package javaapplication2;

import java.util.Scanner;

public class ejerc3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra");

        String frase = entrada.nextLine();

        if (frase.length() == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Icorrecto");
        }

    }

}
