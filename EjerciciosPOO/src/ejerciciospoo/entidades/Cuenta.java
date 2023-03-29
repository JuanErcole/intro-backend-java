package ejerciciospoo.entidades;

import java.util.Scanner;

public class Cuenta {

    private double saldo;
    private String titular;

    
    
    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    
    

    public void retirarDinero() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Cuanto quiere retirar?");
        int retiro = leer.nextInt();
        
        if( retiro > saldo ){
            System.out.println("Saldo insuficiente");
            return;
        }else{
            System.out.println("Aqui tiene");
            saldo -= retiro;
        }
        
        System.out.println("Tu saldo quedo en: " + saldo);

    }

}
