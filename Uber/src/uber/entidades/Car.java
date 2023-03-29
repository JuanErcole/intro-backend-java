package uber.entidades;

public class Car {

    // ATRIBUTOS
    private int id;
    private String license;  // Patente
    private Account driver;  // tiene que ser tipo Account
    private int passenger;
    
    
    //CONSTRUCTOR
    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
        passenger = 4;
    }
    
    
    //METODOS
    public String getLicense() {
        return license;
    }

    public Account getDriver() {
        return driver;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }
    
    
    
    
    //METODOS OPERACIONALES
    public void printDataCar(){
        String name = driver.getName();
        System.out.println("Conductor: " + name + ", Patente: " + license + ", Cantidad de pasajeros: " + passenger);
    }
    
     
}
