package clasesutilidad.services;

import clasesutilidad.entities.Cadena;
import java.util.Scanner;

public class CadenaService {

    public void mostrarVocales(Cadena c) {
        int vocales = 0;
        String frase = c.getFrase();
        System.out.println(frase);

        for (int i = 0; i < frase.length(); i++) {

            String letra = frase.substring(i, i).toUpperCase();
            System.out.println(letra);
            switch (letra) {

                case "A":
                    vocales++;
                    break;
                case "E":
                    vocales++;
                    break;
                case "I":
                    vocales++;
                    break;
                case "O":
                    vocales++;
                    break;
                case "U":
                    vocales++;
                    break;
            }
        }

        System.out.println("La cantidad de vocales que tiene la frase es: " + vocales);
    }

    public void invertirFrase(Cadena c) {

        String frase = c.getFrase();

        StringBuilder sb = new StringBuilder(frase);
        String nuevaFrase = sb.reverse().toString();

        System.out.println("La frase al reves es: " + nuevaFrase);

    }

    public void vecesRepetida(Cadena c) {

        Scanner read = new Scanner(System.in);
        String frase = c.getFrase();
        int count = 0;

        System.out.println("Ingrese una letra a buscar");
        String letra = read.nextLine().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {

            String subStr = frase.substring(i, i+1).toLowerCase();

            if (subStr.equals(letra)) {
                count++;
            }
        }

        System.out.println("La cantidad de veces que aparece la letra " + letra + " es " + count);

    }
    
    public void compararLong(Cadena c){
        
        Scanner read = new Scanner(System.in);
        String frase = c.getFrase();
        
        System.out.println("Ingrese una frase");
        String fraseUser = read.nextLine();
        
        if(frase.length() == fraseUser.length()){
            System.out.println("Las frases tienen el mismo largo");
            return; 
        }
        
        System.out.println("Las frases tienen distintos largos");
        
    }
    
    public void unirFrases(Cadena c){
        
        Scanner read = new Scanner(System.in);
        String frase = c.getFrase();
        System.out.println("Ingrese una frase");
        String fraseUser = read.nextLine();
        String nuevaFrase = frase.concat(fraseUser);
        System.out.println("La frase concatenada es: "+nuevaFrase);
        
    }

}












