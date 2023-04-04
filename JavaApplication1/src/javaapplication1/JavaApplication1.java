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

        /*
        
        Math.PI // 3.141592653589793
        Math.E // 2.718281828459045

        Math.ceil(2.1) // 3.0 (redondear hacia arriba)
        Math.floar(2.1) // 2.0 (redondear hacia abajo)

        Math.pow(2, 3) // 8.0 (número elevado a una potencia)
        Math.sqrt(3) // 1.73... (raíz cuadrada)

        Math.max(2, 3) // 3.0 (el número más grande)

        // Área de un círculo (PI * r^2):
        Math.PI * Math.pow(r, 2)

        // Área de una esfera (4 * PI * r^2):
        4 * Math.PI * Math.pow(r, 2)

        // Volumen de una esfera ( (4/3) * PI * r^3):
        (4/3) * Math.PI * Math.pow(r, 3)
        
         */
    }

}
