package ejerciciospoo.entidades;

import java.util.Scanner;

public class Juego {

    public Juego() {
    }
    

    //METODOS
    public void iniciarJuego() {

        Scanner leer = new Scanner(System.in);

        int numjugador2;

        System.out.println("Ingrese numero jugador 1");
        int numJugador1 = leer.nextInt();

        int intentos = 4;

        for (int i = 0; i < intentos; i++) {

            System.out.println("Intenta adivinar el numero");
            numjugador2 = leer.nextInt();

            if (numjugador2 == numJugador1) {
                System.out.println("Adivinaste");
                return;
            }
        }

        System.out.println("Se te acabaron los intentos");

    }

}
