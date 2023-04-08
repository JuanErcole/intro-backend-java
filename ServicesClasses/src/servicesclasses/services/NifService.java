package servicesclasses.services;

import java.util.Scanner;
import servicesclasses.entities.NIF;


public class NifService {

    public void crearNif(NIF n){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese su dni");
        long dni = read.nextLong();
        n.setDni(dni);
        
        n.setLetter(calcularLetra(dni));
        
    }   
    
    public void mostrar(NIF n){
        long dni = n.getDni();
        String letra = n.getLetter();
        System.out.println("Su NIF es "+dni+"-"+letra);
    }
    
    private String calcularLetra(long dni){
        
        String[] buscarLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        
        int resto = (int) (dni % 23);
        System.out.println(resto);
        
        return buscarLetra[resto];  
    }
}


