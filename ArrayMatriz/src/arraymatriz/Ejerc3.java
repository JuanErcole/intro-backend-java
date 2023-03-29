package arraymatriz;

import java.util.Scanner;

public class Ejerc3 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int unDigito = 0;
        int dosDigitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;

        int[] vector = new int[15];

        for (int i = 0; i < vector.length; i++) {

            System.out.println("Ingrese el valor de la pos " + i + " Debe ser con numeros de 1 a 5 digistos");

            vector[i] = entrada.nextInt();
        }
 
        for (int i = 0; i < vector.length; i++) {
            
            if ( vector[i] >= 0 && vector[i] < 10){
                unDigito++;
            }else if(vector[i] >= 10 && vector[i] < 100){
                dosDigitos++;
            }else if(vector[i] >= 100 && vector[i] < 1000){
                tresDigitos++;
            }else if( vector[i] >= 1000 && vector[i] < 10000 ){
                cuatroDigitos++;
            }else{
                cincoDigitos++;
            }
        
        }
        
        System.out.println("Numeros de 1 digito = " +unDigito);
        System.out.println("Numeros de 2 digito = " +dosDigitos);
        System.out.println("Numeros de 3 digito = " +tresDigitos);
        System.out.println("Numeros de 4 digito = " +cuatroDigitos);
        System.out.println("Numeros de 5 digito = " +cincoDigitos);
        
    }
    
}
