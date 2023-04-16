package clasesutilidad.services;

import clasesutilidad.entities.Cadena;


public class CadenaService {

    public void mostrarVocales( Cadena c){
        int vocales = 0;
        String frase = c.getFrase();
        System.out.println(frase);
        
        for (int i = 0; i < frase.length(); i++) {
            
            String letra = frase.substring(i, i).toUpperCase();
            System.out.println(letra);
            switch(letra){
                
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
        
        System.out.println("La cantidad de vocales que tiene la frase es: "+vocales);
    }
    
    public void invertirFrase( Cadena c ){
        
        String frase = c.getFrase();
        
        StringBuilder sb = new StringBuilder(frase);
        String nuevaFrase = sb.reverse().toString();
        
        System.out.println("La frase al reves es: "+nuevaFrase);
        
    }
    
}



















