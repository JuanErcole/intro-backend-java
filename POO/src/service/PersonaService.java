package service;

import Entidades.Person;


public class PersonaService {

    public void showDates(Person person ){
        
        System.out.println("Name: " +person.getName()+ " Last name: " +person.getLastName()+ " Age: " +person.getAge());
    }
    
}
