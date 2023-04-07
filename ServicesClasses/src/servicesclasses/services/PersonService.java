package servicesclasses.services;

import java.util.Scanner;
import servicesclasses.entities.Person;

public class PersonService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Person createPerson() {

        System.out.println("Nombre de la persona");
        String name = read.nextLine();

        System.out.println("Edad de la persona");
        int age = read.nextInt();

        System.out.println("Cual es su peso?");
        double weigth = read.nextDouble();

        System.out.println("Cual es su altura?");
        double height = read.nextDouble();

        System.out.println("Sexo: H para hombre, M para mujer, O para otro");
        char sex = read.next().charAt(0);
        sex = Character.toUpperCase(sex);
        read.nextLine();

        if (sex != 'H' && sex != 'M' && sex != 'O') {
            System.out.println("Las opciones son: H para hombre, M para mujer, O para otro");
            sex = read.nextLine().charAt(0);
            read.nextLine();
        }

        return new Person(name, age, sex, weigth, height);
    }

    public boolean esMayor(Person p) {
        return p.getAge() >= 18;
    }

    public int calcularIMC(Person p) {
        double peso = p.getWeigth();
        double altura = p.getHeight();
        
        double imc = peso / (altura * altura);
        
        if (imc < 20){
            return -1;
        }else if(imc > 25){
            return 1; 
        }else{
            return 0;
        }
        
    }

}
