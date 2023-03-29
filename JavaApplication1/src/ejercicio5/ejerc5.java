package ejercicio5;

import java.util.Scanner;

public class ejerc5 {

    public static void main(String[] args) {

        int num, dobleNum, tripleNum;
        double raizNum;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");

        num = Integer.parseInt(leer.next());
        dobleNum = num * 2;
        tripleNum = num * 3;
        raizNum = Math.sqrt(num);

        System.out.println("El doble de " + num + " es: " + dobleNum);
        System.out.println("El triple de " + num + " es: " + tripleNum);
        System.out.println("La raiz cuadrada de " + num + " es: " + raizNum);

    }

}
