package clasesutilidad.services;

import clasesutilidad.entities.Person;
import java.util.Date;
import java.util.Scanner;

public class PersonService {

    public Person crearPersona() {

        Scanner read = new Scanner(System.in);

        System.out.println("Nombre");
        String name = read.nextLine();

        System.out.println("dia de nacimiento");
        int dia = read.nextInt();

        System.out.println("mes");
        int mes = read.nextInt();

        System.out.println("Año ( solo los ultimos 2 numeros )");
        int anio = read.nextInt();

        return new Person(name, new Date(anio, mes -1, dia));

    }

    public int calcularEdad(Person p) {
        Date fechaActual = new Date();
        Date nacim = p.getNacimiento();

        // Calcular la diferencia en milisegundos entre las dos fechas
        long diferenciaEnMilisegundos = fechaActual.getTime() - nacim.getTime();

        // Convertir la diferencia en milisegundos a días
        long diferenciaEnDias = diferenciaEnMilisegundos / (24 * 60 * 60 * 1000);

        // Convertir la diferencia en días a años
        int edad = (int) (diferenciaEnDias / 365);
        System.out.println("La edad del usuario es " + edad + " años.");
        return edad;
        
    }
    
    public boolean menorQue(Person p, int edad){
        int edadUser = calcularEdad(p);
        return edadUser < edad;
    }
    
    public void mostrarPersona(Person p){
        System.out.println( p.toString() );
    }

}
