
import java.util.Scanner;

public class ejercicio2y3 {

    public static void main(String[] args) {

        String name, frase;
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        System.out.println("Por favor, ingrese su nombre");
        name = entrada.next();
        System.out.println("Su nombre es: " + name);

        /* --------------------------------------------- */
        System.out.println("Por favor, ingrese una frase");
        frase = entrada2.nextLine();

        System.out.println( frase.toUpperCase() );
        System.out.println( frase.toLowerCase() );

    }

}
