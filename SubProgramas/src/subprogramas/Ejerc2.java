package subprogramas;

import java.util.Scanner;

public class Ejerc2 {

    public static void main(String[] args) {

        System.out.println("Bienvenido al programa");

        mostrarPersona();

    }

    public static void mostrarPersona() {

        Scanner entrada = new Scanner(System.in);
        boolean login = true;
        String name;
        int age;

        do {

            System.out.println("Ingrese nombre de la persona");
            name = entrada.nextLine();

            System.out.println("Ingrese la edad de la persona");
            age = entrada.nextInt();

            if (age < 18) {
                System.out.println(name + " tiene " + age + " años y es menor de edad");
            } else {
                System.out.println(name + " tiene " + age + " años y es mayor de edad");
            }
            
            System.out.println("Desea ingresar otra persona? S/N para confirmar.");
            String seguir = entrada.next();

            if (seguir.equals('n')) {
                login = false;
            }
        } while (login);

    }

}
