package clasesutilidad.entities;

import java.util.Date;


public class Person {

    
    // ATRIBUTOS
    private String name;
    private Date nacimiento;

    
    // CONSTRUCTORES
    public Person() {
    }

    public Person(String name, Date nacimiento) {
        this.name = name;
        this.nacimiento = nacimiento;
    }
    
    
    // METODOS 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", nacimiento=" + nacimiento + '}';
    }
    
    
    
}


























