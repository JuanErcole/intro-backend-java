package uber.entidades;


public class UberX extends Car {
    
    private String brand;    
    private String model;

    public UberX(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
    
    @Override
    public void printDataCar(){
        String name = super.getDriver().getName();
        String license = super.getLicense();
        int passenger = super.getPassenger();
        
        System.out.println("Conductor: " + name + ", Patente: " + license );
        System.out.println("Marca: " + brand + ", Modelo: " + model + ", Cantidad de pasajeros: " + passenger );
        
        
    }

    
    
        
}
