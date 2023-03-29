package javaapplication2;

import java.util.Scanner;

public class ejercExtra1 {

    public static void main(String[] args) {
        

        Scanner entrada = new Scanner(System.in);
        double minutos;

        System.out.println("Ingrese un tiempo en minutos");

        minutos = entrada.nextInt();

        double dias = minutos / 1440;
        double horas = minutos / 60;

        System.out.println("Ingreso " + minutos + " minutos, equivalen a " + dias + " dias, y a " + horas + " horas");

    }
}
