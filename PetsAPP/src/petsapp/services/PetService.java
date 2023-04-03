package petsapp.services;

import java.awt.Color;
import java.util.Scanner;
import petsapp.entities.Pet;

public class PetService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n"); // mala practica  ---  

    public Pet createPet() {

        //Pet m = new Pet();

        System.out.println("Ingrese nombre del animal");
        String name = leer.next();
        //m.setName(leer.nextLine());

        System.out.println("Ingrese el apodo del animal");
        String nickName = leer.next();
        //m.setNickname(leer.nextLine());

        System.out.println("Ingrese la edad del animal");
        int age = leer.nextInt();
        //m.setAge(leer.nextInt());

        System.out.println("Ingrese el color del animal");
        String color = leer.next();
        //m.setColor(leer.nextLine());

        System.out.println("Ingrese el tipo del animal");
        String animalType = leer.next();
        //m.setAnimalType(leer.nextLine());

        System.out.println("Ingrese la raza del animal");
        String breed = leer.next();
        //m.setBreed(leer.nextLine());

        System.out.println("Tiene cola el animal?");
        boolean tail = leer.nextBoolean();
        //m.setTail(leer.nextBoolean());

        return new Pet(name, nickName, animalType, color, age, tail, breed);

    }

}
