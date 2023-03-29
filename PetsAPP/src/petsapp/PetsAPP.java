package petsapp;

import petsapp.entities.Pet;

public class PetsAPP {

    public static void main(String[] args) {
        
        Pet m1 = new Pet("Jaime", "chicharo", "Perro", "Black", 6, true, "Beagle");
        
        String petName = m1.getName();
        String petBreed = m1.getBreed();
        
        System.out.println(m1.pasear(658));
        System.out.println( m1.toString() );
        
    }
    
}
