package uber.entidades;

public class User extends Account {

    public User(String name, String document, String email, String password) {
        super(name, document, email, password);
    }

    
    
    public void printDataUser(){
        System.out.println("Usuario: " +super.getName()+ " Document: "+super.getDocument());
    }
    
}
