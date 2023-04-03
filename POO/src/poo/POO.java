package poo;

import Entidades.Person;
import service.PersonaService;

public class POO {

    public static void main(String[] args) {
        
        PersonaService personService = new PersonaService();
        
        personService.showDates(new Person("Juan", "Ercole", 28));
        
    }
    
}
