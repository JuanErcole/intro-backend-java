package javaapplication2;

import java.util.Scanner;

public class ejerc7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String cadena;
        int cadenasCorrectas = 0;
        int cadenasIncorrectas = 0;

        do {

            System.out.println("Leyendo cadena...");
            cadena = entrada.nextLine();
            String result = validar(cadena);

            if (result.equals("correct")) {
                cadenasCorrectas++;
            } else if ( result.equals("incorrect") ) {
                cadenasIncorrectas++;
            } else {
                System.out.println("Se recibio el comando para salir");
            }

        } while (!"&&&&&".equals(cadena));

        System.out.println("Cadenas correctas: " + cadenasCorrectas);
        System.out.println("Cadenas Incorrectas: " + cadenasIncorrectas);

    }

    public static String validar(String cadena) {
        
        if ( cadena.equals("&&&&&") ){
            return "";
        }

        int largo = cadena.length();
        String primerLetra = cadena.substring(0, 1);
        String ultimaLetra = cadena.substring(largo - 1);

        if (largo >= 5 && primerLetra.equals("X") && ultimaLetra.equals("O")) {
            return "correct";
        } else {
            return "incorrect";
        }

    }
}
// !"&&&&&".equals(cadena)