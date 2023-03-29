package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero");

        int num = Integer.parseInt(entrada.next());

        if (num % 2 == 0) {
            System.out.println(num + " Es par");
        } else {
            System.out.println(num + " Es impar");

        }

    }

}
