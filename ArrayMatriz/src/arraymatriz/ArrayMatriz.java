package arraymatriz;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMatriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Creo un arreglo llamado vector con dimensión 5 que
        // solo pueda alojar números enteross
        int[] equipo = new int[7];

        System.out.println("Introduxa nombre");

        for (int i = 0; i < 7; i++) {

            String nombre = entrada.nextLine();
            System.out.println("Nombre: " + nombre);
        }

        // Creo una matriz con dimensión 3x3 que
        // solo pueda alojar cadenas
        String[][] matriz = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = "s";
            }
        }

    }

}
