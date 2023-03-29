package javaapplication2;

import java.util.Scanner;

public class ejerc6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int option, num1, num2;

        System.out.println("Ingrese un numero entero");
        num1 = entrada.nextInt();
        System.out.println("Ingrese otro numero entero");
        num2 = entrada.nextInt();

        do {

            System.out.println("¿Que operacion desea realizar?");
            menu();
            option = entrada.nextInt();

            switch (option) {
                case 1: {
                    sumar(num1, num2);
                    break;
                }
                case 2: {
                    restar(num1, num2);
                    break;
                }
                case 3: {
                    multiplicar(num1, num2);
                    break;
                }
                case 4: {
                    dividir(num1, num2);
                    break;
                }
                case 5: {
                    System.out.println("¿Desea salir? S/N para confirmar");

                    String salir = entrada.next();

                    if (salir.equals("s")) {
                        option = 5;
                    } else{
                        option = 0;
                    }
                }
            }

        } while (option != 5);
    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
    }
    
    public static void sumar(int num, int num2){
        System.out.println("El resultado de la suma de los numeros ingresados es " + (num + num2));
    }
    public static void restar(int num, int num2){
        System.out.println("El resultado de la resta de los numeros ingresados es " + (num - num2));
    }
    public static void multiplicar(int num, int num2){
        System.out.println("El producto de la multiplicacion de los numeros ingresados es " + (num * num2));
    }
    public static void dividir(int num, int num2){
        System.out.println("El resultado de la division de los numeros ingresados es " + (num / num2));
    }
}
