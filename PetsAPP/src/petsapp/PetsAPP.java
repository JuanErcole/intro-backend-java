package petsapp;

import petsapp.entities.Pet;
import petsapp.services.PetService;

public class PetsAPP {

    public static void main(String[] args) {
        
        PetService petServices = new PetService();
        
        petServices.createPet();
        
    }
    
}
