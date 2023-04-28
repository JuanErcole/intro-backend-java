package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Colecciones {

    public static void main(String[] args) {

        /*
        ArrayList<Integer> listado = new ArrayList<Integer>();
        TreeSet<String> numeros = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();
        */
        
        Scanner read = new Scanner(System.in);
        
        ArrayList<String> cadenas = new ArrayList<>();
        HashSet<Integer> numerosB = new HashSet();
        HashMap<Integer, String> personas = new HashMap();
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Ingrese una cadena:");
            String cadena = read.nextLine();
            
            System.out.println("Ingrese un numero:");
            Integer num = read.nextInt();
            read.nextLine();
            
            System.out.println("Ingrese dni:");
            Integer dni = read.nextInt();
            read.nextLine();
            
            System.out.println("Ingrese Nombre:");
            String nombre = read.nextLine();
            
            
            cadenas.add(cadena);
            numerosB.add(num);
            personas.put(dni, nombre);
        }
        
        cadenas.remove("Hola"); // El elemnto o el indice
        numerosB.remove(1);
        personas.remove(38647616);            
            
        System.out.println(cadenas);
        System.out.println(numerosB);
        System.out.println(personas);

    }

}
