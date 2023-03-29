package uber.entidades;

import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {

    private String brand;
    private String model;
    private Map<String, Map<String, Integer>> typeCarAccepted;
    private ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver, String brand, String model) {
        super(license, driver);
        super.setPassenger(6);
        this.brand = brand;
        this.model = model;

//        this.typeCarAccepted = typeCarAccepted;
//        this.seatsMaterial = seatsMaterial;
    }


}
