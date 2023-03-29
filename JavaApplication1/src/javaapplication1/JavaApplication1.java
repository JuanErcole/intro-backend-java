/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name = "Juanca";
        String name2 = "Juancy";
        int yearsOld = 28;
        double height = 1.2;
        char sexo = 'M';
        boolean developer = true;
        String nombre;
        boolean bandera;
        char letra;

        System.out.println("Ingrese su verdadero nombre");

        Scanner entrada = new Scanner(System.in);
        name = entrada.next();

        System.out.println("Su verdadero nombre es " + name);
    }

}
