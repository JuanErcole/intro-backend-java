package uber;

import uber.entidades.Account;
import uber.entidades.Car;
import uber.entidades.UberVan;
import uber.entidades.UberX;

public class Uber {

    public static void main(String[] args) {
        
        System.out.println("Buscando un socio de la app...");
        UberX ux1 = new UberX("123asd123", new Account("Rodrigo Bastidas", "38647616", "rolo@google.com", "contraseña123"), "Fiat", "Siena");
        ux1.setPassenger(4);
        System.out.println("socio encontrado");
        ux1.printDataCar();
        
        System.out.println("Busando Uber Van");
        UberVan uv1 = new UberVan("423asd234", new Account("Rodrigo Bastidas", "38647616", "rolo@google.com", "contraseña123"), "Mercedez-Benz", "Mini Bus" );
        
        System.out.println("Uber Van encontrado");
        uv1.printDataCar();
        
        
    }
    
}
