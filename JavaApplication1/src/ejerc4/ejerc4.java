package ejerc4;

import java.util.Scanner;

public class ejerc4 {

    public static void main(String[] args) {

        int gradosCentigrados, gradosFar;
        Scanner entradaGrados = new Scanner(System.in);

        System.out.println("Cuantos grados centigrados hacen?");

        gradosCentigrados = Integer.parseInt(entradaGrados.next());
        gradosFar = 32 + (9 * gradosCentigrados / 5);

        System.out.println("Su equivalente a grados Fahrenheit es: " + gradosFar);

    }

}
