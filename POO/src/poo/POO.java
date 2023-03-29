package poo;

import Entidades.Person;

public class POO {

    public static void main(String[] args) {
        
        Person Persona1 = new Person("Juan", "Ercole", 28);
        
        Person Persona2 = new Person();
        
        Persona1.setName("Alan");
        Persona2.setName("Juan");
        
        System.out.println(Persona2.getName());
        
    }
    
}
