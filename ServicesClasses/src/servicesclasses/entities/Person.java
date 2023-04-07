package servicesclasses.entities;


public class Person {

    //ATRIBUTOS 
    private String name;
    private int age;
    private char sex;
    private double weigth;
    private double height;
    

    //CONSTRUCTORES
    

    public Person(String name, int age, char sex, double weigth, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weigth = weigth;
        this.height = height;
    }

    public Person() {
    }
    
    
    // METODOS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSexo() {
        return sex;
    }

    public void setSexo(char sexo) {
        this.sex = sexo;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
}






