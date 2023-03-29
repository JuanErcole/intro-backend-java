package arraymatriz;

import java.util.Scanner;

public class Ejerc2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numBuscar;

        System.out.println("Ingrese el tamañano del vector a llenar");

        int tamanio = entrada.nextInt();

        int[] vectorUser = new int[tamanio];

        for (int i = 0; i < vectorUser.length; i++) {

            double numRandom = Math.random() * 10;

            vectorUser[i] = (int) numRandom;
        }

        System.out.println("Que num quiere buscar? entre 0 y 9");
        numBuscar = entrada.nextInt();

        int numEncontrado = 0;
        
        for (int i = 0; i < vectorUser.length; i++) {

            if (vectorUser[i] == numBuscar) {
                System.out.println("Numero encontrado en la pos " + i);
                numEncontrado ++;
            }
        }

    }
}
