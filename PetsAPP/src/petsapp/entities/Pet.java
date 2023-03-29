package petsapp.entities;

public class Pet {
    
    private String name;
    private String nickname;
    // Conejo, Gato, Perro, etc..
    private String animalType;    
    private String color;
    private int age;
    private boolean tail;
    private String breed; // raza
    private int energy;
    
    public Pet() {
        energy = 1000;
    }
    
    public Pet(String name, String nickname, String animalType, String color, int age, boolean tail, String breed) {
        this.name = name;
        this.nickname = nickname;
        this.animalType = animalType;
        this.color = color;
        this.age = age;
        this.tail = tail;
        this.breed = breed;
        
        this.energy = 1000;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }   
    
    public int pasear( int energyConsumption){
        
        if(energy < energyConsumption){
            return -1;
        }
        
        energy -= energyConsumption;
        
        return energy;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", nickname=" + nickname + ", animalType=" + animalType + ", color=" + color + ", age=" + age + ", tail=" + tail + ", breed=" + breed + ", Energy=" + energy + '}';
    }
    
    
}
